package com.practice.firstspringbootapp;

import org.springframework.stereotype.Component;

@Component
public class GeneralMealService implements MealService{
    @Override
    public String getMeal() {
        return "Veggie lasagne";
    }
}
