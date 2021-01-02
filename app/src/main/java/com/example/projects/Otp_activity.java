package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Otp_activity extends AppCompatActivity {

    TextView textNumber;
    EditText mGetOtp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_activity);

        textNumber = findViewById(R.id.textnumb);
        mGetOtp =findViewById(R.id.getotp);


        getDataFromIntent();
    }

    private void getDataFromIntent() {

        if(getIntent() !=null && getIntent().getExtras() !=null){
            String data = getIntent().getStringExtra("data");
            textNumber.setText(data);
        }

        if(getIntent() !=null && getIntent().getExtras() !=null){
            String data1 = getIntent().getStringExtra("otpget");
            mGetOtp.setText(data1);
        }

    }

    public void continu(View view) {

        Intent intent = new Intent(Otp_activity.this,Photo_Activity.class);
        startActivity(intent);
        finish();
    }
}