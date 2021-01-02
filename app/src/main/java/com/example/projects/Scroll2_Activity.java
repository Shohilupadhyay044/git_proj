package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Scroll2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll2_);
    }

    public void ForFaith(View view) {
        Intent intent = new Intent(Scroll2_Activity.this,ScrollActivity3.class);
        startActivity(intent);
        finish();

    }
}