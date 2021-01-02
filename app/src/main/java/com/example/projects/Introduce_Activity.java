package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Introduce_Activity extends AppCompatActivity {

    EditText SetH1;
    EditText SetH2;
    EditText SetH3;
    Button btnN;
    private Calendar myCalendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce_);

        SetH1 = findViewById(R.id.etFirstName);
        SetH2 = findViewById(R.id.etEmail);
       Spinner spinner =(Spinner)findViewById(R.id.spinner);
        btnN = findViewById(R.id.btnnext);

        final Calendar myCalendar = Calendar.getInstance();

        SetH3= findViewById(R.id.etDob);
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };

        SetH3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(Introduce_Activity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });





        String items[]={"Gender","Male","Female"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,items);

       spinner.setAdapter(arrayAdapter);






        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(isCredentialsValid()){
                    btnN.setBackgroundColor(Color.parseColor("#9400D3"));
                    Intent intent = new Intent(Introduce_Activity.this, Scroll_Activity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }

    private void updateLabel() {

            String myFormat = "MM/dd/yy"; //In which you need put here
            SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        SetH3.setText(sdf.format(myCalendar.getTime()));
        }


    private boolean isCredentialsValid() {

        boolean isDataValid = true;

        if (SetH1.getText().toString().isEmpty()) {
            SetH1.setError("Username can't be empty");
            isDataValid = false;
        }

        if (!SetH2.getText().toString().contains("@gmail.com")) {
            SetH2.setError("Invalid Email id");
            isDataValid = false;


            btnN.setBackgroundColor(Color.parseColor("#9400D3"));
        }

        return isDataValid;
    }
}


