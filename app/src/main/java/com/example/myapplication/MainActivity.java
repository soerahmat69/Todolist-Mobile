package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Data> userslist;
    private RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcyleview);
        userslist = new ArrayList<>();
        setUserInfo();
        setAdapter();


    }
    private void setAdapter(){
        Adapter adapter = new Adapter(userslist);
        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager((getApplicationContext()));
        recyclerView.setLayoutManager(LayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    private void setUserInfo(){
        userslist.add(new Data("PEMROG 2", "2022-10-20"));
        userslist.add(new Data("RPL", "2022-10-20"));
        userslist.add(new Data("DATABASE", "2022-10-20"));
        userslist.add(new Data("MTK", "2022-10-20"));
        userslist.add(new Data("GIS", "2022-10-20"));
        userslist.add(new Data("JARKOM", "2022-10-20"));
        userslist.add(new Data("KSI", "2022-10-20"));
        userslist.add(new Data("PROJEK3", "2022-10-20"));


    }
}