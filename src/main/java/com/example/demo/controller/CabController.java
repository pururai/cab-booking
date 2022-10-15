package com.example.demo.controller;

import com.example.demo.dto.CabDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cab")
public class CabController {

    @PostMapping("/add")
    public void addCab(@RequestBody CabDto cabDto) {

    }
}
