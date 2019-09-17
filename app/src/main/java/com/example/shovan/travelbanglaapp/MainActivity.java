package com.example.shovan.travelbanglaapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    ProgressBar pBar;
    int progressStatus = 0;
    Handler hn = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pBar = (ProgressBar)findViewById(R.id.progressBar);


        new Thread(new Runnable() {

            @Override
            public void run(){
                for(int i=0; i<5;i++){
                    progressStatus += 20;

                    hn.post(new Runnable() {
                        @Override
                        public void run() {
                            pBar.setProgress(progressStatus);
                            if(progressStatus == 100){
                                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                                finish();
                            }
                        }
                    });
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e){

                    }
                }

            }
        }).start();
    }
}
