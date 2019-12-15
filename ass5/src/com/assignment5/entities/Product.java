/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author kasai
 */
public class Product {
    int min,max,target,ID;
    public Product(int min,int max,int target,int ID){
        this.min=min;
        this.max=max;
        this.target=target;
        this.ID=ID;
    }
    @Override
    public String toString(){
        return "this product is:"+ID+" min: "+min+" max: "+max+" and the target is: "+target;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }


    
}
