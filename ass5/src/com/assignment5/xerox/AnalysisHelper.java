/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

/**
 *
 * @author 52909
 */
public class AnalysisHelper {
    private double price;
    private int quantity;
    private double difference;
    private int target;
    public AnalysisHelper(double price,int quantity,int target){
        this.price=price;
        this.quantity=quantity;
        this.difference=(int)price-target;
        this.target=target;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDifference() {
        return difference;
    }

    public void setDifference(double difference) {
        this.difference = difference;
    }
    public void setDifference() {
        this.difference=price-target;
    }
}
