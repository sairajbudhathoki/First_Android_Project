package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class event_handling extends AppCompatActivity {

    private TextView text;
    private TextInputEditText inputField;
    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling);

        text = findViewById(R.id.firsttextview);
        inputField = findViewById(R.id.Inputtext);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable inputText = inputField.getText();
                text.setText(inputText);
                Toast.makeText(event_handling.this, inputText + "has been displayed", Toast.LENGTH_LONG).show();
//                Snackbar.make()
            }
        });
    }
}