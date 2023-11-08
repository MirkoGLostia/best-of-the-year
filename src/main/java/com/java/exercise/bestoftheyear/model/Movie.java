package com.java.exercise.bestoftheyear.model;

public class Movie {
    // attributes
    private final int idMovie;
    private final String titleMovie;

    public Movie(int idMovie, String titleMovie) throws IllegalArgumentException {
        if (titleMovie == null || titleMovie.isBlank()) {
            throw new IllegalArgumentException("you need to set the title of the film");
        }
        this.idMovie = idMovie;
        this.titleMovie = titleMovie;
    }

    public int getId() {
        return idMovie;
    }

    public String getTitle() {
        return titleMovie;
    }
}
