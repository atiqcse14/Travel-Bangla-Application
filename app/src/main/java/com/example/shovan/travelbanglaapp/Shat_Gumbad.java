package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Shat_Gumbad extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shat__gumbad);

        tv= (TextView)findViewById(R.id.shatdetails);

        tv.setText(mys.findDetails("shat_gumbad"));

    }
}
