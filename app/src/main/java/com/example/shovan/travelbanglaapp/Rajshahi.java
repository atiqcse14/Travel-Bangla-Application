package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rajshahi extends AppCompatActivity {

    MySQLite mydb;
    Button puthiaa,mahastan,baghaa,ramsagr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rajshahi);

        mydb = new MySQLite(this);

        puthiaa = (Button)findViewById(R.id.puthia);
        puthiaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rajshahi.this,Puthia_Temple.class));
            }
        });

        mahastan = (Button)findViewById(R.id.mahasthan);
        mahastan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rajshahi.this,Mahastangarh.class));
            }
        });

        baghaa = (Button)findViewById(R.id.bagha);
        baghaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rajshahi.this,Bagha_Mosque.class));
            }
        });

        ramsagr = (Button)findViewById(R.id.ramsagar);
        ramsagr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rajshahi.this,Ramsagar_Park.class));
            }
        });

    }
}
