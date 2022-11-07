package com.practice.firstspringbootapp;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class GeneralMealService implements MealService{

    private final List<String> mealList = new ArrayList<>();

    @PostConstruct
    private void postConstruct() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/meals.txt"));
        String line = bf.readLine();
        while (line != null){
            mealList.add(line);
            line = bf.readLine();
        }
        bf.close();
    }
    @Override
    public String getMeal() {
        Random randomNumber = new Random();
        int index = randomNumber.nextInt(mealList.toArray().length);
        return mealList.get(index);
    }
}
