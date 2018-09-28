package com.example.lavakumar.colorchoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Spinner spincolor=(Spinner)findViewById(R.id.spinner);
        String[] arrcolor={"Choose color","White","Red","Yellow","Blue","Black","Brown","Pink","Violet","Green","Orange"};
        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(content.this,android.R.layout.simple_spinner_item,arrcolor);
        spincolor.setAdapter(dataAdapter);
        spincolor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv=(TextView)view;
                String color=tv.getText().toString();
                Toast.makeText(content.this,"You slected"+color, Toast.LENGTH_SHORT).show();
                if(color=="White")
                {
                    Intent intent=new Intent(content.this,Colorwhite.class);
                    startActivity(intent);
                }
                if(color=="Red")
                {
                    Intent intent=new Intent(content.this,ColorRed.class);
                    startActivity(intent);
                }
                if(color=="Yellow")
                {
                    Intent intent=new Intent(content.this,ColorYellow.class);
                    startActivity(intent);
                }
                if(color=="Blue")
                {
                    Intent intent=new Intent(content.this,ColorBlue.class);
                    startActivity(intent);
                }
                if(color=="Black")
                {
                    Intent intent=new Intent(content.this,ColorBlack.class);
                    startActivity(intent);
                }
                if(color=="Brown")
                {
                    Intent intent=new Intent(content.this,colorBrown.class);
                    startActivity(intent);
                } if(color=="Pink")
                {
                    Intent intent=new Intent(content.this,ColorPink.class);
                    startActivity(intent);
                }
                if(color=="Violet")
                {
                    Intent intent=new Intent(content.this,ColorViolet.class);
                    startActivity(intent);
                }
                if(color=="Green")
                {
                    Intent intent=new Intent(content.this,ColorGreen.class);
                    startActivity(intent);
                }
                if(color=="Orange")
                {
                    Intent intent=new Intent(content.this,ColorOrange.class);
                    startActivity(intent);
                }



            }
        });

        }


    }

