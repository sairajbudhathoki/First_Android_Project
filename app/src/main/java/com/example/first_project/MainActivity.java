package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Linearlayout = findViewById(R.id.Linearlayout);
        Button Relativelayout = findViewById(R.id.relativelayout);
        Button Listview = findViewById(R.id.listview);
        Button Eventhandle = findViewById(R.id.eventhaldling);
        Button CardSpin = findViewById(R.id.card_view);
        Button Recycler = findViewById(R.id.recycler_view);
        Button LinkOpner = findViewById(R.id.link);

        Linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinearIntent = new Intent(MainActivity.this, Linear_layout.class);
                LinearIntent.putExtra("destination" , "Comment to win free Lamborghini");
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

        CardSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CardIntent = new Intent(MainActivity.this , CardViewSpinner.class);
                startActivity(CardIntent);
            }
        });

        Recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RecyclerIntent = new Intent(MainActivity.this, RecyclerView.class);
                startActivity(RecyclerIntent);
            }
        });
        LinkOpner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinkIntent = new Intent(MainActivity.this ,LInk_opner.class);
                startActivity(LinkIntent);
            }
        });

    }


    //This is the second commit
}