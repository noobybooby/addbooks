package com.example.saarc1.bookwala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Map;

public class viewOrders extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private ListView userlist;

    private ArrayList<String> muserid = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);





    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseReference = FirebaseDatabase.getInstance().getReference().child("orders");

        String userid = FirebaseAuth.getInstance().getCurrentUser().getUid();

        userlist = (ListView) findViewById(R.id.cart_list);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,muserid);

        userlist.setAdapter(arrayAdapter);

        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot,String s) {
                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();

                String value = String.valueOf(map);
                muserid.add(value);

                arrayAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged( DataSnapshot dataSnapshot,  String s) {

             }

            @Override
            public void onChildRemoved( DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved( DataSnapshot dataSnapshot,  String s) {

            }

            @Override
            public void onCancelled( DatabaseError databaseError) {

            }
        });



    }
}
