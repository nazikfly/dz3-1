package com.geektech.lesson3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvFoods;

    public FoodsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFoods = itemView.findViewById(R.id.tv_foods);
    }

    public void bind(String foods) {
        tvFoods.setText(foods);
    }
}
