package com.java.exercise.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {


    private String[] getBestMovies() {
        return new String[]{"film1", "film2", "film3", "film4", "film5"};
    }

    private String[] getBestSongs() {
        return new String[]{"music1", "music2", "music3", "music4", "music5"};
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
        model.addAttribute("stringList", getBestMovies());
        return "home-page";
    }

    @GetMapping("/songs")
    public String songList(Model model) {
        String name = "Mirko";
        model.addAttribute("ownerName", name);
        model.addAttribute("stringList", getBestSongs());
        return "home-page";
    }

}
