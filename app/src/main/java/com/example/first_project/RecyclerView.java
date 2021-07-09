package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    private androidx.recyclerview.widget.RecyclerView contactsRecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        contactsRecView = findViewById(R.id.recyclerView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Lambo","naruto@naruto.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.supercars.net%2Fblog%2F5-awesome-ways-to-customize-your-supercar%2F&psig=AOvVaw2p7w80HQ41vLILmQY5wDBn&ust=1625367922725000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCKDxmKL1xfECFQAAAAAdAAAAABA9"));
        contacts.add(new Contact("Ferrari","zaraki@bleach.com","https://static.cargurus.com/images/article/2021/01/19/10/29/cheap_supercars-pic-2342053860686599989-1600x1200.jpeg"));
        contacts.add(new Contact("volvo","luffy@onepiece.com","https://media.wired.com/photos/59324ef94dc9b45ccec5d25b/master/pass/hybrid-supers-ft.jpg"));
        contacts.add(new Contact("Eren","eren@aot.com","https://img.republicworld.com/republic-prod/stories/promolarge/xhdpi/fvtmt2ftcdwprlxz_1615273483.jpeg"));
        contacts.add(new Contact("Natsu","natsu@fairytale.com","https://speedvegas.com/wp-content/uploads/2020/08/Screen-Shot-2020-01-13-at-10.07.46-AM.png"));
        contacts.add(new Contact("Elric","elric@alchemist.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCgF5j2hasOEzcAS3TS9nzva2IZ0OcIZ7IAw&usqp=CAU"));
        contacts.add(new Contact("Aang","aang@avatar.com","https://i.pinimg.com/564x/c3/e6/e8/c3e6e8514bfc18ea78c315e4231f2006.jpg"));
        contacts.add(new Contact("Sokka","sokka@avatar.com","https://www.supercars.net/blog/wp-content/uploads/2020/05/mulholland-legend-480-3.jpg"));

        ContactRecViewAdapter contactRecViewAdapter = new ContactRecViewAdapter(this);

        contactRecViewAdapter.setContacts(contacts);

        contactsRecView.setAdapter(contactRecViewAdapter);

        // programatically managed layout
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}