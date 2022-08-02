package com.careerdevs.hellointernet.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


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

    @GetMapping("/itsme")
    private String itsme() {
        return "it's me...";
    }

    @GetMapping("/meet")
    private String meet() {
        return "I was wondering if after all these years you'd like to meet";
    }
}
