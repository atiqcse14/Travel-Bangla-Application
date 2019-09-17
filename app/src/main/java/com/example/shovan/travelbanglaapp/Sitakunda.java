package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sitakunda extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitakunda);

        tv= (TextView)findViewById(R.id.sitakundadetails);

        tv.setText(mys.findDetails("sitakunda"));
    }
}
