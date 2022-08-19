package com.geektech.lesson3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodsAdapter extends RecyclerView.Adapter<FoodsViewHolder> {
    private ArrayList<String> foods;

    public FoodsAdapter(ArrayList<String> foods) {
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_foods, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodsViewHolder holder, int position) {
        holder.bind(foods.get(position));

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }
}
