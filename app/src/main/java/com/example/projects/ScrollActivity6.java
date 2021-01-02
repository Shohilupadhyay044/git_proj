package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll6);
    }

    public void Study(View view) {
        Intent intent = new Intent(ScrollActivity6.this,ScrollActivity7.class);
        startActivity(intent);
        finish();
    }
    }
