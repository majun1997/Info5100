/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.WorkQueue.MEWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author hp
 */
public class MedicineDictionary {
     private ArrayList<Medicine> medicineList;
     private Map<String,MedicineStorage> medicineStorageMap;
     public MedicineDictionary(){
         this.medicineList=new ArrayList<Medicine>();
         this.medicineStorageMap=new HashMap<String,MedicineStorage>();
         init();
     }

    public MedicineDictionary(int i) {
        this.medicineList=new ArrayList<Medicine>();
        this.medicineStorageMap=new HashMap<String,MedicineStorage>(); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public Map<String, MedicineStorage> getMedicineStorageMap() {
        return medicineStorageMap;
    }

    public void setMedicineStorageMap(Map<String, MedicineStorage> medicineStorageMap) {
        this.medicineStorageMap = medicineStorageMap;
    }
   
    public void init(){
        medicineList = new ArrayList<>();
        
        Medicine medicine1 = new Medicine("Panniclin",15.0,"Boston Medicine","use for cold","antibiotics",100,"2019-12-2");
        Medicine medicine2 = new Medicine("Panniclin",15.0,"Boston Medicine","use for cold","antibiotics",50,"2019-12-3");
        Medicine medicine3 = new Medicine("Simvastatin",15.0,"Boston Medicine","use for cold","antibiotics",100,"2019-12-2");
        Medicine medicine4 = new Medicine("Lisinopril",15.0,"Boston Medicine","use for cold","antibiotics",100,"2019-12-2");
        Medicine medicine5 = new Medicine("Metformin",15.0,"Boston Medicine","use for cold","antibiotics",100,"2019-12-2");
        Medicine medicine6 = new Medicine("Lipitor",15.0,"Boston Medicine","use for cold","antibiotics",100,"2019-12-2");
        Medicine medicine7 = new Medicine("Amlodipine",15.0,"Boston Medicine","use for cold","antibiotics",100,"2019-12-2");
        Medicine medicine8 = new Medicine("Amlodipine",15.0,"Boston Medicine","use for cold","antibiotics",100,"2019-12-2");
        Medicine medicine9 = new Medicine("Metformin",15.0,"Boston Medicine","use for cold","antibiotics",50,"2019-12-2");
        Medicine medicine10 = new Medicine("Metformin",15.0,"Boston Medicine","use for cold","antibiotics",50,"2019-12-2");
        MedicineStorage medicineStorage1=new MedicineStorage("Panniclin",15,"Boston Medicine","use for cold","antibiotics",150);
        MedicineStorage medicineStorage2=new MedicineStorage("Simvastatin",15,"Boston Medicine","use for cold","antibiotics", 100);
        MedicineStorage medicineStorage3=new MedicineStorage("Lisinopril",15,"Boston Medicine","use for cold","antibiotics", 100);
        MedicineStorage medicineStorage4=new MedicineStorage("Metformin",15,"Boston Medicine","use for cold","antibiotics", 200);
        MedicineStorage medicineStorage5=new MedicineStorage("Lipitor",15,"Boston Medicine","use for cold","antibiotics", 100);
        MedicineStorage medicineStorage6=new MedicineStorage("Amlodipine",15,"Boston Medicine","use for cold","antibiotics", 200);
        medicineList.add(medicine1);
        medicineList.add(medicine2);
        medicineList.add(medicine3);
        medicineList.add(medicine4);
        medicineList.add(medicine5);
        medicineList.add(medicine6);
        medicineList.add(medicine7);
        medicineList.add(medicine8);
        medicineList.add(medicine9);
        medicineList.add(medicine10);
        medicineStorageMap.put("Panniclin",medicineStorage1);
        medicineStorageMap.put("Simvastain",medicineStorage2);
        medicineStorageMap.put("Lisinopril",medicineStorage3);
        medicineStorageMap.put("Metformin", medicineStorage4);
        medicineStorageMap.put("Lipitor", medicineStorage5);
        medicineStorageMap.put("Amlodipine", medicineStorage6);
      
    }
     public Medicine productMedicine(){
         Medicine medicine=new Medicine();
         medicineList.add(medicine);
         return medicine;
     }
    public void storeMedicine(MedicineStorage medicineStorage){
       
       if(medicineStorageMap.containsKey(medicineStorage.getName())){
            int temp=medicineStorageMap.get(medicineStorage.getName()).getCount();
            medicineStorageMap.get(medicineStorage.getName()).setCount(temp+medicineStorage.getCount());
         }else{
           medicineStorageMap.put(medicineStorage.getName(), medicineStorage);
       }
       
     }
    public ArrayList searchByname(String name){
         ArrayList<MedicineStorage> medicines=new ArrayList<MedicineStorage>();
         for(MedicineStorage medicineStorage:medicineStorageMap.values()){
           if(medicineStorage.getName().equals(name)){
               medicines.add(medicineStorage);
               }
          }
         return medicines;
       } 
    public ArrayList searchByclass(String classfication){
         ArrayList<MedicineStorage> medicines=new ArrayList<MedicineStorage>();
         for(MedicineStorage medicineStorage:medicineStorageMap.values()){
           if(medicineStorage.getClassification().equals(classfication)){
               medicines.add(medicineStorage);
                }
            }
         return medicines;
       }     
    


    }

   



