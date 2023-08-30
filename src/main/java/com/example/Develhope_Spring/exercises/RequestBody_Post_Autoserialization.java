package com.example.Develhope_Spring.exercises;

import com.example.Develhope_Spring.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RestController
//public class RequestBody_Post_Autoserialization {
//
////    private Meal[] newMealArray = {new Meal("Pizza margherita", "Pizza with tomato sauce, mozzarella cheese and basil", 8.0),
////            new Meal("Pizza romana", "Pizza with tomato sauce, mozzarella cheese and ham", 9.5),
////            new Meal("Pizza biancaneve", "Pizza with mozzarella cheese", 6.5)};
//    private List<Meal> newList = new ArrayList<>(List.of(newMealArray));
//
////
////    Exercise 1: Create a PutMapping to add a new meal
////
////    1 - Create a new endpoint "/meal" using the @PostMapping annotation.
////    2 - In the method, add a RequestBody for the new Meal object.
////    3 - Add the new meal for the list of meals.
//
//    @PutMapping("/meal")
//    public ResponseEntity<String> putMeals(@RequestBody Meal meal){
//        this.newList.add(meal);
//        return ResponseEntity.ok("A new meal has been added!");
//    }
//
////    Exercise 2: Create a PostMapping to update a meal by name
////
////    1 - Create a new endpoint "/meal/{name}" using the @PutMapping annotation.
////    2 - In the method, add a PathVariable for the name and a RequestBody for the updated Meal object.
////    3 - Update the meal with the corresponding name using the information from the RequestBody.
//
//    @PostMapping("/meal/{name}")
//    public ResponseEntity<String> postMeal(@PathVariable("name") String name, @RequestBody Meal meal){
//       this.newList.removeIf(m -> m.getName().equals(meal.getName()));
//       this.newList.add(meal);
//       return ResponseEntity.ok("A meal has been updated");
//    }
//
////    Exercise 3: Create a DeleteMapping to delete a meal by name
////
////    1 - Create a new endpoint "/meal/{name}" using the @DeleteMapping annotation.
////    2 - In the method, add a PathVariable for the name.
////    3 - Delete the meal with the corresponding name.
//
//    @DeleteMapping("/meal/{name}")
//    public ResponseEntity<String> deleteMeal (@PathVariable("name") String mealName){
//        this.newList.removeIf(m -> m.getName().equals(mealName));
//        return ResponseEntity.ok("A meal has been deleted!");
//    }
//
////    Exercise 4: Create a DeleteMapping to delete all meals above a certain price
////
////    1 - Create a new endpoint "/meal/price/{price}" using the @DeleteMapping annotation.
////    2 - In the method, add a PathVariable for the price.
////    3 - Delete all meals with a price above the price from the PathVariable.
//
//    @DeleteMapping("/meal/price/{price}")
//    public ResponseEntity<String> deleteExpensiveMeals (@PathVariable("price") String mealPrice){
//        this.newList.removeIf(m -> m.getPrice() >= 9.5);
//        return ResponseEntity.ok("Expensive meal deleted!");
//    }
//
////    Exercise 5: Create a PutMapping to update the price of a meal by name
////
////    1 - Create a new endpoint "/meal/{name}/price" using the @PutMapping annotation.
////    2 - In the method, add a PathVariable for the name and a RequestBody for the updated price.
////    3 - Update the price of the meal with the corresponding name using the information from the RequestBody.
//
//    @PutMapping("/meal/{name}/price")
//    public ResponseEntity<String> updatePrice (@PathVariable("name") String mealName, @RequestBody double price){
//        for (Meal m : newList) {
//            if (m.getName().equals(mealName)){
//                m.setPrice(price);
//                return ResponseEntity.ok("Price updated");
//            }
//        } return ResponseEntity.badRequest().body("Can't update price");
//    }




//}
