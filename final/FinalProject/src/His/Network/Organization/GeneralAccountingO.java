/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Organization;

import His.Network.Role.GA;
import His.Network.Role.Role;
import His.Network.WorkQueue.*;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class GeneralAccountingO extends Organization{
    public GeneralAccountingO(){
        
        super(Organization.Type.GeneralAccounting.getValue());
        
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GA());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
