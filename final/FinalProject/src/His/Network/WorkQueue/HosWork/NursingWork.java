/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.WorkQueue.HosWork;

import His.Network.Role.Patient;
import His.Network.WorkQueue.WorkRequest;

/**
 *
 * @author 52909
 */
public class NursingWork extends WorkRequest{
    private String nursingResult;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getNursingResult() {
        return nursingResult;
    }

    public void setNursingResult(String nursingResult) {
        this.nursingResult = nursingResult;
    }
    @Override
    public String toString(){
        return this.getPatient().toString();
    }
}
