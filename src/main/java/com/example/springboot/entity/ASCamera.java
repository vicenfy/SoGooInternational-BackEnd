package com.example.springboot.entity;
import javax.persistence.*;

@Entity
@Table(name = "odf_sgi_as_cameras")
@PrimaryKeyJoinColumn(name="id")
public class ASCamera extends Camera{
    public ASCamera() {
        super();
    }

    @Column(name = "operation_system")
    private String operationSystem;

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
