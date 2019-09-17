package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barisal extends AppCompatActivity {

    MySQLite mydb;
    Button kuakataa,guthiaa,durgaa,leburr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barisal);

        mydb = new MySQLite(this);

        kuakataa = (Button)findViewById(R.id.kuakata);
        kuakataa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Barisal.this,Kuakata.class));
            }
        });

        guthiaa = (Button)findViewById(R.id.guthia);
        guthiaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Barisal.this,Guthia_Mosque.class));
            }
        });

        durgaa = (Button)findViewById(R.id.durga);
        durgaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Barisal.this,Durga_Sagar.class));
            }
        });

        leburr = (Button)findViewById(R.id.lebur);
        leburr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Barisal.this,Lebur_Char.class));
            }
        });
    }
}
