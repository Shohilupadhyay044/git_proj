package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll12);


    }

    public void Earth(View view) {
        Intent intent = new Intent(ScrollActivity12.this, ScrollActivity11.class);
        startActivity(intent);
    }

    public void heart(View view) {
        Intent intent = new Intent(ScrollActivity12.this, ScrollActivity13.class);
        startActivity(intent);
    }

    public void aisle(View view) {
        Intent intent = new Intent(ScrollActivity12.this, ScrollActivity10.class);
        startActivity(intent);
    }
}