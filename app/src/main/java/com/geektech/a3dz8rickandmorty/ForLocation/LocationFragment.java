package com.geektech.a3dz8rickandmorty.ForLocation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.a3dz8rickandmorty.R;
import com.geektech.a3dz8rickandmorty.databinding.FragmentLocationBinding;

import java.util.ArrayList;

public class LocationFragment extends Fragment {

    private FragmentLocationBinding binding;
    private ArrayList<LocationModel> data;
    private LocationAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLocationBinding.inflate(LayoutInflater
                .from(requireActivity()), container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapter = new LocationAdapter(data);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
        data.add(new LocationModel(R.drawable.left_1));
        data.add(new LocationModel(R.drawable.right_1));
    }
}
