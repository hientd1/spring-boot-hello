package com.stackjava.springboothello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    public Integer getString (int a, int b) {
    	return b/a;
    }
}
