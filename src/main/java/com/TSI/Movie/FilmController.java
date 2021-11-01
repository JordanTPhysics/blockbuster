package com.TSI.Movie;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

    @RequestMapping
    public String testy(){
        return "Hello World my friend";
    }

}
