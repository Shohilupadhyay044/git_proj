package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll3);
    }

    public void Language(View view) {
        Intent intent = new Intent(ScrollActivity3.this,ScrollActivity4.class);
        startActivity(intent);
        finish();
    }
}