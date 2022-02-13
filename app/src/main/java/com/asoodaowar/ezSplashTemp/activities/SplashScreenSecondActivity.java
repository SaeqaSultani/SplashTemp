package com.asoodaowar.ezSplashTemp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.asoodaowar.ezSplashTemp.R;

import yanzhikai.textpath.AsyncTextPathView;
import yanzhikai.textpath.SyncTextPathView;
import yanzhikai.textpath.painter.ArrowPainter;
import yanzhikai.textpath.painter.AsyncPathPainter;
import yanzhikai.textpath.painter.PenPainter;

public class SplashScreenSecondActivity extends AppCompatActivity {

    private AsyncTextPathView asyncTextPathView_1,asyncTextPathView_2;
    private SyncTextPathView syncTextPathView_wish,syncTextPathView_fortune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_second);

        asyncTextPathView_1 = findViewById(R.id.atpv_1);
        asyncTextPathView_2 = findViewById(R.id.atpv_2);
        syncTextPathView_wish = findViewById(R.id.stpv_wish);
        syncTextPathView_fortune = findViewById(R.id.stpv_fortune);



        asyncTextPathView_2.setPathPainter(new AsyncPathPainter() {
            @Override
            public void onDrawPaintPath(float x, float y, Path paintPath) {
                paintPath.addCircle(x,y,6, Path.Direction.CCW);
            }
        });

        asyncTextPathView_2.startAnimation(0,1);
        asyncTextPathView_1.startAnimation(0,1);
        syncTextPathView_wish.startAnimation(0,1);
        syncTextPathView_fortune.startAnimation(0,1);


        syncTextPathView_fortune.setPathPainter(new PenPainter());
        syncTextPathView_wish.setPathPainter(new ArrowPainter());

        syncTextPathView_fortune.setFillColor(true);
        syncTextPathView_wish.setFillColor(true);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();

            }
        }, 10000);
    }
}
