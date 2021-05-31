package com.maddy.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Converter extends AppCompatActivity {
    Button celFah,celKel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        celFah = findViewById(R.id.CelToFah);
        celKel = findViewById(R.id.CelToKel);
        celFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Converter.this,Cel_Fah.class);

                startActivity(i);
            }
        });

        celKel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Converter.this,Cel_Kel.class);

                startActivity(i);
            }
        });
    }
}