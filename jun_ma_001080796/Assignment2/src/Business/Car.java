/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

/**
 *
 * @author 52909
 */

public class Car {
    private boolean available;//当前可用状态
    
    private Point x;//当前二维坐标   
    private int minseats,maxseats;//最小座位最多座位
    private String modelNumber;
    private String model;//汽车类型：凯美瑞etc    
    private String city;//所在城市
    private String brand;//汽车品牌
    private String serialNumber;//序列号？
    private int maintenanceCertificate;//维护证书
    private int dateOfManufacture;//出厂日期
    private SimpleDateFormat lastUpdate;//最后更新日期
    
    public int getMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(int maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }
    

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    
    
    public Car()
    {  
        String pattern1 = "yyyy-MM-dd HH:mm:ssZ";
        lastUpdate = new SimpleDateFormat(pattern1);        
    }
    public Car(boolean available,String brand,String City,int dateOfManufacture,int maintenanceCertificate,int minseats,int maxseats,String model,String modelNumber,String serialNumber,Point x)
    {  
        this.available=available;
        this.brand=brand;
        this.city=City;
        this.dateOfManufacture=dateOfManufacture;
        this.maintenanceCertificate=maintenanceCertificate;
        this.maxseats=maxseats;
        this.minseats=minseats;
        this.model=model;
        this.modelNumber=modelNumber;
        this.serialNumber=serialNumber;
        this.x=x;
        String pattern1 = "yyyy-MM-dd HH:mm:ssZ";
        lastUpdate = new SimpleDateFormat(pattern1);        
    }
    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    
    public String toString()
    {
        return brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public SimpleDateFormat getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(SimpleDateFormat lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    

    
    

    public int getMinseats() {
        return minseats;
    }

    public void setMinseats(int minseats) {
        this.minseats = minseats;
    }

    public int getMaxseats() {
        return maxseats;
    }

    public void setMaxseats(int maxseats) {
        this.maxseats = maxseats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
    
}
