package com.example.tarea4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Chats extends AppCompatActivity {
    List<listclases>elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
        init();
    }
    public void init(){
        elements=new ArrayList<>();
        elements.add(new listclases("#774457", "LP2","Fabio"));
        elements.add(new listclases("#03a9f4", "LP1","Omar"));
        elements.add(new listclases("#f44336", "LP3","Cristian"));
        elements.add(new listclases("#009688", "App Moviles","Omar"));

        listclasesadapter listclasesadapter=new listclasesadapter(elements,this);
        RecyclerView recyclerView=findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listclasesadapter);

    }
}