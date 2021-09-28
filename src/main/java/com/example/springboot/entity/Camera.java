package com.example.springboot.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Table(name = "odf_sgi_cameras")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class Camera {
    public Camera() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "product_type")
    private String productType;

    @NotNull
    @Size(min = 5, message = "Product model should have at least 5 characters")
    @Column(name = "product_model")
    private String productModel;

    @NotNull
    @Column(columnDefinition="TEXT", name = "product_introduction")
    private String productIntroduction;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductIntroduction() {
        return productIntroduction;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
