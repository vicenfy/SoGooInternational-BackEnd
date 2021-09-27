package com.example.springboot.controller;


import com.example.springboot.entity.Camera;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CameraController {
    @Autowired
    CameraRepository cameraRepository;

    //get all cameras
    @GetMapping("cameras")
    public List<Camera> getAllCameras() {
        return this.cameraRepository.findAll();
    }

    //get camera by ID
    @GetMapping("cameras/{id}")
    public ResponseEntity<Camera> getCameraById(@PathVariable(value = "id") long cameraId) {
        Camera camera = cameraRepository.findById(cameraId).orElseThrow(() -> new ResourceNotFoundException("Camera not found!"));
        return ResponseEntity.ok().body(camera);
    }

    //add camera
    @PostMapping("cameras")
    public Camera createCamera(@Valid @RequestBody Camera camera) {
        return cameraRepository.save(camera);
    }


}
