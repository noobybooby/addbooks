package com.example.saarc1.bookwala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ec_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_engg_sem);
        Button button1 = findViewById(R.id.sem_1);
        Button button2 = findViewById(R.id.sem_2);
        Button button3 = findViewById(R.id.sem_3);
        Button button4 = findViewById(R.id.sem_4);
        Button button5 = findViewById(R.id.sem_5);
        Button button6 = findViewById(R.id.sem_6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ec_selection.this,engg_cs_sem3.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ec_selection.this,engg_cs_sem4.class);
                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ec_selection.this,engg_cs_sem5.class);
                startActivity(intent3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(ec_selection.this,engg_cs_sem6.class);
                startActivity(intent4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(ec_selection.this,engg_cs_sem7.class);
                startActivity(intent5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(ec_selection.this,engg_cs_sem8.class);
                startActivity(intent6);
            }
        });
    }
}
