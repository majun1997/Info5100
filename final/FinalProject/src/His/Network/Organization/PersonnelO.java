/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Organization;

import His.Network.Role.GA;
import His.Network.Role.Personal;
import His.Network.Role.Role;
import His.Network.WorkQueue.*;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class PersonnelO extends Organization {
     public PersonnelO(){
         
        super(Organization.Type.Personnel.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Personal());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
}
