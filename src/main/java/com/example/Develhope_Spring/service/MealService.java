package com.example.Develhope_Spring.service;

import com.example.Develhope_Spring.Meal;
import com.example.Develhope_Spring.dao.MealDao;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {
    private MealDao mealDao;
//    private RestaurantConfig restaurantConfig;
    private Double MIN_SUMMER_TEMP = 20.0;
    private Double MAX_WINTER_TEMP = 10.0;

    @Autowired
    public MealService(MealDao mealDao){
        this.mealDao = mealDao;
//        this.restaurantConfig = restaurantConfig;
    }
//  public void insertMealTest() {
//        mealDao.save(new Meal("Test meal", "very tasty", 4.8));
//  }

  public List<Meal> getSummerMeals(){
      Double currentTemperatureInCentigrade = getCurrentTemperatureInCentigrade();

      if(currentTemperatureInCentigrade < MIN_SUMMER_TEMP) return new ArrayList<>();

      return mealDao.findByIsSummerMeal(true);
  }

  public List<Meal> getWinterMeals(){
        Double currentTemperatureInCentigrade = getCurrentTemperatureInCentigrade();

        if (currentTemperatureInCentigrade > MAX_WINTER_TEMP) return new ArrayList<>();

        return mealDao.findByIsWinterMeal(true);
  }

    // Ho inserito le condizione climatiche di Ushuaia per avere una temperatura effettivamente bassa
    private Double getCurrentTemperatureInCentigrade(){
        try {
             JSONObject response = Unirest.get("https://api.open-meteo.com/v1/forecast?latitude=-54.8108&longitude=-68.3159&current_weather=true").asJson().getBody().getObject();
            return response.getJSONObject("current_weather").getDouble("temperature");
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }
}
