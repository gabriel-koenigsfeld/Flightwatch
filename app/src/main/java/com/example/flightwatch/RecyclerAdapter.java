package com.example.flightwatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    private ArrayList<Flight> flightsAdapter;

    public RecyclerAdapter(ArrayList<Flight> flightsAdapter){
        this.flightsAdapter = flightsAdapter;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        private TextView flightNameView;
        private TextView departureTimeView;
        private TextView destinationTimeView;
        private TextView departureCityView;
        private TextView destinationCityView;
        private TextView distanceView;
        private TextView statusView;

        public RecyclerViewHolder(@NonNull final View itemView){
            super(itemView);

            flightNameView = itemView.findViewById(R.id.flightNameView);
            departureTimeView = itemView.findViewById(R.id.departureTimeView);
            destinationTimeView = itemView.findViewById(R.id.destinationTimeView);
            departureCityView = itemView.findViewById(R.id.departureCityView);
            destinationCityView = itemView.findViewById(R.id.destinationCityView);
            distanceView = itemView.findViewById(R.id.destinationCityView);
            statusView = itemView.findViewById(R.id.destinationCityView);

        }
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.linear_layout, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        String flightName = flightsAdapter.get(position).getFlightName();
        holder.flightNameView.setText(flightName);

        String departureTime = flightsAdapter.get(position).getDepartureTime();
        holder.departureTimeView.setText(departureTime);

        String destinationTime = flightsAdapter.get(position).getDestinationTime();
        holder.destinationTimeView.setText(destinationTime);

        String departureCity = flightsAdapter.get(position).getDepartureCity();
        holder.departureCityView.setText(departureCity);

        String destinationCity = flightsAdapter.get(position).getDestinationCity();
        holder.destinationCityView.setText(destinationCity);

        int distance = flightsAdapter.get(position).getDistance();
        holder.distanceView.setText(String.valueOf(distance));

        String flightStatus = flightsAdapter.get(position).getDestinationCity();
        holder.statusView.setText(flightStatus);

    }

    @Override
    public int getItemCount() {
        return flightsAdapter.size();
    }
}
