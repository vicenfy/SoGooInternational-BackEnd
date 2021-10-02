package com.example.springboot.controller;

import com.example.springboot.entity.Attribute;
import com.example.springboot.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping("attributes")
    public Attribute createAttribute(@Valid @RequestBody Attribute attribute) {
        return attributeRepository.save(attribute);
    }

}