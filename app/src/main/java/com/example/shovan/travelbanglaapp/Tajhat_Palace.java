package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tajhat_Palace extends AppCompatActivity {


    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajhat__palace);

        tv= (TextView)findViewById(R.id.tajhatdetails);

        tv.setText(mys.findDetails("tajhat_palace"));
    }
}
