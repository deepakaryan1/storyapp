package com.app.kahaani.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KahaaniController {

    @RequestMapping("/hello")
    public String hello(){
        return "Welcome to the kahaani ...";
    }
}
