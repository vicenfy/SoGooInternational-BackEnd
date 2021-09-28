package com.example.springboot.entity;
import javax.persistence.*;

@Entity
@Table(name = "odf_sgi_as_cameras")
@PrimaryKeyJoinColumn(name="id")
public class ASCamera extends Camera {
    public ASCamera() {
        super();
    }
//#sensor#Sensor type#Pixel size#Sensor size#Dynamic range#SNR#Gain#Exposure time#Pixel format#Image buffer#Power consumption#Ingress protection#Compatibility#Operating system  这块AC和LC相机都有
//#Max. Frame Rate#Shutter mode#Binning#Decimation#Reverse image 特有
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

//    特有
    @Column(name = "max_frame_rate")
    private String maxFrameRate;

    @Column(name = "shutter_mode")
    private String shutterMode;

    @Column(name = "binning")
    private String binning;

    @Column(name = "decimation")
    private String decimation;

    @Column(name = "reverse_image")
    private String reverseImage;

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

    public String getMaxFrameRate() {
        return maxFrameRate;
    }

    public void setMaxFrameRate(String maxFrameRate) {
        this.maxFrameRate = maxFrameRate;
    }

    public String getShutterMode() {
        return shutterMode;
    }

    public void setShutterMode(String shutterMode) {
        this.shutterMode = shutterMode;
    }

    public String getBinning() {
        return binning;
    }

    public void setBinning(String binning) {
        this.binning = binning;
    }

    public String getDecimation() {
        return decimation;
    }

    public void setDecimation(String decimation) {
        this.decimation = decimation;
    }

    public String getReverseImage() {
        return reverseImage;
    }

    public void setReverseImage(String reverseImage) {
        this.reverseImage = reverseImage;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

}
