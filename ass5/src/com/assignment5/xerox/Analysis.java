package com.assignment5.xerox;

import com.assignment5.entities.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

/**
 *
 * @author 52909
 */
public class Analysis {
    //
    /**
     * @author JunMA
     * Our top 3 best negotiated products (meaning products that sell above target)
     * display in line
     */
    public void T3BNP(){
        Map<Integer,Order> order=DataStore.getInstance().getOrder();
        Map<Integer,Integer> product=new HashMap();
        int productID,amount;
        for (Map.Entry<Integer, Order> entry : order.entrySet()) { 
             
            productID=entry.getValue().getItem().getProductId();
            if(DataStore.getInstance().getProduct().get(productID).getTarget()<entry.getValue().getItem().getSalesPrice())
            {
                if(product.containsKey(productID)){
                    amount=product.get(productID);
                    product.put(productID, amount+entry.getValue().getItem().getQuantity());
                }else{
                    product.put(productID, entry.getValue().getItem().getQuantity());
                }
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(product.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            @Override
            public int compare(Entry<Integer, Integer> o1,
                    Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        });
        int z=list.size()-1;
        for(int i=0;i<3;i++){
            System.out.println(i+1+"th best negotiated products");
            System.out.println("sale quantity above target:"+list.get(z).getValue()+",the productID is:"+list.get(z).getKey());
            while(Objects.equals(list.get(z).getValue(), list.get(--z).getValue()))
                System.out.println("sale quantity above target:"+list.get(z).getValue()+",the productID is:"+list.get(z).getKey());
        }
        
    }
    /**
     * @author JunMA
     * Our 3 best customers (customers who buy about target price)
     * Sum of absolute value of the difference between the sale price and target 
     * price of the products this customer bought. 
     * display in line
     */
    public void T3BC(){
        Map<Integer,Order> order=DataStore.getInstance().getOrder();
        Map<Integer,Integer> customer=new HashMap();
        int productID,difference;
        for (Map.Entry<Integer, Order> entry : order.entrySet()) { 
             
            productID=entry.getValue().getItem().getProductId();
            difference=entry.getValue().getItem().getSalesPrice()-DataStore.getInstance().getProduct().get(productID).getTarget();
            if(customer.containsKey(entry.getValue().getCustomerId())){
                difference+=customer.get(entry.getValue().getCustomerId());
                customer.put(entry.getValue().getCustomerId(), difference);
            }else{
                customer.put(entry.getValue().getCustomerId(), difference);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(customer.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            @Override
            public int compare(Entry<Integer, Integer> o1,
                    Entry<Integer, Integer> o2) {
                int a=o1.getValue();
                int b=o2.getValue();
                if(a<0)
                    a=-a;
                if(b<0)
                    b=-b;
                return b-a;
            }
            
        });
        int z=list.size()-1;
        for(int i=0;i<3;i++){
            System.out.println(i+1+"th best Customer(without quantity)");
            System.out.println("the amount of the difference:"+list.get(z).getValue()+",the customer ID is:"+list.get(z).getKey());
            while(Objects.equals(list.get(z).getValue(), list.get(--z).getValue()))
                System.out.println("the amount of the difference:"+list.get(z).getValue()+",the customer ID is:"+list.get(z).getKey());
        }
        
    }
         /**
     * @author YUCHEN
     * Our top 3 best sales people (sell higher that target) 
     * 3 sales people who have the most profit
     * Profit of a product = (sale price - target price) * sale quantity
     * 
     */
    public void T3BS(){
        Map<Integer,Order> order=DataStore.getInstance().getOrder();
        Map<Integer,Integer> sales=new HashMap();
        int productID,difference;
        for (Map.Entry<Integer, Order> entry : order.entrySet()) { 
             
            productID=entry.getValue().getItem().getProductId();
            difference=(entry.getValue().getItem().getSalesPrice()-DataStore.getInstance().getProduct().get(productID).getTarget())*entry.getValue().getItem().getQuantity();
            if(sales.containsKey(entry.getValue().getSalesPersonID())){
                difference+=sales.get(entry.getValue().getSalesPersonID()).byteValue();
                sales.put(entry.getValue().getSalesPersonID(), difference);
            }else{
                sales.put(entry.getValue().getSalesPersonID(), difference);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(sales.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            @Override
            public int compare(Entry<Integer, Integer> o1,
                    Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        });
        int z=list.size()-1;
        for(int i=0;i<3;i++){
            System.out.println(i+1+"th best Sales Person(with quantity as weight)");
            System.out.println("the amount of the profits:"+list.get(z).getValue()+",the Sales Person ID is:"+list.get(z).getKey());
            while(Objects.equals(list.get(z).getValue(), list.get(--z).getValue()))
                System.out.println("the amount of the profits:"+list.get(z).getValue()+",the Sales Person ID is:"+list.get(z).getKey());
        }
        
    }
    /**
     * @author YUCHEN
     * Our total revenue for the year that is above expected target
     * Sum of the profits made by every sales people.
     * Profit of a product = (sale price - target price) * sale quantity
     * 
     */
    public void OTR(){
        Map<Integer,Order> order=DataStore.getInstance().getOrder();
        Map<Integer,Integer> sales=new HashMap();
        int productID,difference,sum=0;
        for (Map.Entry<Integer, Order> entry : order.entrySet()) { 
             
            productID=entry.getValue().getItem().getProductId();
            difference=(entry.getValue().getItem().getSalesPrice()-DataStore.getInstance().getProduct().get(productID).getTarget())*entry.getValue().getItem().getQuantity();
            if(sales.containsKey(entry.getValue().getSalesPersonID())){
                difference+=sales.get(entry.getValue().getSalesPersonID()).byteValue();
                sales.put(entry.getValue().getSalesPersonID(), difference);
            }else{
                sales.put(entry.getValue().getSalesPersonID(), difference);
            }
        }
        for(Map.Entry<Integer, Integer> entry : sales.entrySet()){
            sum+=entry.getValue();
            //System.out.println("salesid:"+entry.getKey()+" his profit:"+entry.getValue());
        }
        System.out.println("the total profit made by sales person is:"+sum);
        
    }

    
    /**
     * @author QiushiZhang
     */
    public void getAnalysis(){
        Map<Integer,Order> order=DataStore.getInstance().getOrder();
        Map<Integer,AnalysisHelper> analysisHelper=new HashMap();
        
        int productID;
        
        for(Map.Entry<Integer, Order> entry : order.entrySet()){
            productID=entry.getValue().getItem().getProductId();
            
            if(analysisHelper.containsKey(productID)){
                AnalysisHelper add=analysisHelper.get(productID);
                double newadd=1.0*((entry.getValue().getItem().getSalesPrice()*entry.getValue().getItem().getQuantity())+(add.getPrice()*add.getQuantity()))/(add.getQuantity()+entry.getValue().getItem().getQuantity());
                add.setPrice(newadd);
                add.setQuantity(add.getQuantity()+entry.getValue().getItem().getQuantity());
                add.setDifference();
            }else{
                if(productID==0){
                    System.out.println(entry.getValue().getItem().getSalesPrice());
                }
                AnalysisHelper add=new AnalysisHelper(entry.getValue().getItem().getSalesPrice(),entry.getValue().getItem().getQuantity(),DataStore.getInstance().getProduct().get(productID).getTarget());
                analysisHelper.put(productID, add);
            }
        }
        List<Map.Entry<Integer,AnalysisHelper>> list = new ArrayList<Map.Entry<Integer,AnalysisHelper>>(analysisHelper.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,AnalysisHelper>>() {
            @Override
            public int compare(Entry<Integer, AnalysisHelper> o1,
                    Entry<Integer, AnalysisHelper> o2) {
                double re=o2.getValue().getDifference()-o1.getValue().getDifference();
                if(re>0)
                    return 1;
                else
                    return -1;
            }
            
        });
        int i=0;
        System.out.println("beyond the target:");
        for(;i<list.size();i++){
            if(list.get(i).getValue().getDifference()<=0)
                break;
            System.out.println("the Product ID is:"+list.get(i).getKey()+"\tthe ave price is:"+String.format("%.2f", list.get(i).getValue().getPrice())+"\tthe total quantities are:"+list.get(i).getValue().getQuantity()+"\tand the difference is:"+String.format("%.2f", list.get(i).getValue().getDifference())+"\tthe target is:"+list.get(i).getValue().getTarget()+"\tthe error is:"+String.format("%.2f",(list.get(i).getValue().getTarget()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice()));
        }
        
        System.out.println("below the target:");
        
        for(;i<list.size();i++){
            System.out.println("the Product ID is:"+list.get(i).getKey()+"\tthe ave price is:"+String.format("%.2f", list.get(i).getValue().getPrice())+"\tthe total quantities are:"+list.get(i).getValue().getQuantity()+"\tand the difference is:"+String.format("%.2f", list.get(i).getValue().getDifference())+"\tthe target is:"+list.get(i).getValue().getTarget()+"\tthe error is:"+String.format("%.2f",((list.get(i).getValue().getTarget()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice())));
        }
        
    }
        //A new function
    public void getAnalysisNew(){
        Map<Integer,Order> order=DataStore.getInstance().getOrder();
        Map<Integer,AnalysisHelper> analysisHelper=new HashMap();
        
        int productID;
        for(Map.Entry<Integer, Order> entry : order.entrySet()){
            productID=entry.getValue().getItem().getProductId();
            if(analysisHelper.containsKey(productID)){
              
                AnalysisHelper add=analysisHelper.get(productID);
                double newadd=1.0*((entry.getValue().getItem().getSalesPrice()*entry.getValue().getItem().getQuantity())+(add.getPrice()*add.getQuantity()))/(add.getQuantity()+entry.getValue().getItem().getQuantity());
                
                    
                add.setPrice(newadd);
                add.setQuantity(add.getQuantity()+entry.getValue().getItem().getQuantity());
                add.setDifference();
            }else{
                if(productID==0){
                    
                    System.out.println(entry.getValue().getItem().getSalesPrice());
                }
                AnalysisHelper add=new AnalysisHelper(entry.getValue().getItem().getSalesPrice(),entry.getValue().getItem().getQuantity(),DataStore.getInstance().getProduct().get(productID).getTarget());
                analysisHelper.put(productID, add);
            }
        }
        List<Map.Entry<Integer,AnalysisHelper>> list = new ArrayList<Map.Entry<Integer,AnalysisHelper>>(analysisHelper.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,AnalysisHelper>>() {
            @Override
            public int compare(Entry<Integer, AnalysisHelper> o1,
                    Entry<Integer, AnalysisHelper> o2) {
                double re=o2.getValue().getDifference()-o1.getValue().getDifference();
                if(re>0)
                    return 1;
                else
                    return -1;
            }
            
        });
        int i=0;
        System.out.println("beyond the target:");
        for(;i<list.size();i++){
            if(list.get(i).getValue().getDifference()<=0)
                break;
            String reply=" maintain the target";
            double err=(list.get(i).getValue().getTarget()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice();
            if(err>0.05 ||err<-0.05)
                reply=":the target need to be changed to:"+(int)list.get(i).getValue().getPrice()+" and the new error is:"+String.format("%.2f",((int)list.get(i).getValue().getPrice()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice());
            System.out.println("the Product ID is:"+list.get(i).getKey()+"\tthe ave price is:"+String.format("%.2f", list.get(i).getValue().getPrice())+"\tthe total quantities are:"+list.get(i).getValue().getQuantity()+"\tand the difference is:"+String.format("%.2f", list.get(i).getValue().getDifference())+"\tthe target is:"+list.get(i).getValue().getTarget()+"\tthe error is:"+String.format("%.2f",((list.get(i).getValue().getTarget()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice()))+" and the suggest is"+reply);
        }
        System.out.println("below the target:");
        
        for(;i<list.size();i++){
            String reply="maintain the target";
            double err=(list.get(i).getValue().getTarget()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice();
            if(err>0.05 ||err<-0.05)
                reply="the target need to be changed to:"+(int)list.get(i).getValue().getPrice()+" and the new error is:"+((int)list.get(i).getValue().getPrice()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice();
            System.out.println("the Product ID is:"+list.get(i).getKey()+"\tthe ave price is:"+String.format("%.2f", list.get(i).getValue().getPrice())+"\tthe total quantities are:"+list.get(i).getValue().getQuantity()+"\tand the difference is:"+String.format("%.2f", list.get(i).getValue().getDifference())+"\tthe target is:"+list.get(i).getValue().getTarget()+"\tthe error is:"+String.format("%.2f",((list.get(i).getValue().getTarget()-list.get(i).getValue().getPrice())/list.get(i).getValue().getPrice()))+" and the suggest is"+reply);
        }
        
    }


}
