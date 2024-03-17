package com.map.controller;

import com.map.entity.MapComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1")
public class Controller {
    @Autowired
    private MapComponent component;
    @GetMapping("/getFruitCount")
    public Map<String, Integer> getFruitCount(){
        return component.getFruitCount();
    }
}
