package com.geektech.a3dz8rickandmorty.ForCharacter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.geektech.a3dz8rickandmorty.IOnclick;
import com.geektech.a3dz8rickandmorty.R;
import com.geektech.a3dz8rickandmorty.databinding.FragmentCharacterBinding;

import java.util.ArrayList;

public class CharacterFragment extends Fragment implements IOnclick {

    private FragmentCharacterBinding binding;
    private ArrayList<CharacterModel> data;
    private CharacterAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(LayoutInflater.from(requireActivity()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapter = new CharacterAdapter(data,this::onClick);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
        data.add(new CharacterModel(R.drawable.rick_sanchez,"Alive", "Rick Sanchez"));
    }

    @Override
    public void onClick(CharacterModel name) {
        NavHostFragment.findNavController(this).navigate(
                CharacterFragmentDirections.actionCharacterFragmentToSignInScreenFragment(name));

    }
}