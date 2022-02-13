package com.asoodaowar.ezSplashTemp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.asoodaowar.ezSplashTemp.R;

public class SplashScreenFifteenthActivity extends AppCompatActivity {

    Animation anim_top,anim_bottom;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_fifteenth);

        imageView = findViewById(R.id.image_8);
        textView = findViewById(R.id.text_3);

        anim_top = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        anim_bottom = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView.setAnimation(anim_top);
        textView.setAnimation(anim_bottom);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();

            }
        }, 5000);
    }
}
