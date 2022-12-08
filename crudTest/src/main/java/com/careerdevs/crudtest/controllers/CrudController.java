package com.careerdevs.crudtest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

//Annotation:
@RestController//now this class can use routers
@RequestMapping("/api/data") //sets a particular  path (here /api)  and http method
public class CrudController {

    @GetMapping()
    public ResponseEntity<?> getData (){
        return ResponseEntity.ok("You got data");
    }

    @PostMapping
    public ResponseEntity<?> postData (){
        return ResponseEntity.ok("You posted data");
    }

    @PatchMapping
    public ResponseEntity<?> patchData (){
        return ResponseEntity.ok("You patched data");
    }

    @PutMapping
    public ResponseEntity<?> putData (){
        return ResponseEntity.ok("You put data");
    }

    @DeleteMapping
    public ResponseEntity<?> deleteData (){
        return ResponseEntity.ok("You deleted data");
    }

   //pathvariable - only one peace of dynamic info
   //http://localhost:8080/api/data/test/name
    @GetMapping("/test/{name}")
    public ResponseEntity<?> rmTest (@PathVariable (name = "name") String userName){
        return ResponseEntity.ok("It's a test" + userName);
    }

    //http://localhost:8080/api/data/test/name
    @GetMapping("/test")
    public ResponseEntity<?> rmTestRP (@RequestParam (name = "name") String userName,
                                       @RequestParam (name = "age") String userAge){
        return ResponseEntity.ok("It's a test: " + userName + " is " + userAge + " years old.");
    }
}
