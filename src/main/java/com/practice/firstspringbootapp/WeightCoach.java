package com.practice.firstspringbootapp;

import org.springframework.stereotype.Component;

@Component
public class WeightCoach implements Coach{

    private MealService mealService;

    public WeightCoach(MealService mealService) {
        this.mealService = mealService;
    }

    @Override
    public String getExercise() {
        return "10 Push Ups";
    }

    @Override
    public String getMeal() {
        return mealService.getMeal();
    }
}
