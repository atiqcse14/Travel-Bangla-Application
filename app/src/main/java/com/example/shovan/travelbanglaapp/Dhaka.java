package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dhaka extends AppCompatActivity {

    MySQLite mydb;
    Button ahsan,lalbag,dhanmndi,dhakes,tara,parliam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhaka);

        mydb = new MySQLite(this);

        ahsan = (Button)findViewById(R.id.ahsanbtn);
        ahsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dhaka.this,Ahsan_Manjil.class));
            }
        });

        lalbag = (Button)findViewById(R.id.lalbag);
        lalbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dhaka.this,Lalbag.class));
            }
        });

        dhanmndi = (Button)findViewById(R.id.dhanmondi);
        dhanmndi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dhaka.this,Dhanmondi_Lake.class));
            }
        });

        dhakes = (Button)findViewById(R.id.dhakeswari);
        dhakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dhaka.this,Dhakeswari_Temple.class));
            }
        });

        tara = (Button)findViewById(R.id.tara);
        tara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dhaka.this,Tara_Mosque.class));
            }
        });

        parliam = (Button)findViewById(R.id.parliament);
        parliam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dhaka.this,Parliament_Building.class));
            }
        });



    }
}
