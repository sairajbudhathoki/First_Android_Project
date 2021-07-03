package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Linear_layout extends AppCompatActivity {
    private TextView lineartextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Bundle extras  =getIntent().getExtras();
        if (extras != null){
            String statePassedFromMainActivity = extras.getString("destination");
            System.out.println("debug" + statePassedFromMainActivity);
            lineartextview = findViewById(R.id.textView5);
            lineartextview.setText(statePassedFromMainActivity);
        }
    }
}