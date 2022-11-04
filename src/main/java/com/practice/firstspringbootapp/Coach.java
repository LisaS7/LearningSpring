package com.practice.firstspringbootapp;

import java.io.IOException;

public interface Coach {
    public String getExercise();
    public String getMeal() throws IOException;
}
