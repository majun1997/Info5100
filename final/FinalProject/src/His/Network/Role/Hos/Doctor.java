/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Role.Hos;

import His.HisSystem;
import His.Network.Enterprise.Enterprise;
import His.Network.Organization.Organization;
import His.Network.Role.Patient;
import His.Network.Role.Role;
import His.UserAccount.UserAccount;
import UserInterface.GeneralAccounting.GeneralAccounting;
import UserInterface.Hospital.OutpatientJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author 52909
 */
public class Doctor extends Role{
    
    private ArrayList<Patient> patientList;
    
    public Doctor(){
        patientList = new ArrayList<>();
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, HisSystem business) {
        return new OutpatientJPanel(userProcessContainer,account,organization,enterprise,business); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return "Doctor";
    }
}
