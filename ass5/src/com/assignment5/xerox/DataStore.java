/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 52909
 */
public class DataStore {
    private static DataStore dataStore;
    private Map<Integer,Product> product;
    private Map<Integer,Order> order;
    private Map<Integer,Customer> customer;
    private Map<Integer,SalesPerson> salesPerson;
    public DataStore(){
        product=new HashMap();
        order=new HashMap();
        customer=new HashMap();
        salesPerson=new HashMap();
    }
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Product> getProduct() {
        return product;
    }

    public void setProduct(Map<Integer, Product> product) {
        this.product = product;
    }

    public Map<Integer, Order> getOrder() {
        return order;
    }

    public void setOrder(Map<Integer, Order> order) {
        this.order = order;
    }

    public Map<Integer, Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Map<Integer, Customer> customer) {
        this.customer = customer;
    }

    public Map<Integer, SalesPerson> getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(Map<Integer, SalesPerson> salesPerson) {
        this.salesPerson = salesPerson;
    }
    
}
