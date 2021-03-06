package com.example.springboot.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CPF;

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

    @Column(columnDefinition="TEXT", name = "product_introduction")
    private String productIntroduction;

//Type#resolution#Data Interface#MonoColor#Digital I/O#Power supply#Lens Interface#Dimension#Weight#Temperature#Humidity#Client software#Certification
//  Type:像素（什么类型的相机）
    @Column(name = "type")
    private String type;

    @Column(name = "resolution")
    private String resolution;

    //接口
    @Column(name = "data_interface")
    private String dataInterface;

    @Column(name = "mono_color")
    private String monoColor;

    @Column(name = "digital_io")
    private String digitalIO;

    @Column(name = "power_supply")
    private String powerSupply;

    @Column(name = "lens_interface")
    private String lensInterface;

    @Column(name = "dimension")
    private String dimension;

    @Column(name = "weight")
    private String weight;

    @Column(name = "temperature")
    private String temperature;

    @Column(name = "humidity")
    private String humidity;

    @Column(name = "client_software")
    private String clientSoftware;

    @Column(name = "certification")
    private String certification;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDataInterface() {
        return dataInterface;
    }

    public void setDataInterface(String dataInterface) {
        this.dataInterface = dataInterface;
    }

    public String getMonoColor() {
        return monoColor;
    }

    public void setMonoColor(String monoColor) {
        this.monoColor = monoColor;
    }

    public String getDigitalIO() {
        return digitalIO;
    }

    public void setDigitalIO(String digitalIO) {
        this.digitalIO = digitalIO;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getLensInterface() {
        return lensInterface;
    }

    public void setLensInterface(String lensInterface) {
        this.lensInterface = lensInterface;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getClientSoftware() {
        return clientSoftware;
    }

    public void setClientSoftware(String clientSoftware) {
        this.clientSoftware = clientSoftware;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
