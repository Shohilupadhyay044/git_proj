package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll5);
    }

    public void Drink(View view) {

        Intent intent = new Intent(ScrollActivity5.this,ScrollActivity6.class);
        startActivity(intent);
        finish();
    }
}