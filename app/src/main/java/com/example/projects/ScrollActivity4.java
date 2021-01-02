package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll4);
    }

    public void Smoke(View view) {

        Intent intent = new Intent(ScrollActivity4.this,ScrollActivity5.class);
        startActivity(intent);
        finish();
    }
}