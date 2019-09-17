package com.example.shovan.travelbanglaapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {




    private Button dhkBtn, ctgBtn,barBtn,rngBtn,sylBtn,rajBtn,khlBtn,mymnBtn,srchBtn;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        MySQLite mys = new MySQLite(this);

        dhkBtn = (Button) findViewById(R.id.DhakaBtn);
        ctgBtn = (Button) findViewById(R.id.CtgBtn);
        barBtn = (Button) findViewById(R.id.BarisalBtn);
        rngBtn = (Button) findViewById(R.id.RangpurBtn);
        sylBtn = (Button) findViewById(R.id.SylhetBtn);
        rajBtn = (Button) findViewById(R.id.RajBtn);
        khlBtn = (Button) findViewById(R.id.KhulnaBtn);
        mymnBtn = (Button)findViewById(R.id.MymensinghBtn);
        srchBtn = (Button) findViewById(R.id.searchBtn);

        txt = (EditText) findViewById(R.id.etext);



        srchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txt.getText().toString();

                if(name.equals("chittagong"))
                    startActivity(new Intent(SecondActivity.this, Chittagong.class));

                else if (name.equals("dhaka"))
                    startActivity(new Intent(SecondActivity.this, Dhaka.class));

                else if (name.equals("rajshahi"))
                    startActivity(new Intent(SecondActivity.this, Rajshahi.class));

                else if (name.equals("khulna"))
                    startActivity(new Intent(SecondActivity.this, Khulna.class));

                else if (name.equals("barisal"))
                    startActivity(new Intent(SecondActivity.this, Barisal.class));

                else if (name.equals("sylhet"))
                    startActivity(new Intent(SecondActivity.this, Sylhet.class));

                else if (name.equals("rangpur"))
                    startActivity(new Intent(SecondActivity.this, Rangpur.class));

                else if (name.equals("mymensingh"))
                    startActivity(new Intent(SecondActivity.this, Mymensingh.class));

                else if (name.equals("ahsan manjil"))
                    startActivity(new Intent(SecondActivity.this, Ahsan_Manjil.class));

                else if (name.equals("lalbag"))
                    startActivity(new Intent(SecondActivity.this, Lalbag.class));

                else if (name.equals("dhanmondi lake"))
                    startActivity(new Intent(SecondActivity.this, Dhanmondi_Lake.class));

                else if (name.equals("dhakeswari temple"))
                    startActivity(new Intent(SecondActivity.this, Dhakeswari_Temple.class));

                else if (name.equals("tara mosque"))
                    startActivity(new Intent(SecondActivity.this, Tara_Mosque.class));

                else if (name.equals("parliament building"))
                    startActivity(new Intent(SecondActivity.this, Parliament_Building.class));

                else if (name.equals("chittagong district"))
                    startActivity(new Intent(SecondActivity.this, Chittagong_District.class));

                else if (name.equals("coxbazar"))
                    startActivity(new Intent(SecondActivity.this, Coxbazar.class));

                else if (name.equals("bandarban"))
                    startActivity(new Intent(SecondActivity.this, Bandarban.class));

                else if (name.equals("khagrachari"))
                    startActivity(new Intent(SecondActivity.this, Khagrachari.class));

                else if (name.equals("kaptai"))
                    startActivity(new Intent(SecondActivity.this, Kaptai.class));

                else if (name.equals("sitakunda"))
                    startActivity(new Intent(SecondActivity.this, Sitakunda.class));

                else if (name.equals("puthia temple"))
                    startActivity(new Intent(SecondActivity.this, Puthia_Temple.class));

                else if (name.equals("mahastangarh"))
                    startActivity(new Intent(SecondActivity.this, Mahastangarh.class));

                else if (name.equals("bagha mosque"))
                    startActivity(new Intent(SecondActivity.this, Bagha_Mosque.class));

                else if (name.equals("ramsagar park"))
                    startActivity(new Intent(SecondActivity.this, Ramsagar_Park.class));

                else if (name.equals("sundarban"))
                    startActivity(new Intent(SecondActivity.this, Sundarban.class));

                else if (name.equals("shat gumbad mosque"))
                    startActivity(new Intent(SecondActivity.this, Shat_Gumbad.class));

                else if (name.equals("shilaidaha kuthibari"))
                    startActivity(new Intent(SecondActivity.this, Shilaidaha_Kuthibari.class));

                else if (name.equals("lalon shah mazaar"))
                    startActivity(new Intent(SecondActivity.this, Lalon_Mazaar.class));

                else if (name.equals("kuakata"))
                    startActivity(new Intent(SecondActivity.this, Kuakata.class));

                else if (name.equals("guthia mosque"))
                    startActivity(new Intent(SecondActivity.this, Guthia_Mosque.class));

                else if (name.equals("durga sagar"))
                    startActivity(new Intent(SecondActivity.this, Durga_Sagar.class));

                else if (name.equals("lebur char"))
                    startActivity(new Intent(SecondActivity.this, Lebur_Char.class));

                else if (name.equals("jaflong"))
                    startActivity(new Intent(SecondActivity.this, Jaflong.class));

                else if (name.equals("bisanakandi"))
                    startActivity(new Intent(SecondActivity.this, Bisanakandi.class));

                else if (name.equals("shahjalal dorgha"))
                    startActivity(new Intent(SecondActivity.this, Shahjalal_Dorgha.class));

                else if (name.equals("ratargul"))
                    startActivity(new Intent(SecondActivity.this, Ratargul.class));

                else if (name.equals("tajhat palace"))
                    startActivity(new Intent(SecondActivity.this, Tajhat_Palace.class));

                else if (name.equals("town hall"))
                    startActivity(new Intent(SecondActivity.this, Town_Hall.class));

                else if (name.equals("rangpur zoo"))
                    startActivity(new Intent(SecondActivity.this, Rangpur_Zoo.class));

                else if (name.equals("binodon uddyan"))
                    startActivity(new Intent(SecondActivity.this, Binodon_Uddyan.class));

                else if (name.equals("zainul abedin museum"))
                    startActivity(new Intent(SecondActivity.this, Zainul_Abedin_Museum.class));

                else if (name.equals("shoshi lodge"))
                    startActivity(new Intent(SecondActivity.this, Shoshi_Lodge.class));

                else if (name.equals("botanical garden"))
                    startActivity(new Intent(SecondActivity.this, Botanical_Garden.class));

                else
                    Toast.makeText(getApplicationContext(),"Not Found",Toast.LENGTH_SHORT).show();
            }
        });




        ctgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Chittagong.class));
            }
        });

        dhkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Dhaka.class));
            }
        });

        rajBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Rajshahi.class));
            }
        });

        khlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Khulna.class));
            }
        });

        barBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Barisal.class));
            }
        });


        sylBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Sylhet.class));
            }
        });


        rngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Rangpur.class));
            }
        });

        mymnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Mymensingh.class));
            }
        });


    }


        @Override
        public void onBackPressed() {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.exit)
                    .setTitle("Exit")
                    .setMessage("Are you sure to EXIT?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                        }
                    })
                    .setNegativeButton("No",null)
                    .show();
        }





}
