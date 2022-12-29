package com.example.imrdi.controller;

import com.example.imrdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getHello(){
        return greetingService.sayGreeting();
    }
}
