package com.geektech.a3dz8rickandmorty.ForCharacter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.a3dz8rickandmorty.IOnclick;
import com.geektech.a3dz8rickandmorty.databinding.ItemCharacterBinding;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {

    private ArrayList<CharacterModel> list;
    private IOnclick listener;

    public CharacterAdapter(ArrayList<CharacterModel> list, IOnclick onclick) {
        this.list = list;
        listener =onclick;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CharacterViewHolder viewHolder = new CharacterViewHolder(ItemCharacterBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(list.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CharacterViewHolder extends RecyclerView.ViewHolder {

        private ItemCharacterBinding binding;

        public CharacterViewHolder(@NonNull ItemCharacterBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(CharacterModel characterModel) {
            binding.imageView.setImageResource(characterModel.getCharacter());
            binding.deadOrAlive.setText(characterModel.getDeadOrAlive());
            binding.name.setText(characterModel.getName());
        }
    }
}
