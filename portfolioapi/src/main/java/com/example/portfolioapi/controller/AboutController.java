package com.example.portfolioapi.controller;

import com.example.portfolioapi.model.About;
import com.example.portfolioapi.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/about")
public class AboutController {

    @Autowired
    private AboutRepository aboutRepository;

    @GetMapping
    public List<About> getAbout() {
        return aboutRepository.findAll();
    }
}
