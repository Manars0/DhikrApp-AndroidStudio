package com.example.applicationdhikr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity5 extends AppCompatActivity {

        private TextView textViewWelcome;
        private TextView textViewStartDate;
        private Button ButtonNext;

        private Calendar calendar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main5);

            textViewWelcome = findViewById(R.id.textViewWelcome);
            textViewStartDate = findViewById(R.id.textViewStartDate);
            ButtonNext=findViewById(R.id.button4);

            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            String username = sharedPreferences.getString("key1", "");

            textViewWelcome.setText("مرحبًا بك " + username);

            calendar = Calendar.getInstance();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String startDate = dateFormat.format(calendar.getTime());
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("start_date", startDate);
            editor.apply();

            textViewStartDate.setText(" تاريخ بدء استخدام التطبيق:" + startDate);
            ButtonNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                    startActivity(intent);
                }
            });
        }
    }