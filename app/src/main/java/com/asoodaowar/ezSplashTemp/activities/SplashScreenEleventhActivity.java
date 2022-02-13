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

public class SplashScreenEleventhActivity extends AppCompatActivity {

    Animation anim_top,anim_LtoR;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_eleventh);

        imageView = findViewById(R.id.image_1);
        textView = findViewById(R.id.title);

        anim_top = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        anim_LtoR = AnimationUtils.loadAnimation(this,R.anim.left_to_right_animation);

        imageView.setAnimation(anim_top);
        textView.setAnimation(anim_LtoR);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();

            }
        }, 5000);

    }
}
