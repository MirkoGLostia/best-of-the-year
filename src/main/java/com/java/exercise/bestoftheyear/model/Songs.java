package com.java.exercise.bestoftheyear.model;

import java.util.Random;

public class Songs {
    // attributes
    private final int idSong;
    private final String titleSong;

    public Songs(String titleSong) throws IllegalArgumentException {
        if (titleSong == null || titleSong.isBlank()) {
            throw new IllegalArgumentException("you need to set the title of the song");
        }
        Random randomNumber = new Random();
        this.idSong = randomNumber.nextInt(10000, 99999);
        this.titleSong = titleSong;
    }

    public int getId() {
        return idSong;
    }

    public String getTitle() {
        return titleSong;
    }
}
