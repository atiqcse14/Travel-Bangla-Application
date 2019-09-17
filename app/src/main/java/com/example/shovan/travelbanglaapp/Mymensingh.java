package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mymensingh extends AppCompatActivity {

    MySQLite mydb;
    Button zainull,shoshii,botanicall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymensingh);

        mydb = new MySQLite(this);

        zainull = (Button)findViewById(R.id.zainul);
        zainull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mymensingh.this,Zainul_Abedin_Museum.class));
            }
        });

        shoshii = (Button)findViewById(R.id.shoshi);
        shoshii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mymensingh.this,Shoshi_Lodge.class));
            }
        });

        botanicall = (Button)findViewById(R.id.botanical);
        botanicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mymensingh.this,Botanical_Garden.class));
            }
        });

    }
}
