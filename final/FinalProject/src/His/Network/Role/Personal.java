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

import UserInterface.Personal.PersonalJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 52909
 */
public class Personal extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, HisSystem business) {
       return new PersonalJPanel(userProcessContainer, account, organization, business,enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return "Personal Department";
    }
}
