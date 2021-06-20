package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Relative_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }
    public void show_message(){
        System.out.println("hello world");
    }
}