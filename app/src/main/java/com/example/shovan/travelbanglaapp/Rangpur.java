package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rangpur extends AppCompatActivity {

    MySQLite mydb;
    Button binodonn,zooo,tajhatt,townn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rangpur);

        mydb = new MySQLite(this);

        binodonn = (Button)findViewById(R.id.binodon);
        binodonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rangpur.this,Binodon_Uddyan.class));
            }
        });

        zooo = (Button)findViewById(R.id.zoo);
        zooo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rangpur.this,Rangpur_Zoo.class));
            }
        });

        tajhatt = (Button)findViewById(R.id.tajhat);
        tajhatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rangpur.this,Tajhat_Palace.class));
            }
        });

        townn = (Button)findViewById(R.id.town);
        townn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rangpur.this,Town_Hall.class));
            }
        });

    }
}
