package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LInk_opner extends AppCompatActivity {

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    private EditText Text;
    private Button Oppner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_opner);

        Text = findViewById(R.id.url_id);
        Oppner = findViewById(R.id.Opnner);
        Oppner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Text.getText().toString();
                openWebPage(s);
            }
        });



    }
}