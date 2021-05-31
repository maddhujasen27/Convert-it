package com.maddy.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cel_Fah extends AppCompatActivity {
    EditText celsius,fahrenheit;
    Button toFahrenheit, toCelsius;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel__fah);
        celsius = findViewById(R.id.Celsius);
        fahrenheit = findViewById(R.id.Fahrenheit);
        toFahrenheit = findViewById(R.id.Fahrenheit_btn);
        toCelsius = findViewById(R.id.Celsius_btn);
        result = findViewById(R.id.result);
        toFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c ;
                double f ;
                c =  Double.parseDouble(celsius.getText().toString());
                f = (c*1.8)+32;
                result.setText("Result = "+f+"°F");

            }
        });
        toCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c ;
                double f ;
                f =  Double.parseDouble(fahrenheit.getText().toString());
                c = (f-32)/1.8;
                result.setText("Result = "+c+"°C");

            }
        });

    }
}