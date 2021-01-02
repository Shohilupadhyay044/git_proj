package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Phone_Authentication extends AppCompatActivity {

    EditText metPhone;
    TextView metgetotp;
    Button metButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone__authentication);

        metPhone = findViewById(R.id.etPhone);
        metButton = findViewById(R.id.continueButton);
        metgetotp =findViewById(R.id.otpget);

        metButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isCredentialsValid()) {

                    Intent intent = new Intent(Phone_Authentication.this, Otp_activity.class);
                    intent.putExtra("data", metPhone.getText().toString());
                    intent.putExtra("otpget", metgetotp.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private boolean isCredentialsValid() {

        boolean isDataValid = true;

        if (metPhone.getText().toString().length()!=10) {
            metPhone.setError("Please Enter Valid Phone Number");
            isDataValid = false;
        }

        if (metgetotp.getText().toString().isEmpty()) {
            metgetotp.setError("Please Enter Valid Otp");
            isDataValid = false;
        }

        return isDataValid;
    }
}
