package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ahsan_Manjil extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahsan_manjil);

        tv= (TextView)findViewById(R.id.ahsandetails);

        tv.setText(mys.findDetails("ahsan_manjil"));

    }
}
