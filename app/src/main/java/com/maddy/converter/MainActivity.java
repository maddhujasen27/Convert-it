package com.maddy.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome = findViewById(R.id.welcome_btn);
        welcome.setOnClickListener(new View.OnClickListener() { //clicking a button
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Converter.class);

                startActivity(i);

            }
        });

    }
}