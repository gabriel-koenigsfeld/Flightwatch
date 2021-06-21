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

public class ListActivity extends AppCompatActivity implements Beobachter{

    ArrayList<Flight> flights;
    RecyclerView recyclerView;

    TextView cityNameView;
    TextView weatherConditionView;
    TextView weatherTemperatureView;
    Airport airport;
    Airports airports;

    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        flights = new ArrayList<Flight>();


        cityNameView = findViewById(R.id.cityNameView);
        weatherConditionView = findViewById(R.id.weatherConditionView);
        weatherTemperatureView = findViewById(R.id.weatherTemperatureView);

        Bundle extras = getIntent().getExtras();

        cityNameView.setText(extras.getString("selectedCity"));
        airports = (Airports) getIntent().getParcelableExtra("airports");
        airport = new Airport(extras.getString("selectedCity"),airports);

        airports.registriereBeobachter(this);

        setAdapter();
        weatherConditionView.setText("Sonnig");
        weatherTemperatureView.setText("25°C");

    }


    private void setAdapter(){
        adapter = new RecyclerAdapter(airport.getFlights());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    public void aktualisieren(String abflugsort, String landungsort) {
        Log.e("bug","new Data");
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onDestroy() {
        airports.entferneBeobachter(this);
        airport = null;
        super.onDestroy();
    }
}