/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.WorkQueue.MEWork;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Medicine {
     private String name;
     private double price;
     private String company;
    //     private  Date productDate;
     //   private Date dueDate;
     private String description;   
     private String  classification;
     private int count;
    private String productDate;
   public Medicine(String name,double price,String company,String description,String classification,int count,String productDate){
       this.name=name;
       this.price=price;
       this.classification=classification;
       this.company=company;
       this.description=description;
       this.count=count;
       this.productDate=productDate; 
     }

    public Medicine(){
        
    }
    
    
    
    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return name;
    }

   
    





}
