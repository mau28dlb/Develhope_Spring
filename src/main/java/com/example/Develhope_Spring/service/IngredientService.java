package com.example.Develhope_Spring.service;

import com.example.Develhope_Spring.dao.IngredientDao;
import com.example.Develhope_Spring.entities.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredientService {

    private IngredientDao ingredientDao;

    @Autowired
    public IngredientService(IngredientDao ingredientDao){
        this.ingredientDao = ingredientDao;
    }

    //Create
    public Ingredient createIngredient (Ingredient ingredient){
        return ingredientDao.save(ingredient);
    }

    //Read
    public Ingredient retrieveIngredientById(Long id){
        return ingredientDao.findById(id).get();
    }

    //Update
    public Ingredient updateIngredient(Long id){
        Optional<Ingredient> ingredient = ingredientDao.findById(id);
        Ingredient updatedIngredient = new Ingredient();
        if (ingredient.isPresent()){
            updatedIngredient.setName(ingredient.get().getName());}
        return updatedIngredient;
    }

    //Delete
    public void deleteIngredient(Long id){
        ingredientDao.deleteById(id);
    }


}
