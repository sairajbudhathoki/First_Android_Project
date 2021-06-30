package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Linearlayout = findViewById(R.id.Linearlayout);
        Button Relativelayout = findViewById(R.id.relativelayout);
        Button Listview = findViewById(R.id.listview);
        Button Eventhandle = findViewById(R.id.eventhaldling);

        Linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinearIntent = new Intent(MainActivity.this,activity_Linear_layout.class);
                startActivity(LinearIntent);

            }
        });
        Relativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RelativeIntent = new Intent(MainActivity.this , Relative_Layout.class);
                startActivity(RelativeIntent);

            }
        });
        Eventhandle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EventIntent = new Intent(MainActivity.this , event_handling.class);
                startActivity(EventIntent);

            }
        });

        Listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListIntent = new Intent(MainActivity.this ,List_View.class);
                startActivity(ListIntent);
            }
        });

    }


    //This is the second commit
}