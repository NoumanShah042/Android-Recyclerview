package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewHorizontal;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.LayoutManager layoutManagerHorizontal;
    List<Friends> friendsList = new ArrayList<Friends>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter();
    }

    private void setListAdapter() {
        Friends f0 = new Friends(1,"Asad", 1980, "Giglgit");
        Friends f1 = new Friends(2,"Zubair", 1981, "Lahore");
        Friends f2 = new Friends(3,"Musa", 1980, "Quetta");
        Friends f3 = new Friends(4,"Nadeem",1987,"Peshawar");
        Friends f4 = new Friends(5,"Shahid", 1980, "Karachi");
        Friends f5 = new Friends(6,"Zia",1987,"Faisalabad ");
        Friends f6 = new Friends(7,"Badar", 1980, "Rawalpindi");
        Friends f7 = new Friends(8,"Hashim",1987,"Lahore");

        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6,f7,}));

        recyclerView = findViewById(R.id.recyclerViewVertical);
        recyclerViewHorizontal = findViewById(R.id.recyclerViewHorizontal);

        //recyclerView.setHasFixedSize(true);
        //LinearLayoutManager GridLayoutManager

        layoutManager = new LinearLayoutManager(this  );
        recyclerView.setLayoutManager(layoutManager);

        layoutManagerHorizontal = new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL, false);
        recyclerViewHorizontal.setLayoutManager(layoutManagerHorizontal);

        adapter = new RecyclerViewAdapter(friendsList,MainActivity.this) {

        };

        recyclerView.setAdapter(adapter);
        recyclerViewHorizontal.setAdapter(adapter);
    }
}