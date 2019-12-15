/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Organization.Hospital;

import His.Network.Organization.Organization;
import His.Network.Role.Hos.Doctor;
import His.Network.Role.Patient;
import His.Network.Role.Personal;
import His.Network.Role.Role;
import His.Network.WorkQueue.HosWork.*;
import java.util.ArrayList;

/**
 *
 * @author Qiushi Zhang
 */
public class OutpatientO extends Organization {
    
    
    
    public OutpatientO(){
        super(Organization.Type.Outpatient.getValue());
       
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
