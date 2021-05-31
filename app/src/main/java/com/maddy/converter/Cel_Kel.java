package com.maddy.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cel_Kel extends AppCompatActivity {
    EditText celsiusK,kelvin;
    Button to_Kelvin,to_Cel;
    TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel__kel);
        celsiusK = findViewById(R.id.CelsiusK);
        kelvin = findViewById(R.id.Kelvin);
        to_Cel = findViewById(R.id.to_CelsiusK_btn);
        to_Kelvin = findViewById(R.id.to_Kelvin_btn);
        result2 = findViewById(R.id.resultK);


        to_Kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c ;
                double k ;
                c =  Double.parseDouble(celsiusK.getText().toString());
                k = c+273;
                result2.setText("Result = "+k+"K");
            }
        });

        to_Cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c ;
                double k ;
                k =  Double.parseDouble(kelvin.getText().toString());
                c = k-273;
                result2.setText("Result = "+c+"°C");
            }
        });
    }
}