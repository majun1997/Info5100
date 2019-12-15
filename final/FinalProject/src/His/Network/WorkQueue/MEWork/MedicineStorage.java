/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.WorkQueue.MEWork;

/**
 *
 * @author hp
 */
public class MedicineStorage {
     private String name;
     private int price;
     private String company;
    //     private  Date productDate;
     //   private Date dueDate;
     private String description;   
     private String  classification;
     private int count;
   // private String productDate;
 public MedicineStorage(String name,int price,String Company,String description,String classification,int count){
       this.name=name;
       this.price=price;
       this.classification=classification;
       this.company=company;
       this.description=description;
       this.count=count;
     }
        
    public  MedicineStorage() {
        //To change body of generated methods, choose Tools | Templates.
    }
    public  MedicineStorage(MedicineStorage med) {
        //To change body of generated methods, choose Tools | Templates.
        this.name=med.getName();
        this.classification=med.getClassification();
        this.company=med.getCompany();
        this.description=med.getDescription();
        this.price=med.getPrice();
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
