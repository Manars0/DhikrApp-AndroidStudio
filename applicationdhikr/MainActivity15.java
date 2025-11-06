package com.example.applicationdhikr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity15 extends AppCompatActivity {

        private GridView gridView;
        private ImageView selectedImageView;
        private int customImageResource1 = R.drawable.sadwords;
        private int customImageResource2 = R.drawable.moneywords;
        private int customImageResource3 = R.drawable.tashenwords;
        private int customImageResource4 = R.drawable.examwords;
        private int[] images = {R.drawable.sad, R.drawable.money, R.drawable.tashen, R.drawable.exam};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main15);

            gridView = findViewById(R.id.gridView);
            selectedImageView = findViewById(R.id.selectedImageView);
            Button buttonNext = findViewById(R.id.buttonNext);



            ImageAdapter adapter = new ImageAdapter(MainActivity15.this, images);
            gridView.setAdapter(adapter);


            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    selectedImageView.setVisibility(View.VISIBLE);

                    switch (position) {
                        case 0:
                            selectedImageView.setImageResource(customImageResource1);
                            break;
                        case 1:
                            selectedImageView.setImageResource(customImageResource2);
                            break;
                        case 2:
                            selectedImageView.setImageResource(customImageResource3);
                            break;
                        case 3:
                            selectedImageView.setImageResource(customImageResource4);
                            break;
                    }

                    for (int i = 0; i < parent.getChildCount(); i++) {
                        View child = parent.getChildAt(i);
                        ImageView imageView = child.findViewById(R.id.imageView);

                        if (i == position) {
                            imageView.setAlpha(1.0f);
                        } else {
                            imageView.setAlpha(0.5f);
                        }
                    }
                }
            });
            buttonNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity15.this, MainActivity16.class);
                    startActivity(intent);
                }
            });

        }
    }
