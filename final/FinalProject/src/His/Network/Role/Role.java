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
import javax.swing.JPanel;

/**
 *
 * @author 52909
 */
public abstract class Role {
    public enum RoleType{
        SysAdmin("Admin"),
        GeneralAccounting("GeneralAccounting"),
        Patient("Patient"),
        Personal("Personal"),
        Nursing("Nursing"),
        Outpatient("Outpatient"),
        Purchasing("Purchasing"),
        Export("Export"),
        ProductDevelopment("ProductDevelopment")
        ;
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            HisSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
