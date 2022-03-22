package com.stackjava.springboothello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    public int subtract(int firstNumber, int secondNumber) {
    	Integer myInt = null;
    	Integer yourInt = myInt * 2;
    	return firstNumber - secondNumber;
    }
}
