package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Khulna extends AppCompatActivity {

    MySQLite mydb;
    Button sundar,shat,shilai,lalon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.khulna);

        mydb = new MySQLite(this);

        sundar = (Button)findViewById(R.id.sundarban);
        sundar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Khulna.this,Sundarban.class));
            }
        });

        shat = (Button)findViewById(R.id.shat);
        shat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Khulna.this,Shat_Gumbad.class));
            }
        });

        shilai = (Button)findViewById(R.id.shilaidaha);
        shilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Khulna.this,Shilaidaha_Kuthibari.class));
            }
        });

        lalon = (Button)findViewById(R.id.lalon);
        lalon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Khulna.this,Lalon_Mazaar.class));
            }
        });


    }
}
