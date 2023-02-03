package com.ancafra.alimentos.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ancafra.alimentos.services.listener.OnListClick;
import com.ancafra.alimentos.R;
import com.ancafra.alimentos.entities.FoodEntity;
import com.ancafra.alimentos.ui.viewholder.FoodViewHolder;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {


    //recebendo a lista
    private List<FoodEntity> mList;
    private OnListClick mListClick;
    public FoodAdapter(List<FoodEntity> list, OnListClick listener) {
        this.mList = list;
        this.mListClick = listener;
    }

    @NonNull
    @Override
    //método que cria o layout da linha do recycleView
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_food, parent, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodEntity foodEntity = this.mList.get(position);
        holder.bind(foodEntity, this.mListClick);

    }
    //retornando o tamanho da lista
    @Override
    public int getItemCount() {
        return this.mList.size();
    }
}
