package com.example.Develhope_Spring.controllers;

import jdk.jshell.Snippet;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Postman_requests {

//    Exercise 1: Create a GetMapping that returns a basic "string" as a response
//
//1 - Create a new endpoint "/hello" using the @GetMapping annotation.
// 2 - In the method, return a simple string such as "Hello World!".

    @GetMapping("/hello")
    public String string() {
        return "Hello World!";
    }

//    Exercise 2: Create a GetMapping that returns a ResponseEntity as a response
//
//1 - Create a new endpoint "/greeting" using the @GetMapping annotation.
//2 - In the method, return a ResponseEntity object with a string message such as "Good Afternoon!".
//3 - You can also set the HTTP status code in the ResponseEntity, such as "200 OK".

    @GetMapping("/greeting")
    public ResponseEntity<String> responseEntity() {
        return new ResponseEntity<>("Good Afternoon!", HttpStatusCode.valueOf(200));
//        return ResponseEntity.ok("Good Afternoon!");
    }

//    Exercise 3: Create a new class with a GetMapping that returns a ResponseEntity a
//
//1 - Annotate a new class with the @RestController annotation.
//2 - Create a new endpoint "/info" using the @GetMapping annotation.
//3 - In the method, return a ResponseEntity with 200 OK

    /* Mi pare superfluo creare un'altra classe solo per inserire un nuovo endpoint
    e fondamentalmente rifare lo stesso esercizio di prima.*/

    @GetMapping("/info")
    public ResponseEntity<String> status(){
        return ResponseEntity.ok().build();
    }

//    Exercise 4: Create a GetMapping that returns 400 - Bad request or 200 - OK based on a random boolean
//
//1 - Annotate a new class with the @RestController annotation.
//2 - Create a new endpoint "/random" using the @GetMapping annotation.
//3 - In the method, return a ResponseEntity with 200 OK or 400 Bad Request based on the result of new Random().nextBoolean()

    /* ignoro il punto 1 come nell'esercizio precedente*/

    @GetMapping("/random")
    public ResponseEntity<String> randomBoolean(){
        boolean random = new Random().nextBoolean();
        if (random){
            return ResponseEntity.ok("It's true!");
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}



