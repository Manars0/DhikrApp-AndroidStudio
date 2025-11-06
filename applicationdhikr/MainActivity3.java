package com.example.applicationdhikr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private EditText editText;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText = findViewById(R.id.editText);
        editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonNext = findViewById(R.id.button3);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                String password = editTextPassword.getText().toString();

                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity3.this);
                String savedName = sharedPreferences.getString("key1", "");
                String savedPassword = sharedPreferences.getString("key2", "");

                if (name.equals(savedName) && password.equals(savedPassword)) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity3.this, "اسم المستخدم او كلمة المرور خاطئه", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}