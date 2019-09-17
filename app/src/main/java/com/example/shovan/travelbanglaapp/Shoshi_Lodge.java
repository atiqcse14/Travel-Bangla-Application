package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Shoshi_Lodge extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoshi__lodge);

        tv= (TextView)findViewById(R.id.shoshidetails);

        tv.setText(mys.findDetails("shoshi_lodge"));
    }
}
