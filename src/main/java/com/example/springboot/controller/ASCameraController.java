package com.example.springboot.controller;


import com.example.springboot.entity.ASCamera;
import com.example.springboot.entity.Camera;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.repository.ASCameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    //get camera by ID
    @GetMapping("ascameras/{id}")
    public ResponseEntity<Camera> getCameraById(@PathVariable(value = "id") long cameraId) {
        Camera camera = asCameraRepository.findById(cameraId).orElseThrow(() -> new ResourceNotFoundException("Camera not found!"));
        return ResponseEntity.ok().body(camera);
    }

    @PostMapping("ascameras")
    public Camera createCamera(@Valid @RequestBody ASCamera ascamera) {
        return asCameraRepository.save(ascamera);
    }



}
