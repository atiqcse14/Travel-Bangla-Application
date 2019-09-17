package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sylhet extends AppCompatActivity {

    MySQLite mydb;
    Button jaflongg,bisanakandii,dorghaa,ratargull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sylhet);

        mydb = new MySQLite(this);

        jaflongg = (Button)findViewById(R.id.jaflong);
        jaflongg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sylhet.this,Jaflong.class));
            }
        });

        bisanakandii = (Button)findViewById(R.id.bisanakandi);
        bisanakandii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sylhet.this,Bisanakandi.class));
            }
        });

        dorghaa = (Button)findViewById(R.id.dorgha);
        dorghaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sylhet.this,Shahjalal_Dorgha.class));
            }
        });

        ratargull = (Button)findViewById(R.id.ratargul);
        ratargull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sylhet.this,Ratargul.class));
            }
        });

    }
}
