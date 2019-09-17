package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mahastangarh extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahastangarh);

        tv= (TextView)findViewById(R.id.mahastandetails);

        tv.setText(mys.findDetails("mahastangarh"));
    }
}
