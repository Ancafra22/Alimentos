package com.ancafra.alimentos.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.ancafra.alimentos.R;
import com.ancafra.alimentos.services.business.FoodBusiness;
import com.ancafra.alimentos.services.constants.FoodConstants;
import com.ancafra.alimentos.entities.FoodEntity;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private int mId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        startComponents();
        this.getData();

    }
    private static class ViewHolder{
        TextView mTextName;
        TextView mTextCalorie;
        TextView mTextQuantity;
        TextView mTextUnit;
        TextView mTextDescription;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            int id = bundle.getInt(FoodConstants.FOOD_ID);
            FoodEntity foodEntity = new FoodBusiness().get(id);

            this.mViewHolder.mTextName.setText(foodEntity.getName());
            this.mViewHolder.mTextCalorie.setText(String.valueOf(foodEntity.getCalories())+" Calorias");
            this.mViewHolder.mTextQuantity.setText(String.valueOf(foodEntity.getQuantity() + " g"));
            this.mViewHolder.mTextUnit.setText(String.valueOf(foodEntity.getUnit()));
            this.mViewHolder.mTextDescription.setText(String.valueOf(foodEntity.getDescription()));

        }

    }

    private void startComponents() {

        this.mViewHolder.mTextName = findViewById(R.id.text_name);
        this.mViewHolder.mTextCalorie = findViewById(R.id.text_calories);
        this.mViewHolder.mTextQuantity = findViewById(R.id.text_quantity);
        this.mViewHolder.mTextUnit = findViewById(R.id.text_unit);
        this.mViewHolder.mTextDescription = findViewById(R.id.text_description);
    }
}