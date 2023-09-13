package com.example.historicalandtouristicplacerecyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.historicalandtouristicplacerecyclerview.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlacesHolder> {

    ArrayList<Places> placesArrayList;

    public PlacesAdapter(ArrayList<Places> placesArrayList) {
        this.placesArrayList = placesArrayList;
    }

    @NonNull
    @Override
    public PlacesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PlacesHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesHolder holder, int position) {
        holder.binding.imageView.setImageResource(placesArrayList.get(position).placeImage);
        holder.binding.textView.setText(placesArrayList.get(position).placeName);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("Places",placesArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return placesArrayList.size();
    }

    public class PlacesHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;

        public PlacesHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

