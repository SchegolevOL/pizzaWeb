package com.example.pizzaweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    String [] pizzas={"Маргарита", "Четыре сыра", "Капричоза"};
    @GetMapping("/")
    public String getHome(){
        return "home";
    }
    @GetMapping("/pizza")
    public String getPizza(){

        return "pizza";
    }
    @PostMapping("/pizza")
    public String pizza(Model model, String pizza){
        model.addAttribute("pizza", pizza);
        return "pizza";
    }
}
