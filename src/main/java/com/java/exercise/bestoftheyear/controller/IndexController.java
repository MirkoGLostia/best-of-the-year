package com.java.exercise.bestoftheyear.controller;

import com.java.exercise.bestoftheyear.model.Movies;
import com.java.exercise.bestoftheyear.model.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class IndexController {

    private List<Movies> getMoviesList() {
        Movies[] moviesArray = {new Movies("film1"),new Movies("film2"),new Movies("film3"),new Movies("film4"),new Movies("film5"),};
        return Arrays.asList(moviesArray);
    }

    private List<Songs> getSongsList() {
        Songs[] songsArray = {new Songs("song1"),new Songs("song2"),new Songs("song3"),new Songs("song4"),new Songs("song5"),};
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
        model.addAttribute("ownerName", name);
        model.addAttribute("stringList", getMoviesList());
        return "home-page";
    }

    @GetMapping("/songs")
    public String songList(Model model) {
        String name = "Mirko";
        model.addAttribute("ownerName", name);
        model.addAttribute("stringList", getSongsList());
        return "home-page";
    }

}
