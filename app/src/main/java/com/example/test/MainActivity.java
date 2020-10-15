package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void friends(View view)
    {
        final String[] arr = {"Dipisha", "Priyanka", "Amit", "Hema" ,"Abhay"};
        Random random = new Random();
        int index = random.nextInt(arr.length);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("str",arr[index]);
        startActivity(intent);
    }
}