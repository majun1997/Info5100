/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.WorkQueue.HosWork;

import His.Network.Enterprise.Enterprise;
import His.Network.Enterprise.HospitalE;
import His.Network.Enterprise.MedicalEnterE;
import His.Network.WorkQueue.MEWork.MedicineDictionary;
import His.Network.WorkQueue.MEWork.MedicineStorage;
import His.Network.WorkQueue.WorkRequest;

/**
 *
 * @author 52909
 */
public class PurchasingWork extends WorkRequest{
    private MedicineStorage medicineStorage;
    private int amount=0;
    private MedicalEnterE medicalEnter;
    private HospitalE hospital;
    public PurchasingWork(){
        
    }

    public MedicineStorage getMedicineStorage() {
        return medicineStorage;
    }

    public void setMedicineStorage(MedicineStorage medicineStorage) {
        this.medicineStorage = medicineStorage;
    }
    
    

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public MedicalEnterE getMedicalEnter() {
        return medicalEnter;
    }

    public void setMedicalEnter(MedicalEnterE medicalEnter) {
        this.medicalEnter = medicalEnter;
    }

    public HospitalE getHospital() {
        return hospital;
    }

    public void setHospital(HospitalE hospital) {
        this.hospital = hospital;
    }

    
    
}
