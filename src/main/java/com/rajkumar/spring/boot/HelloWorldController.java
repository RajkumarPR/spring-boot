package com.rajkumar.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class HelloWorldController {


    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

}
