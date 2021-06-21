package com.example.flightwatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<Flight> flights;
    RecyclerView recyclerView;

    TextView cityNameView;
    TextView weatherConditionView;
    TextView weatherTemperatureView;
    Airport airport;
    Airports airports;

    Handler handler = new Handler();
    Runnable runnable;
    int refreshDelay = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        flights = new ArrayList<Flight>();


        cityNameView = findViewById(R.id.cityNameView);
        weatherConditionView = findViewById(R.id.weatherConditionView);
        weatherTemperatureView = findViewById(R.id.weatherTemperatureView);

        cityNameView.setText("Hamburg");
        Bundle extras = getIntent().getExtras();

        cityNameView.setText(extras.getString("selectedCity"));
        airports = new Airports();
        airport = new Airport(extras.getString("selectedCity"),airports);
        setAdapter();
        weatherConditionView.setText("Sonnig");
        weatherTemperatureView.setText("25°C");

    }

    @Override
    protected void onResume() {
        handler.postDelayed(runnable = new Runnable(){
            public void run(){
                handler.postDelayed(runnable, refreshDelay);
                //Code der jede Sekunde ausgeführt wird

                //Refresh Flight List
                setAdapter();

            }
        }, refreshDelay);
        super.onResume();
    }

    private void setAdapter(){
        RecyclerAdapter adapter = new RecyclerAdapter(airport.getFlights());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

}