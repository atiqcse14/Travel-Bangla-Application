package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Bagha_Mosque extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagha__mosque);

        tv= (TextView)findViewById(R.id.baghadetails);

        tv.setText(mys.findDetails("bagha_mosque"));
    }
}
