/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.WorkQueue;

import His.Employee.Employee;
import His.Network.Enterprise.Enterprise;
import His.Network.Network;
import His.Network.Role.PatientCase;

/**
 *
 * @author 52909
 */
public class PatientRegister extends WorkRequest {
    private Enterprise hospital;
    private Employee doctor;
    private Network network;
    private PatientCase patientCase;
    public PatientRegister(){
        this.patientCase=new PatientCase();
    }
    public Enterprise getHospital() {
        return hospital;
    }

    public PatientCase getPatientCase() {
        return patientCase;
    }

    public void setPatientCase(PatientCase patientCase) {
        this.patientCase = patientCase;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    @Override
    public String toString(){
        return this.getNetwork().toString();
    }

}
