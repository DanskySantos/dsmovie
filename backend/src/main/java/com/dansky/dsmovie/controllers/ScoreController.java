package com.dansky.dsmovie.controllers;

import com.dansky.dsmovie.dto.MovieDTO;
import com.dansky.dsmovie.dto.ScoreDTO;
import com.dansky.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO) {
        MovieDTO dto = service.saveScore(scoreDTO);
        return dto;
    }
}
