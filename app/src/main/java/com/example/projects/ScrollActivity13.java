package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll13);
    }


    public void Earth(View view) {
        Intent intent = new Intent(ScrollActivity13.this, ScrollActivity11.class);
        startActivity(intent);
    }
    public void star(View view) {

        Intent intent = new Intent(ScrollActivity13.this,ScrollActivity12.class);
        startActivity(intent);
    }


    public void aisle(View view) {
        Intent intent = new Intent(ScrollActivity13.this,ScrollActivity10.class);
        startActivity(intent);

    }
}