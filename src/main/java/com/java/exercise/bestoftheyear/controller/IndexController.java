package com.java.exercise.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("home")
    public String home(Model model) {
        String name = "Mirko";
        model.addAttribute("ownerName", name);
        return "home-page";
    }
}
