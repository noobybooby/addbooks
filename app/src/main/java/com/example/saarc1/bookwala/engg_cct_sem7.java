package com.example.saarc1.bookwala;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

public class engg_cct_sem7 extends AppCompatActivity {

    Button addBtn;
    EditText bookName, bookPrice, bookAuthor, enter_sem;
    public static final int PICK_IMAGE_REQUEST = 1;
    private Button addImgBtn;
    private ImageView bookImage;

    private String name;
    private String mLoc;

    private Uri mImageUri;
    private StorageTask uploadTask;

    DatabaseReference databaseBooks;
    StorageReference storageReference;
    private String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbook_cct);


        databaseBooks = FirebaseDatabase.getInstance().getReference("book").child("Engineering").child("branch").child("CCT").child("sem7");
        storageReference = FirebaseStorage.getInstance().getReference("booksImages");

        bookName = (EditText) findViewById(R.id.bookName);
        bookPrice = (EditText) findViewById(R.id.bookPrice);
        bookAuthor = (EditText) findViewById(R.id.bookAuthor);
        addImgBtn = findViewById(R.id.addBookImg);
        bookImage = findViewById(R.id.book_img);


        addImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFileChooser();
            }
        });



        addBtn = (Button) findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addBook();
            }
        });


    }

    private String getFileExtention (Uri uri) {

        ContentResolver cR = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri)) ;
    }

    private void openFileChooser(){

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {

            mImageUri = data.getData();
            Picasso.get().load(mImageUri).into(bookImage);
        }
    }

    private void addBook(){


        if (mImageUri != null && TextUtils.isEmpty(name)) {

            final StorageReference fileReference = storageReference.child(System.currentTimeMillis() + "." + getFileExtention(mImageUri));

              fileReference.putFile(mImageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                            fileReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    Uri imageUrl = uri;

                                     name = bookName.getText().toString();
                                    String price = bookPrice.getText().toString();
                                    String author = bookAuthor.getText().toString();

                                    String id = databaseBooks.push().getKey();
                                    Book book = new Book(id,name,price,author,imageUrl.toString());

                                    databaseBooks.child(id).setValue(book);

                                    Toast.makeText(engg_cct_sem7.this, "upload hogayi", Toast.LENGTH_LONG).show();
                                }
                            });


                        }
                    });




        } else {

            Toast.makeText(engg_cct_sem7.this, "Nai hua Upload, Aur ek baar karo ", Toast.LENGTH_LONG).show();
        }


    }


}
