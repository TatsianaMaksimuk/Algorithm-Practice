package com.careerdevs.hellointernet.controllers;

import com.careerdevs.hellointernet.GetMappingService;
import com.careerdevs.hellointernet.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/get")
public class GetController {
    @Autowired
    GetMappingService service;

    @GetMapping("/string")
    public String getString(){
        return "default";
    }

    @GetMapping("/list")
    public List<String> getList(){
        List<String> itemList = Arrays.asList("Item1", "Item2"," Item3");
        return itemList;
    }


    @GetMapping("/object")
    public List<Item> getObject(){
        List<Item> itemList = Arrays.asList(
                new Item(1,"Cup"),
                new Item(2,"Stone"));
        return itemList;
    }

    @GetMapping("/object2")
    public List<Item> getObject2(){
        return service.getAllItems();
    }

    @GetMapping("/objectbyid/{id}")
    public List<Item> getObjectById(@PathVariable int id){
        //fetch the object by id
        return service.getItemById(id);

    }
}
