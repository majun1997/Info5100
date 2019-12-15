/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Role;

import His.HisSystem;
import His.Network.Enterprise.Enterprise;
import His.Network.Organization.Organization;
import His.UserAccount.UserAccount;
import UserInterface.Patient.PatientJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author 52909
 */
public class Patient extends Role{
    private ArrayList<PatientCase> personalCase;
    
    public Patient(){
        this.personalCase=new ArrayList();
    }
    public void addCase(PatientCase add){
        personalCase.add(add);
    }

    public ArrayList<PatientCase> getPersonalCase() {
        return personalCase;
    }

    public void setPersonalCase(ArrayList<PatientCase> personalCase) {
        this.personalCase = personalCase;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, HisSystem business) {
        return new PatientJPanel(userProcessContainer, account, organization, business);
    }
    @Override
    public String toString(){
        return "Patient";
    }
    
}
