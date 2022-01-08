package com.geektech.a3dz8rickandmorty.ForLocation;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.a3dz8rickandmorty.databinding.ItemLocationBinding;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private ArrayList<LocationModel> locations;

    public LocationAdapter(ArrayList<LocationModel> locations) {
        this.locations = locations;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LocationViewHolder viewHolder = new LocationViewHolder(ItemLocationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        holder.onBind(locations.get(position));
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    public class LocationViewHolder extends RecyclerView.ViewHolder {

        private ItemLocationBinding binding;

        public LocationViewHolder(@NonNull ItemLocationBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(LocationModel locationModel) {
            binding.location.setImageResource(locationModel.getImage());
        }
    }
}
