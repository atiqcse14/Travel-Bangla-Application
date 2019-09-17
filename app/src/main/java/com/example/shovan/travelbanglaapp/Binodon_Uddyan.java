package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Binodon_Uddyan extends AppCompatActivity {


    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binodon__uddyan);

        tv= (TextView)findViewById(R.id.binodondetails);

        tv.setText(mys.findDetails("binodon_uddyan"));
    }
}
