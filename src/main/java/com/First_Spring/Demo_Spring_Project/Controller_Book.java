package com.First_Spring.Demo_Spring_Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller_Book {

    @GetMapping( "/books" )
    public List< Book > get_all_books(){

        return Arrays.asList( new Book( 100 , "Live with clarity" , "Sunny Khandare" ) );
    }
}
