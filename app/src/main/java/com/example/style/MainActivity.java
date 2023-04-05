package com.example.style;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button minusButton;
    private Button plusButton;
    private int batteryLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        minusButton = findViewById(R.id.minus);
        plusButton = findViewById(R.id.plus);
    }

    public void minus(View view){
        if (batteryLevel > 0){
            batteryLevel --;
            imageView.setImageLevel(batteryLevel);
        }
    }

    public void plus(View view){
        if (batteryLevel < 7){
            batteryLevel++;
            imageView.setImageLevel(batteryLevel);
        }
    }

    public void openTask2(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}