package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollActivity11 extends AppCompatActivity {

    Button Likes3;
    Button Likes4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll11);

        Likes3= findViewById(R.id.likes3);
        Likes4= findViewById(R.id.likes4);
    }



    public void heart(View view) {
        Intent intent = new Intent(ScrollActivity11.this,ScrollActivity13.class);
        startActivity(intent);
    }

    public void home(View view) {
    }

    public void aisle(View view) {
        Intent intent = new Intent(ScrollActivity11.this,ScrollActivity10.class);
        startActivity(intent);

    }

    public void star(View view) {

        Intent intent = new Intent(ScrollActivity11.this,ScrollActivity12.class);
        startActivity(intent);
    }

    public void Likes3(View view) {

        Likes3.setBackgroundColor(Color.parseColor("#E75480"));
    }

    public void Likes4(View view) {
        Likes4.setBackgroundColor(Color.parseColor("#E75480"));
    }
}