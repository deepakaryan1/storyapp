package com.app.kahaani.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.kahaani.model.Story;
import com.app.kahaani.repo.StoryRepo;

@Service
public class StoryService {
    @Autowired
    private StoryRepo storyRepo;

    public Story saveStory(Story story){
        return storyRepo.save(story);
    }

}
