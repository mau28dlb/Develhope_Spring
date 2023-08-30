package com.example.Develhope_Spring.controller;

import com.example.Develhope_Spring.Meal;
import com.example.Develhope_Spring.RestaurantConfig;
import com.example.Develhope_Spring.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealController {
    private MealService mealService;
    private RestaurantConfig restaurantConfig;

    @Autowired
    public MealController(MealService mealService, RestaurantConfig restaurantConfig) {
        this.mealService = mealService;
        this.restaurantConfig = restaurantConfig;
    }

//    @GetMapping("/get/meals")
//    public ResponseEntity<List<Meal>> getMeals(){
//        return ResponseEntity.ok(mealService.getMeals());
//    }
//
//    @GetMapping("/restaurant-config")
//    public ResponseEntity<RestaurantConfig> getRestaurantConfig() {
//        return ResponseEntity.ok(restaurantConfig);
//    }
//
//    @PutMapping("/put/meal")
//    public ResponseEntity<String> putMeal(@RequestBody Meal meal){
//        try {
//            mealService.addMeal(meal);
//            return ResponseEntity.ok("A meal has been added");
//        } catch (IllegalArgumentException e){
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }
//
//    @DeleteMapping("/delete/meal/{mealName}")
//    public ResponseEntity<String> deleteMeal(@PathVariable String mealName){
//        try {
//            mealService.deleteMeal(mealName);
//            return ResponseEntity.ok("A meal has been deleted");
//        } catch (IllegalArgumentException e){
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }

    @GetMapping("/summer-meals")
    public ResponseEntity<List<Meal>> getSummerMeals(){
        return ResponseEntity.ok(mealService.getSummerMeals());

    }

    @GetMapping("/winter-meals")
    public ResponseEntity<List<Meal>> getWinterMeals(){
        return ResponseEntity.ok(mealService.getWinterMeals());
    }

}
