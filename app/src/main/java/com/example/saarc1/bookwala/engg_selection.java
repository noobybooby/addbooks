package com.example.saarc1.bookwala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class engg_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_engg);
        Button button1 = findViewById(R.id.sem_1);
        Button button2 = findViewById(R.id.sem_2);
        Button button3 = findViewById(R.id.sem_3);
        Button button4 = findViewById(R.id.sem_4);
        Button button5 = findViewById(R.id.sem_5);
        Button button6 = findViewById(R.id.sem_6);
        Button button7 = findViewById(R.id.sem_7);
        Button button8 = findViewById(R.id.sem_8);
        Button button9 = findViewById(R.id.sem_9);
        Button button10 = findViewById(R.id.sem_10);
        Button button11 = findViewById(R.id.sem_11);
        Button button12 = findViewById(R.id.sem_12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(engg_selection.this,engg_pcycle.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(engg_selection.this,engg_ccycle.class);
                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(engg_selection.this,mech_selection.class);
                startActivity(intent3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(engg_selection.this,civl_selection.class);
                startActivity(intent4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(engg_selection.this,ec_selection.class);
                startActivity(intent5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(engg_selection.this,cs_selection.class);
                startActivity(intent6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(engg_selection.this,ee_selection.class);
                startActivity(intent7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(engg_selection.this,ei_selection.class);
                startActivity(intent8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(engg_selection.this,cct_selection.class);
                startActivity(intent9);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(engg_selection.this,ip_selection.class);
                startActivity(intent10);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(engg_selection.this,au_selection.class);
                startActivity(intent11);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(engg_selection.this,is_selection.class);
                startActivity(intent12);
            }
        });


    }
}
