package com.example.liveupdates.ui.country;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.liveupdates.R;

import java.util.ArrayList;

import static com.example.liveupdates.R.id.tvTotalCases;

public class CovidCountryAdaptar extends RecyclerView.Adapter<CovidCountryAdaptar.ViewHolder> {
    ArrayList<CovidCountry> covidCountries;

    public CovidCountryAdaptar(ArrayList<CovidCountry> covidCountries) {
        this.covidCountries = covidCountries;
    }

    @NonNull
    @Override
    public CovidCountryAdaptar.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_covid_country, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidCountryAdaptar.ViewHolder holder, int position) {
        CovidCountry covidCountry = covidCountries.get(position);
        holder.tvTotalCases.setText(covidCountry.getmCases());
        holder.tvCountryName.setText(covidCountry.getmCovidCountry());
    }

    @Override
    public int getItemCount() {
        return covidCountries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTotalCases, tvCountryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTotalCases = itemView.findViewById(R.id.tvTotalCases);
            tvCountryName = itemView.findViewById(R.id.tvCountryName);

        }
    }

}