package com.example.springboot.controller;


import com.example.springboot.entity.ASCamera;
import com.example.springboot.entity.Camera;
import com.example.springboot.repository.ASCameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ASCameraController {
    @Autowired
    ASCameraRepository asCameraRepository;

    //get all cameras
    @GetMapping("ascameras")
    public List<ASCamera> getAllCameras() {
        return this.asCameraRepository.findAll();
    }

    @PostMapping("ascameras")
    public Camera createCamera(@Valid @RequestBody ASCamera ascamera) {
        return asCameraRepository.save(ascamera);
    }

}
