package com.example.flightwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button continueButton = findViewById(R.id.continueButton);

        continueButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openListActivity();
            }
        });

    }

    public void openListActivity(){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}