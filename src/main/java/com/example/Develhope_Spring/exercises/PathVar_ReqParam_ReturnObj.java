package com.example.Develhope_Spring.exercises;

import com.example.Develhope_Spring.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@RestController
//public class PathVar_ReqParam_ReturnObj {

    //    Exercise 1: Create a GetMapping that returns a list of meals
//
//    1 - Annotate a new class with the @RestController annotation.
//    2 - Create a new endpoint "/meals" using the @GetMapping annotation.
//    3 - In the method, return a list of Meal objects.
//    private List<Meal> mealList = Arrays.asList(
//            new Meal("Pizza margherita", "Pizza with tomato sauce, mozzarella cheese and basil", 8.0),
//            new Meal("Pizza romana", "Pizza with tomato sauce, mozzarella cheese and ham", 9.5),
//            new Meal("Pizza biancaneve", "Pizza with mozzarella cheese", 6.5)
//    );

//    @GetMapping("/meals")
//    public List<Meal> getMealList() {
//
//        return mealList;
//    }
//
////    Exercise 2: Create a GetMapping that returns a meal by name
////
////    1 - Annotate a new class with the @RestController annotation.
////    2 - Create a new endpoint "/meal/{name}" using the @GetMapping annotation.
////    3 - In the method, add a query parameter "name" using the @PathVariable annotation.
////    4 - Return a Meal object with the corresponding name.
//
//    @GetMapping("/meal/{name}")
//    public ResponseEntity<?> getMealByName(
//            @PathVariable("name") String name) {
//        return ResponseEntity.ok((mealList.stream().filter(meal -> (meal.getName().equals(name))).collect(Collectors.toList())));
//    }
//
////    Exercise 3: Create a GetMapping that returns a meal by any word of description
////
////    1 - Annotate a new class with the @RestController annotation.
////    2 - Create a new endpoint "/meal/description-match/{phrase}" using the @GetMapping annotation.
////    3 - In the method, add a query parameter "description" using the @PathVariable annotation.
////    4 - Return a Meal object with the corresponding description.
//
//    @GetMapping("meal/description-match/{phrase}")
//    public ResponseEntity<?> getMealByDescription(
//            @PathVariable("phrase") String phrase) {
//        return ResponseEntity.ok((mealList.stream().filter(meal -> meal.getDescription().equals(phrase))).collect(Collectors.toList()));
//    }
//
////    Exercise 4: Create a GetMapping that returns a meal by price range
////
////    1 - Annotate a new class with the @RestController annotation.
////    2 - Create a new endpoint "/meal/price" using the @GetMapping annotation.
////    3 - In the method, add two query parameters "min" and "max" using the @RequestParam annotation.
////    4 - Return a list of Meal objects with prices within the specified range.
//
//    @GetMapping("/meal/price")
//    public ResponseEntity<?> getMealsByPriceRange(
//            @RequestParam("min") double min,
//            @RequestParam("max") double max) {
//        return ResponseEntity.ok(mealList.stream().filter(meal -> (meal.getPrice() >= min && meal.getPrice() <= max)).collect(Collectors.toList()));
//    }
//
//}
