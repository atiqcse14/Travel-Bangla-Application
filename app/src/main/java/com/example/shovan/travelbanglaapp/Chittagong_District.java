package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Chittagong_District extends AppCompatActivity {


    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__district);

        tv= (TextView)findViewById(R.id.ctgdetails);

        tv.setText(mys.findDetails("chittagong_district"));
    }
}
