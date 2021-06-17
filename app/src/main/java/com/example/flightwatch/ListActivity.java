package com.example.flightwatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<Flight> flights;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        flights = new ArrayList<Flight>();

        addEntries();
        setAdapter();

    }

    private void setAdapter(){
        RecyclerAdapter adapter = new RecyclerAdapter(flights);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    private void addEntries(){
        flights.add(new Flight("FL-21","8:00","9:30","Hamburg","Köln",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","8:00","9:30","Hamburg","Köln",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","8:00","9:30","Hamburg","Köln",12, "SCHEDULED"));
    }
}