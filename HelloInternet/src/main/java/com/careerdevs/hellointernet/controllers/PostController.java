package com.careerdevs.hellointernet.controllers;

import com.careerdevs.hellointernet.GetMappingService;
import com.careerdevs.hellointernet.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    GetMappingService service;


    @GetMapping("/getAllItems")
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody Item item) {
        service.addItems(item);

    }

}
