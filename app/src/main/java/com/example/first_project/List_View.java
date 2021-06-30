package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class List_View extends AppCompatActivity {

    private View parent;
    private ListView cities;
    private FloatingActionButton addingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        parent = findViewById(R.id.listViewParent);

        cities = findViewById(R.id.listview);

        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Kathamndu");
        citiesList.add("Bhaktaput");
        citiesList.add("Lalitpur");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                citiesList

        );
        cities.setAdapter(citiesAdapter);

        addingButton = findViewById(R.id.floatingadd);
        addingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> citiesList = new ArrayList<>();
                citiesList.add("Makwanpur");
                citiesList.add("Chitwan");
                citiesList.add("Janakpur");

                ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                        List_View.this,
                        android.R.layout.simple_list_item_1,
                        citiesList

                );
                cities.setAdapter(citiesAdapter);
                Snackbar.make(parent , "Array Clicked" , Snackbar.LENGTH_SHORT).show();
            }
        });

    }
}