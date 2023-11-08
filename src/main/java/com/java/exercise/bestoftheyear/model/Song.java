package com.java.exercise.bestoftheyear.model;

import java.util.Random;

public class Song {
    // attributes
    private final int idSong;
    private final String titleSong;
    public static Random randomNumber = new Random(13);

    public Song(String titleSong) throws IllegalArgumentException {
        if (titleSong == null || titleSong.isBlank()) {
            throw new IllegalArgumentException("you need to set the title of the song");
        }
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
