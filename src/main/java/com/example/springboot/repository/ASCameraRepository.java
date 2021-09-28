package com.example.springboot.repository;

import com.example.springboot.entity.ASCamera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ASCameraRepository extends JpaRepository<ASCamera, Long> {
}
