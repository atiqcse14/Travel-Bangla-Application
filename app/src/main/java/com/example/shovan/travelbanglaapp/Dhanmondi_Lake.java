package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dhanmondi_Lake extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhanmondi__lake);

        tv= (TextView)findViewById(R.id.dhanmondidetails);

        tv.setText(mys.findDetails("dhanmondi_lake"));
    }
}
