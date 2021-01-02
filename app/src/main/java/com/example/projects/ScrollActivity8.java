package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll8);
    }

    public void Job(View view) {
       Intent intent = new Intent(ScrollActivity8.this,Laststep.class);
        startActivity(intent);
        finish();
    }
}