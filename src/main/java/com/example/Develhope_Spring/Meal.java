package com.example.Develhope_Spring;

import com.example.Develhope_Spring.entities.Ingredient;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private double price;
    private boolean isSummerMeal;

    private boolean isWinterMeal;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ingredient> ingredientList;

    public Meal() {
    }

    public Meal(String name, String description, double price, boolean isSummerMeal, boolean isWinterMeal) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isSummerMeal = isSummerMeal;
        this.isWinterMeal = isWinterMeal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public boolean isSummerMeal() {
        return isSummerMeal;
    }

    public void setSummerMeal(boolean summerMeal) {
        isSummerMeal = summerMeal;
    }

    public boolean isWinterMeal() {
        return isWinterMeal;
    }

    public void setWinterMeal(boolean winterMeal) {
        isWinterMeal = winterMeal;
    }
}

