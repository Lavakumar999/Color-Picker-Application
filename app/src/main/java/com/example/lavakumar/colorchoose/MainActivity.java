package com.example.lavakumar.colorchoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnpress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btnpress=(Button)findViewById(R.id.btnpress);
        btnpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpress=new Intent(MainActivity.this,content.class);
                startActivity(intentpress);

            }
        });
        final Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                btnpress.startAnimation(anim);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                btnpress.startAnimation(anim);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btnpress.startAnimation(anim);
    }
}
