package com.example.Develhope_Spring.dao;

import com.example.Develhope_Spring.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientDao extends JpaRepository<Ingredient, Long> {

}
