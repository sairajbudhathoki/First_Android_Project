package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class CardViewSpinner extends AppCompatActivity {

    private Spinner nameSpinner;
    private ConstraintLayout parent;
    private TextView text;
    private ImageView cardImage;
    private Button chgImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_spinner);

        nameSpinner = findViewById(R.id.namespinner);
        parent = findViewById(R.id.cardviewspinnerlayout);
        text = findViewById(R.id.textView3);
        cardImage = findViewById(R.id.imageView2);
        chgImg =findViewById(R.id.changeimg);

        nameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text.setText(nameSpinner.getSelectedItem().toString());
                cardImage.setBackgroundResource(R.mipmap.car4);
                Snackbar.make(parent , nameSpinner.getSelectedItem().toString() + "Selected" , Snackbar.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Snackbar.make(parent , nameSpinner.getSelectedItem().toString(), Snackbar.LENGTH_LONG).show();
            }
        });
        chgImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage.setImageResource(R.mipmap.car4);
            }
        });

    }

}