package com.example.historicalandtouristicplacerecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.historicalandtouristicplacerecyclerview.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        //Casting
        Places selectedPlaces = (Places) intent.getSerializableExtra("Places");
        binding.placeName.setText(selectedPlaces.placeName);
        binding.placeDetails.setText(selectedPlaces.placeDetails);
        binding.placeImageView.setImageResource(selectedPlaces.placeImage);
    }
}