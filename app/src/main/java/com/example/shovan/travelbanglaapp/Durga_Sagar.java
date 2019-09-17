package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Durga_Sagar extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durga__sagar);

        tv= (TextView)findViewById(R.id.durgadetails);

        tv.setText(mys.findDetails("durga_sagar"));
    }
}
