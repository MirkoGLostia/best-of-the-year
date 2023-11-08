package com.java.exercise.bestoftheyear.controller;

import com.java.exercise.bestoftheyear.model.Movie;
import com.java.exercise.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping
public class IndexController {

    private List<Movie> getMoviesList() {
        Movie[] moviesArray = {new Movie(1, "film1"),new Movie(2, "film2"),new Movie(3, "film3"),new Movie(4, "film4"),new Movie(5, "film5"),};
        return Arrays.asList(moviesArray);
    }

    private List<Song> getSongsList() {
        Song.randomNumber = new Random(13);
        Song[] songsArray = {new Song("song1"),new Song("song2"),new Song("song3"),new Song("song4"),new Song("song5"),};
        return Arrays.asList(songsArray);
    }


    @GetMapping("/")
    public String home(Model model) {
        String name = "Mirko";
        model.addAttribute("ownerName", name);
        return "home-page";
    }

    @GetMapping("/movies")
    public String movieList(Model model) {
        String name = "Mirko";
        String pageSector = "movies";
        model.addAttribute("pageSector", pageSector);
        model.addAttribute("ownerName", name);
        model.addAttribute("stringList", getMoviesList());
        return "home-page";
    }

    @GetMapping("/songs")
    public String songList(Model model) {
        String name = "Mirko";
        String pageSector = "songs";
        model.addAttribute("pageSector", pageSector);
        model.addAttribute("ownerName", name);
        model.addAttribute("stringList", getSongsList());
        return "home-page";
    }

    @GetMapping("/movies/{id}")
    public String movieDetail(@PathVariable("id") int movieId, Model model) {
        Movie movie = getMovieById(movieId);
        model.addAttribute("detail", movie);
        return "details-page";
    }

    @GetMapping("/songs/{id}")
    public String songDetail(@PathVariable("id") int songId, Model model) {
        Song song = getSongById(songId);
        model.addAttribute("detail", song);
        return "details-page";
    }


    // useful methods

    private Movie getMovieById(int id) {

        for (Movie movie : getMoviesList()) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    private Song getSongById(int id) {

        for (Song song : getSongsList()) {
            if (song.getId() == id) {
                return song;
            }
        }
        return null;
    }

}
