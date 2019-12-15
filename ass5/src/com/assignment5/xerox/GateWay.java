/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;


import com.assignment5.entities.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    
    private static GateWay self;
    
    private GateWay(){
        
    }
    public static void main(String args[]) throws IOException{
        
        
        DataGenerator generator = DataGenerator.getInstance();
        self=new GateWay();
        System.out.println("information reading");
        self.readOrder(generator.getOrderFilePath());
        self.readProduct(generator.getProductCataloguePath());
        System.out.println("already");
        
        Analysis helper=new Analysis();
        helper.T3BNP();
        helper.T3BC();
        //todo
        helper.T3BS();
        helper.OTR();

        helper.getAnalysis();
        DataGeneratorMod generator1 = DataGeneratorMod.getInstance();
        self.readProduct(generator1.getProductCataloguePath());
        self.readOrder(generator1.getOrderFilePath());
        helper.getAnalysis();
        helper.getAnalysisNew();

    }
    private void readOrder(String path)throws FileNotFoundException, IOException{
        DataReader orderReader = new DataReader(path);
        String[] orderRow;
        
        while((orderRow = orderReader.getNextRow()) != null){
            //int productId, int salesPrice, int quantity
            Item itemAdd=new Item(Integer.parseInt(orderRow[2]),Integer.parseInt(orderRow[6]),Integer.parseInt(orderRow[3]));
            //int orderId, int supplierId, int customerId, Item item
            Order orderAdd=new Order(Integer.parseInt(orderRow[0]),Integer.parseInt(orderRow[4]),Integer.parseInt(orderRow[5]),itemAdd,orderRow[7]);
            DataStore.getInstance().getOrder().put(Integer.parseInt(orderRow[0]), orderAdd);
            if(DataStore.getInstance().getCustomer().containsKey(Integer.parseInt(orderRow[5]))){
                DataStore.getInstance().getCustomer().get(Integer.parseInt(orderRow[5])).addOrder(orderAdd);
            }else{
                //int ID
                Customer customerAdd=new Customer(Integer.parseInt(orderRow[5]));
                customerAdd.addOrder(orderAdd);
                DataStore.getInstance().getCustomer().put(Integer.parseInt(orderRow[5]), customerAdd);
                
            }
            if(DataStore.getInstance().getSalesPerson().containsKey(Integer.parseInt(orderRow[4]))){
                DataStore.getInstance().getSalesPerson().get(Integer.parseInt(orderRow[4])).addOrder(orderAdd);
            }
            else{
                SalesPerson salesAdd=new SalesPerson(Integer.parseInt(orderRow[4]));
                salesAdd.addOrder(orderAdd);
                DataStore.getInstance().getSalesPerson().put(Integer.parseInt(orderRow[4]), salesAdd);
            }
        }
    }
    private void readProduct(String path) throws FileNotFoundException, IOException{
        DataReader productReader = new DataReader(path);
        String[] prodRow;
        
        while((prodRow = productReader.getNextRow()) != null){
            Product a=new Product(Integer.parseInt(prodRow[1]),Integer.parseInt(prodRow[2]),Integer.parseInt(prodRow[3]),Integer.parseInt(prodRow[0]));
            DataStore.getInstance().getProduct().put(Integer.parseInt(prodRow[0]), a);
           
        }
    }
    public static void printRow(String[] row){
        for (String row1 : row) {
            System.out.print(row1 + ", ");
        }
        System.out.println("");
    }
    
}
