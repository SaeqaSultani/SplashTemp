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

public class SplashScreenThirteenthActivity extends AppCompatActivity {

    Animation anim_LtoR,amim_title,anim_explain;
    TextView tv_title,tv_explain;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_thirteeth);

        tv_title = findViewById(R.id.text_1);
        tv_explain = findViewById(R.id.text_2);
        imageView = findViewById(R.id.image_5);

        anim_LtoR = AnimationUtils.loadAnimation(this,R.anim.left_to_right_animation);
        amim_title = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        anim_explain = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        tv_title.setAnimation(amim_title);
        tv_explain.setAnimation(anim_explain);
        imageView.setAnimation(anim_LtoR);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();

            }
        }, 5000);
    }
}
