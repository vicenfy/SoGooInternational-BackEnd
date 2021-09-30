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

    //    // Update smart phone by id
//    @PutMapping("smartphones/{id}")
//    public ResponseEntity<SmartPhone> updateSmartPhone(@PathVariable(value = "id") long smartPhoneId, @Valid @RequestBody SmartPhone updateSmartPhone) {
//        SmartPhone smartPhone = smartPhoneRepository.findById(smartPhoneId).orElseThrow(() -> new ResourceNotFoundException("Smart phone not found"));
//        smartPhone.setName(updateSmartPhone.getName());
//        smartPhone.setPrice(updateSmartPhone.getPrice());
//        smartPhone.setStatus(updateSmartPhone.isStatus());
//        SmartPhone editSmartPhone = smartPhoneRepository.save(smartPhone);
//        return ResponseEntity.ok().body(editSmartPhone);
//    };
//
//    // Delete smart phone by id
//    @DeleteMapping("smartphones/{id}")
//    public Map<String, Boolean> deleteSmartPhone(@PathVariable(value = "id") long smartPhoneId) {
//        SmartPhone smartPhone = smartPhoneRepository.findById(smartPhoneId).orElseThrow(() -> new ResourceNotFoundException("Smart phone not found"));
//        this.smartPhoneRepository.delete(smartPhone);
//        Map<String, Boolean> respone = new HashMap<>();
//        respone.put("deleted: ", Boolean.TRUE);
//        return respone;
//    };


}
