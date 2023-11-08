package com.java.exercise.bestoftheyear.model;

import java.util.Random;

public class Movies {
    // attributes
    private final int idMovie;
    private final String titleMovie;

    public Movies(String titleMovie) throws IllegalArgumentException {
        if (titleMovie == null || titleMovie.isBlank()) {
            throw new IllegalArgumentException("you need to set the title of the film");
        }
        Random randomNumber = new Random();
        this.idMovie = randomNumber.nextInt(10000, 99999);
        this.titleMovie = titleMovie;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public String getTitleMovie() {
        return titleMovie;
    }
}
