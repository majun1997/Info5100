/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Organization.ME;

import His.Network.Organization.Organization;
import His.Network.Role.Hos.Nursing;
import His.Network.Role.ME.ProductDevelopment;
import His.Network.Role.Role;
import His.Network.WorkQueue.MEWork.*;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class ProductDevelopmentO extends Organization{
   public ProductDevelopmentO(){
       
       super(Organization.Type.ProductDevelopment.getValue());
  
   }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProductDevelopment());
        return roles;    
    }
    
}
