package com.example.applicationdhikr;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static final int DELAY_TIME = 2000; // تأخير لمدة ثانيتين (2000 مللي ثانية)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // إنشاء معالج للتأخير والانتقال إلى النشاط الآخر
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // الكود هنا سيتم تنفيذه بعد مرور ثانيتين

                // انتقل إلى النشاط الآخر هنا
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                // إنهاء النشاط الحالي
                finish();
            }
        }, DELAY_TIME);
    }
}