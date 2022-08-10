package com.careerdevs.hellointernet;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetMappingService {
    public List<Item> getAllItems() {
        List<Item> itemObject = new ArrayList<Item>();
        itemObject.add(new Item(1, "card"));
        itemObject.add(new Item(2, "id"));
        itemObject.add(new Item(3, "cellphone"));
        return itemObject;
    }

    //the Stream API is used to process collections
    //of objects. A stream is a sequence of objects
    //that supports various methods which can be
    //pipelined to produce the desired result.

    //We can use Stream collect() function to perform a mutable reduction operation and concatenate the list elements.
    public List<Item> getItemById(int id){
        return getAllItems().stream().filter(item -> item.getItemNum()==id).collect(Collectors.toList());
    }
}
