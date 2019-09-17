package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Rangpur_Zoo extends AppCompatActivity {


    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__zoo);

        tv= (TextView)findViewById(R.id.zoodetails);

        tv.setText(mys.findDetails("rangpur_zoo"));
    }
}
