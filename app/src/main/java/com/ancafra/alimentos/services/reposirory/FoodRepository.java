package com.ancafra.alimentos.services.reposirory;

import com.ancafra.alimentos.entities.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();

        this.mListFood.add(new FoodEntity(0, "Alface crespa", 8, 60,"g", "Este alimento contém várias vitaminas"));
        this.mListFood.add(new FoodEntity(1, "Azeite", 90, 10, "g", "Este alimento é rico em HDL"));
        this.mListFood.add(new FoodEntity(2, "Batata doce", 115, 100, "g", "Este alimento é rico em vitamina A"));
        this.mListFood.add(new FoodEntity(3, "Ervilhas cruas", 81, 70, "g", "Este alimento não contém gorduras"));
        this.mListFood.add(new FoodEntity(4, "Feijão carioca", 77, 75, "g", "Este alimento é rico em ferro"));
        this.mListFood.add(new FoodEntity(5, "Filé de frango frito", 240, 100,"g", "Este alimento é rico em proteinas"));
        this.mListFood.add(new FoodEntity(6, "Grão e bico", 720, 200," g", "Este alimento contém vitamina B"));
        this.mListFood.add(new FoodEntity(7, "Macarrão cozido", 221, 140, "g", "Este alimento glutem"));
        this.mListFood.add(new FoodEntity(8, "Pão de forma 12 grãos", 110, 50, "g", "Este alimento contém baixo teor de caloria"));
        this.mListFood.add(new FoodEntity(9, "Queijo parmesão", 18, 71, "g", "Este alimento contém derivado de leite"));
        this.mListFood.add(new FoodEntity(10, "Rúcula", 5, 20, "g", "Este alimento contém cácio e ferro"));
        this.mListFood.add(new FoodEntity(11, "Vagem cozida", 44, 125,"g", "Este alimento betacaroteno"));
        this.mListFood.add(new FoodEntity(12, "Vodka", 231, 100, "g", "Este alimento contém carboidrato"));
        this.mListFood.add(new FoodEntity(13, "Whiskey", 58, 33, "g", "Este alimento contém alto teor calórico"));
    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }

}
