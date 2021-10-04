package com.example.springboot.entity;
import javax.persistence.*;

@Entity
@Table(name = "odf_sgi_as_cameras")
@PrimaryKeyJoinColumn(name="id")
public class LSCamera extends Camera {
    public LSCamera() {
        super();
    }

    @Column(name = "sensor")
    private String sensor;

    @Column(name = "sensor_type")
    private String sensorType;

    @Column(name = "pixel_size")
    private String pixelSize;

    @Column(name = "sensor_size")
    private String sensorSize;

    @Column(name = "dynamic_range")
    private String dynamicRange;

    @Column(name = "snr")
    private String snr;

    @Column(name = "gain")
    private String gain;

    @Column(name = "exposure_time")
    private String exposureTime;

    @Column(name = "pixel_format")
    private String pixelFormat;

    @Column(name = "image_buffer")
    private String imageBuffer;

    @Column(name = "power_consumption")
    private String powerConsumption;

    @Column(name = "ingress_protection")
    private String ingressProtection;

    @Column(name = "compatibility")
    private String compatibility;

    @Column(name = "operation_system")
    private String operationSystem;

//    #Max. Line Rate#External trigger mode#Synchronization trigger mode#
    @Column(name = "max_line_rate")
    private String maxLineRate;

    @Column(name = "external_trigger_mode")
    private String externalTriggerMode;

    @Column(name = "synchronization_trigger_mode")
    private String synchronizationTriggerMode;

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getPixelSize() {
        return pixelSize;
    }

    public void setPixelSize(String pixelSize) {
        this.pixelSize = pixelSize;
    }

    public String getSensorSize() {
        return sensorSize;
    }

    public void setSensorSize(String sensorSize) {
        this.sensorSize = sensorSize;
    }

    public String getDynamicRange() {
        return dynamicRange;
    }

    public void setDynamicRange(String dynamicRange) {
        this.dynamicRange = dynamicRange;
    }

    public String getSnr() {
        return snr;
    }

    public void setSnr(String snr) {
        this.snr = snr;
    }

    public String getGain() {
        return gain;
    }

    public void setGain(String gain) {
        this.gain = gain;
    }

    public String getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(String exposureTime) {
        this.exposureTime = exposureTime;
    }

    public String getPixelFormat() {
        return pixelFormat;
    }

    public void setPixelFormat(String pixelFormat) {
        this.pixelFormat = pixelFormat;
    }

    public String getImageBuffer() {
        return imageBuffer;
    }

    public void setImageBuffer(String imageBuffer) {
        this.imageBuffer = imageBuffer;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getIngressProtection() {
        return ingressProtection;
    }

    public void setIngressProtection(String ingressProtection) {
        this.ingressProtection = ingressProtection;
    }

    public String getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getMaxLineRate() {
        return maxLineRate;
    }

    public void setMaxLineRate(String maxLineRate) {
        this.maxLineRate = maxLineRate;
    }

    public String getExternalTriggerMode() {
        return externalTriggerMode;
    }

    public void setExternalTriggerMode(String externalTriggerMode) {
        this.externalTriggerMode = externalTriggerMode;
    }

    public String getSynchronizationTriggerMode() {
        return synchronizationTriggerMode;
    }

    public void setSynchronizationTriggerMode(String synchronizationTriggerMode) {
        this.synchronizationTriggerMode = synchronizationTriggerMode;
    }
}