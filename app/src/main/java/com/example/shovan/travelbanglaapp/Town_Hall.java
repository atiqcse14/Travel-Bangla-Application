package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Town_Hall extends AppCompatActivity {


    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town__hall);

        tv= (TextView)findViewById(R.id.towndetails);

        tv.setText(mys.findDetails("town_hall"));
    }
}
