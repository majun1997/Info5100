/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Role;

import His.Network.WorkQueue.MEWork.Medicine;
import His.Network.WorkQueue.MEWork.MedicineDictionary;
import His.Network.WorkQueue.MEWork.MedicineStorage;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class PatientCase {
    private String Case;
    private MedicineDictionary medicine;
    public PatientCase(){
        medicine=new MedicineDictionary(1);
    }

    public MedicineDictionary getMedicine() {
        return medicine;
    }

    public void setMedicine(MedicineDictionary medicine) {
        this.medicine = medicine;
    }
    
    
    
    public String getCase() {
        return Case;
    }

    public void setCase(String Case) {
        this.Case = Case;
    }
    private boolean status=false;
    public boolean getStatus() {
        return status;//To change body of generated methods, choose Tools | Templates.
    }
    public void setStatus(boolean status){
        this.status=status;
    }
}
