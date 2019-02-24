package com.example.saarc1.bookwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class course_selector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_selector);

        Button button1 = findViewById(R.id.engg);
        Button button2 = findViewById(R.id.bcom);
        Button button3 = findViewById(R.id.puc);
        Button button4 = findViewById(R.id.med);
        Button button5 = findViewById(R.id.bed);
        Button button6 = findViewById(R.id.bsc);
        Button button7 = findViewById(R.id.bba);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(course_selector.this,engg_selection.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(course_selector.this,bcom_selection.class);
                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(course_selector.this,addbook_sem3.class);
                startActivity(intent3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(course_selector.this,addbook_sem4.class);
                startActivity(intent4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(course_selector.this,addbook_sem5.class);
                startActivity(intent5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(course_selector.this,addbook_sem6.class);
                startActivity(intent6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(course_selector.this,addbook_sem6.class);
                startActivity(intent7);
            }
        });
    }
}
