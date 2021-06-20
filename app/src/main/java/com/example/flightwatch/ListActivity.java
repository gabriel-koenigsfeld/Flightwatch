package com.example.flightwatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<Flight> flights;
    RecyclerView recyclerView;

    TextView cityNameView;
    TextView weatherConditionView;
    TextView weatherTemperatureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        flights = new ArrayList<Flight>();

        cityNameView = findViewById(R.id.cityNameView);
        weatherConditionView = findViewById(R.id.weatherConditionView);
        weatherTemperatureView = findViewById(R.id.weatherTemperatureView);

        addEntries();
        setAdapter();

        cityNameView.setText("Hamburg");
        weatherConditionView.setText("Sonnig");
        weatherTemperatureView.setText("25°C");

    }

    private void setAdapter(){
        RecyclerAdapter adapter = new RecyclerAdapter(flights);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    private void addEntries(){
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
        flights.add(new Flight("FL-21","08:00","09:30","HAM","KLN",12, "SCHEDULED"));
    }
}