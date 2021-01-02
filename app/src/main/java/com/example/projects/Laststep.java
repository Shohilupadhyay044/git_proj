package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Laststep extends AppCompatActivity {

    TextView textView;
    TextView luddite;
    TextView Handy;
    TextView Doo;
    TextView libral;
    TextView Cons;
    TextView india;
    TextView abroad;
    TextView passive;
    TextView aggressive;
    Button buttonn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laststep);

        textView = findViewById(R.id.tech);
        luddite = findViewById(R.id.luddite);
        Handy =findViewById(R.id.Handyman);
        Doo =findViewById(R.id.Do);
        libral=findViewById(R.id.Libral);
        Cons=findViewById(R.id.cons);
        india=findViewById(R.id.India);
        abroad=findViewById(R.id.Abroad);
        passive=findViewById(R.id.Passive);
        aggressive=findViewById(R.id.Aggressive);
        buttonn= findViewById(R.id.btnnext);



        Handy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Handy.setBackgroundColor(Color.parseColor("#9400D3"));
                Doo.setEnabled(false);

            }
        });

        Doo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Doo.setBackgroundColor(Color.parseColor("#9400D3"));
                Handy.setEnabled(false);

            }
        });

        libral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                libral.setBackgroundColor(Color.parseColor("#9400D3"));
                Cons.setEnabled(false);

            }
        });

        Cons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cons.setBackgroundColor(Color.parseColor("#9400D3"));
                libral.setEnabled(false);

            }
        });

        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                india.setBackgroundColor(Color.parseColor("#9400D3"));
                abroad.setEnabled(false);

            }
        });

        abroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abroad.setBackgroundColor(Color.parseColor("#9400D3"));
                india.setEnabled(false);

            }
        });

        passive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passive.setBackgroundColor(Color.parseColor("#9400D3"));
                aggressive.setEnabled(false);
                buttonn.setBackgroundColor(Color.parseColor("#9400D3"));

            }
        });

        aggressive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aggressive.setBackgroundColor(Color.parseColor("#9400D3"));
                passive.setEnabled(false);
                buttonn.setBackgroundColor(Color.parseColor("#9400D3"));



            }
        });



        luddite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                luddite.setBackgroundColor(Color.parseColor("#9400D3"));
                textView.setEnabled(false);

            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setBackgroundColor(Color.parseColor("#9400D3"));
                luddite.setEnabled(false);

            }
        });
    }







    public void btn(View view) {
        Intent intent = new Intent(Laststep.this, ScrollActivity10.class);
        startActivity(intent);
        finish();
    }

}