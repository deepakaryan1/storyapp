package com.app.kahaani.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.kahaani.model.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

    
} 