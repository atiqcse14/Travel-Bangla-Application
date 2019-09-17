package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Shilaidaha_Kuthibari extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shilaidaha__kuthibari);

        tv= (TextView)findViewById(R.id.shilaidahadetails);

        tv.setText(mys.findDetails("shilaidaha"));
    }
}
