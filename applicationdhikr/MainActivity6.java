package com.example.applicationdhikr;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {

    private Intent MainActivity7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ImageButton image1 = findViewById(R.id.imageButtonmorning);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(intent);
            }
        });

        ImageButton image2 = findViewById(R.id.imageButtonnight);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        ImageButton image3 = findViewById(R.id.imageButtonsleep);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                startActivity(intent);
            }
        });

        ImageButton image4 = findViewById(R.id.imageButtonwakey);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        ImageButton image5 = findViewById(R.id.imageButtonafterpray);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity11.class);
                startActivity(intent);
            }
        });

        ImageButton image6 = findViewById(R.id.imageButtonmsjd);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity12.class);
                startActivity(intent);
            }
        });

        ImageButton image7 = findViewById(R.id.imageButtonsafr);
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity13.class);
                startActivity(intent);
            }
        });

        ImageButton image8 = findViewById(R.id.imageButtonquran);
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity14.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity15.class);
                startActivity(intent);
            }
        });

    }}