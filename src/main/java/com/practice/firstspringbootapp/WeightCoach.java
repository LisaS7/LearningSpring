package com.practice.firstspringbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeightCoach implements Coach{
    @Autowired
    private MealService mealService;

    public WeightCoach() {
        System.out.println("default constructor called");
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
