package com.example.jump.controller;

import com.example.jump.entity.City;
import com.example.jump.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;


    @GetMapping
    public ResponseEntity<List<City>> getAllCities(){
        return ResponseEntity.ok(cityService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<City> createCity(@RequestBody City city) {
        return  ResponseEntity.ok(cityService.save(city));
    }

}
