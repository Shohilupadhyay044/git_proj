package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class Scroll_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_);
    }



    public void nextActivity(View view) {
       Intent intent = new Intent(Scroll_Activity.this,Scroll2_Activity.class);
       startActivity(intent);
       finish();
    }
}