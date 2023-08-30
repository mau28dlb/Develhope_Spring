package com.example.Develhope_Spring.service;

import com.example.Develhope_Spring.Meal;
import com.example.Develhope_Spring.RestaurantConfig;
import com.example.Develhope_Spring.dao.MealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private MealDao mealDao;
    private RestaurantConfig restaurantConfig;

    @Autowired
    public MealService(MealDao mealDao, RestaurantConfig restaurantConfig){
        this.mealDao = mealDao;
        this.restaurantConfig = restaurantConfig;
    }
  public void insertMealTest() {
        mealDao.save(new Meal("Test meal", "very tasty", 4.8));
  }
}
