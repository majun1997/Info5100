/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;

/**
 *
 * @author kasai
 */
public class Customer {
    private int ID;
    private ArrayList<Order> order;
    public Customer(int ID){
        this.ID=ID;
        this.order=new ArrayList();
    }
    public void addOrder(Order add){
        order.add(add);
    }
    public void deleteOrder(Order del){
        order.remove(del);
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }
    
}
