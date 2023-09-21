package com.example.try4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
    @GetMapping("/")
    ModelAndView return1() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
    @GetMapping("/Adwait , method = RequestMethod.POST")
	String return2(){
		return "Hello AdWAit";
    }
}
