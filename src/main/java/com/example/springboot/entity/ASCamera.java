package com.example.springboot.entity;
import javax.persistence.*;

@Entity
@Table(name = "odf_sgi_as_cameras")
@PrimaryKeyJoinColumn(name="id")
public class ASCamera extends Camera {
    public ASCamera() {
        super();
    }

    @Column(name = "operation_system")
    private String operationSystem;

    @Column(name = "certification")
    private String certification;

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
