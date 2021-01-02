package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ScrollActivity10 extends AppCompatActivity {

    ImageView imageV;
    CardView cardView;
    Button Likes;
    Button Likes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll10);

        imageV=findViewById(R.id.setv);
        cardView=findViewById(R.id.cardv);
        Likes=findViewById(R.id.likes);
        Likes2=findViewById(R.id.likes2);


    }

    public void Earth(View view) {

        Intent intent = new Intent(ScrollActivity10.this,ScrollActivity11.class);
        startActivity(intent);
    }

    public void star(View view) {

        Intent intent = new Intent(ScrollActivity10.this,ScrollActivity12.class);
        startActivity(intent);
    }

    public void heart(View view) {
        Intent intent = new Intent(ScrollActivity10.this,ScrollActivity13.class);
        startActivity(intent);
    }

    public void ImageVisible(View view) {
        imageV.setVisibility(View.INVISIBLE);
        cardView.setVisibility(View.INVISIBLE);
    }

    public void circleheart(View view) {
        Likes.setBackgroundColor(Color.parseColor("#E75480"));
    }

    public void Likes2(View view) {
       Likes2.setBackgroundColor(Color.parseColor("E75480"));
    }
}

