package com.example.Develhope_Spring.dao;

import com.example.Develhope_Spring.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealDao extends JpaRepository<Meal, Long> {
    List<Meal> findByIsSummerMeal(boolean isSummerMeal);
    List<Meal> findByIsWinterMeal(boolean isWinterMeal);
}
