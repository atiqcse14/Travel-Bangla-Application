package com.example.shovan.travelbanglaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chittagong extends AppCompatActivity {

    MySQLite mydb;
    Button cox,ctg,bandarban,khagra,kaptai,sitakunda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chittagong);

        mydb = new MySQLite(this);

        cox = (Button)findViewById(R.id.coxb);
        cox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chittagong.this,Coxbazar.class));
            }
        });

        ctg = (Button)findViewById(R.id.chit);
        ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chittagong.this,Chittagong_District.class));
            }
        });

        bandarban = (Button)findViewById(R.id.bandr);
        bandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chittagong.this,Bandarban.class));
            }
        });

        khagra = (Button)findViewById(R.id.khag);
        khagra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chittagong.this,Khagrachari.class));
            }
        });

        kaptai = (Button)findViewById(R.id.kap);
        kaptai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chittagong.this,Kaptai.class));
            }
        });

        sitakunda = (Button)findViewById(R.id.sitakunda);
        sitakunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chittagong.this,Sitakunda.class));
            }
        });

    }



}
