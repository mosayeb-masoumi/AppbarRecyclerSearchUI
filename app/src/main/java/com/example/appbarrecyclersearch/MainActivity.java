package com.example.appbarrecyclersearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);

        List<Model> list = new ArrayList<>();
        list.add(new Model("title1"));
        list.add(new Model("title2"));
        list.add(new Model("title3"));
        list.add(new Model("title4"));
        list.add(new Model("title5"));
        list.add(new Model("title6"));
        list.add(new Model("title7"));


        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new Adapter(list, this);
        recyclerView.setAdapter(adapter);




    }
}