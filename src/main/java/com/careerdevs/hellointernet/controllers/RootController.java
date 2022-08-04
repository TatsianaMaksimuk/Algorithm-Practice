package com.careerdevs.hellointernet.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
public class RootController {

    @GetMapping("/")
    private String routeRoute(){
        return "You requested the root route";
    }

    @GetMapping("/hello")
    private String helloCareerDevs(){
        return "Hello, CareerDevs!";
    }

    @GetMapping("/me")
    private String me() {
        return "it's me";
    }

    @GetMapping("/meet")
    private String meet() {
        return "I was wondering if after all these years you'd like to meet";
    }

    //bonus
    @GetMapping("/random")
    private int random(){
        Random random = new Random();
        int upperbound = 1000;
        int randomInt = random.nextInt(upperbound);
        return randomInt;
    }
}
