package com.example.shovan.travelbanglaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Zainul_Abedin_Museum extends AppCompatActivity {

    MySQLite mys = new MySQLite(this);
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zainul__abedin__museum);

        tv= (TextView)findViewById(R.id.zainuldetails);

        tv.setText(mys.findDetails("zainul_abedin_museum"));
    }
}
