package com.example.flightwatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements Observer {

    ArrayList<Flight> flights;
    RecyclerView recyclerView;

    TextView cityNameView;
    TextView weatherConditionView;
    TextView weatherTemperatureView;

    Weather weather;

    Airport airport;
    Airports airports;

    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        flights = new ArrayList<Flight>();
        weather = new Weather();

        cityNameView = findViewById(R.id.cityNameView);
        weatherConditionView = findViewById(R.id.weatherConditionView);
        weatherTemperatureView = findViewById(R.id.weatherTemperatureView);

        Bundle extras = getIntent().getExtras();

        //Stadtnamenanzeige
        switch (extras.getString("selectedCity")) {
            case "KLN":
                cityNameView.setText("Köln");
                break;
            case "HAM":
                cityNameView.setText("Hamburg");
                break;
            case "BRE":
                cityNameView.setText("Bremen");
                break;
            case "HAJ":
                cityNameView.setText("Hannover");
                break;
            case "LEJ":
                cityNameView.setText("Leipzig");
                break;
            case "MUC":
                cityNameView.setText("München");
                break;
            default:
                cityNameView.setText("Stadt");
        }


        airports = new Airports();
        airport = new Airport(extras.getString("selectedCity"), airports);
        airports.registerObserver(this);

        //Wetterstatus und Temperatur
        weatherConditionView.setText(weather.getCondition());
        weatherTemperatureView.setText(String.valueOf(weather.getTemperature()) + "°C");

        //Einmaliges setzen des Adapters
        setAdapter();
    }


    //Der Adapter nimmt die Flüge aus airport
    private void setAdapter() {
        adapter = new RecyclerAdapter(airport.getFlights());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    //Methode zur Aktualisierung des Adapters
    public void refresh(String departure, String destination) {
        adapter.notifyDataSetChanged();
    }
}