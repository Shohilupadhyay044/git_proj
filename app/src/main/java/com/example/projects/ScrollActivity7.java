package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll7);
    }

    public void Qualification(View view) {
        Intent intent = new Intent(ScrollActivity7.this,ScrollActivity8.class);
        startActivity(intent);
        finish();
    }
}