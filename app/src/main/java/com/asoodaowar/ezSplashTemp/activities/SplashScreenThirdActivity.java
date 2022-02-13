package com.asoodaowar.ezSplashTemp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.asoodaowar.ezSplashTemp.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenThirdActivity extends AppCompatActivity {

    ProgressBar progressBar;
    Timer timer;
    Handler handler;
    Runnable runnable;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_thired);


        progressBar = findViewById(R.id.progress);
        progressBar.setProgress(0);
        progressBar.setMax(100);


        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

                if (++i<=100){

                    progressBar.setProgress(i);

                }else {

                    timer.cancel();
                }
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                handler.post(runnable);
            }
        },100,100);


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();

            }
        }, 10000);
    }
}