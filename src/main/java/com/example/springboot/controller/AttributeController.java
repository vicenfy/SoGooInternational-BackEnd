package com.example.springboot.controller;


import com.example.springboot.entity.ASCamera;
import com.example.springboot.entity.Attribute;
import com.example.springboot.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class AttributeController {
    @Autowired
    AttributeRepository attributeRepository;

    //get all attributes
    @GetMapping("attributes")
    public List<Attribute> getAllAttributes() {
        return this.attributeRepository.findAll();
    }
}