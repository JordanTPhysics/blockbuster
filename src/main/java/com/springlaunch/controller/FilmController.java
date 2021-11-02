package com.springlaunch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FilmController {
    public String hi = "Hello how are you?";
    @GetMapping("/data")
            public String sayhi(){
                return hi;
            }

}
