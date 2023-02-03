package com.ancafra.alimentos.ui.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ancafra.alimentos.services.listener.OnListClick;
import com.ancafra.alimentos.R;
import com.ancafra.alimentos.entities.FoodEntity;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextName;
    private TextView mTextCalories;
    private TextView mTextUnit;
    private TextView mTextQuantity;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mTextName = itemView.findViewById(R.id.text_name);
        this.mTextCalories = itemView.findViewById(R.id.text_calories);
        this.mTextUnit = itemView.findViewById(R.id.text_unit);
        this.mTextQuantity = itemView.findViewById(R.id.text_quantity);

    }

    public void bind(FoodEntity food, OnListClick listener) {
        this.mTextName.setText(String.valueOf(food.getName()));
        this.mTextCalories.setText(String.valueOf(food.getCalories()+" Calorias"));
        this.mTextQuantity.setText(String.valueOf(food.getQuantity()));
        this.mTextUnit.setText(String.valueOf(food.getUnit()));

        this.mTextName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(food.getId());
            }
        });
    }
}
