package com.example.lavakumar.colorchoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorBlue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_blue);
        Button btnbackb=(Button)findViewById(R.id.btnbackb);
        btnbackb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ColorBlue.this,content.class);
                startActivity(intent);
            }
        });
    }
}
