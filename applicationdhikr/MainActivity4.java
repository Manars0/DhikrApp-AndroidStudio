package com.example.applicationdhikr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    EditText editTextName;
    EditText editTextPassword;
    EditText editTextPhone;
    EditText editTextDateOfBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);

        Button button = findViewById(R.id.buttonsave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String password = editTextPassword.getText().toString();
                String phone = editTextPhone.getText().toString();
                String dateOfBirth = editTextDateOfBirth.getText().toString();

                editor.putString("key1", name);
                editor.putString("key2", password);
                editor.putString("key3", phone);
                editor.putString("key4", dateOfBirth);
                editor.commit();

                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}