package com.app.kahaani.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.kahaani.model.Story;
import com.app.kahaani.service.StoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class KahaaniController {
    @Autowired
    private StoryService storyService;
    @RequestMapping("/hello")
    public String hello(){
        return "Welcome to the kahaani ...";
    }

    @PostMapping("/story")
    public Story addStory(@RequestBody Story story) {
        return storyService.saveStory(story);
    }
    
}
