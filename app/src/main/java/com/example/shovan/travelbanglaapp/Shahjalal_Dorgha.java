package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Shahjalal_Dorgha extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shahjalal__dorgha);

        tv= (TextView)findViewById(R.id.dorghadetails);

        tv.setText(mys.findDetails("shahjalal_dorgha"));
    }
}
