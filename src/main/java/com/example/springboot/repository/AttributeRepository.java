package com.example.springboot.repository;

import com.example.springboot.entity.ASCamera;
import com.example.springboot.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeRepository extends JpaRepository<Attribute, Long>  {
}
