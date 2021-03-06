/*
 * MainActivity
 *
 * Version 1.0
 *
 * Königsfeld, Gabriel
 * Özugurlu, Sina
 * Karampelas, Panagiotis
 * Konadu, Joshua Osei-Bonsu
 */

package com.example.flightwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button continueButton;
    private Spinner citySpinner;
    private String selectedCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* City dropdown menu */
        citySpinner = findViewById(R.id.spinner);

        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Wählen Sie Ihren Flughafen aus");
        citiesList.add("KLN");
        citiesList.add("HAM");
        citiesList.add("BRE");
        citiesList.add("HAJ");
        citiesList.add("LEJ");
        citiesList.add("MUC");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,citiesList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        citySpinner.setAdapter(spinnerAdapter);
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    selectedCity = citySpinner.getSelectedItem().toString();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });



        /* Continue button */
        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(new View.OnClickListener(){

            /* Open ListActivity when tapped */
            @Override
            public void onClick(View v) {
                if(selectedCity != null){
                    openListActivity();
                }
            }
        });

    }

    /* Button transition to ListActivity */
    public void openListActivity(){
        Intent intent = new Intent(this, ListActivity.class);
        /* transfer selectedCity to ListActivity */
        intent.putExtra("selectedCity",selectedCity);
        selectedCity = null;
        startActivity(intent);
    }

}