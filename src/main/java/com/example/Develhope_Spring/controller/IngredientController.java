package com.example.Develhope_Spring.controller;

import com.example.Develhope_Spring.entities.Ingredient;
import com.example.Develhope_Spring.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IngredientController {

    IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping("/create")
    public ResponseEntity<Ingredient> createIngredient(@RequestBody Ingredient ingredient){
        Ingredient newIngredient = ingredientService.createIngredient(ingredient);
        return ResponseEntity.ok().body(newIngredient);
    }

    @GetMapping("/get")
    public ResponseEntity<Ingredient> getIngredientById(@RequestParam Long id){
        Ingredient ingredient = ingredientService.retrieveIngredientById(id);
        return ResponseEntity.ok().body(ingredient);
    }

    @PutMapping("/update")
    public ResponseEntity<Ingredient> updateIngredientById(@RequestBody Ingredient ingredient, @RequestParam Long id){
        Ingredient updatedIngredient = ingredientService.updateIngredient(id);
        return ResponseEntity.ok().body(updatedIngredient);
    }

    @DeleteMapping("/delete")
    public void deleteIngredientById(@RequestParam Long id){
        ingredientService.deleteIngredient(id);
    }

}
