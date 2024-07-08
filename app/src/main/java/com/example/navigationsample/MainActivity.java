package com.example.navigationsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button rightBtn = findViewById(R.id.rightBtn);
        Button leftBtn = findViewById(R.id.leftBtn);
        Button topBtn = findViewById(R.id.topBtn);
        Button bottomBtn = findViewById(R.id.bottomBtn);
        Button higherBtn = findViewById(R.id.higherBtn);
        Button lowerBtn = findViewById(R.id.lowerBtn);
        Button quitBtn = findViewById(R.id.quitBtn);

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle right button click
                Toast.makeText(MainActivity.this, "Right button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle left button click
                Toast.makeText(MainActivity.this, "Left button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        topBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle top button click
                Toast.makeText(MainActivity.this, "Slower button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        bottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle bottom button click
                Toast.makeText(MainActivity.this, "Lower button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        higherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle higher button click
                Toast.makeText(MainActivity.this, "Higher button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        lowerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle lower button click
                Toast.makeText(MainActivity.this, "Faster button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle quit button click
                finish(); // Close the activity
            }
        });
    }
}