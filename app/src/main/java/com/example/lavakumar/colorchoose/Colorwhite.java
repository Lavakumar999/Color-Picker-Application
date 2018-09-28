package com.example.lavakumar.colorchoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colorwhite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorwhite);
        Button btnbackw=(Button)findViewById(R.id.btnbackw);
        btnbackw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Colorwhite.this,content.class);
                startActivity(intent);
            }
        });
    }
}
