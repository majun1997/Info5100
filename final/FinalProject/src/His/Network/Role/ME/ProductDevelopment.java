/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Role.ME;

import His.HisSystem;
import His.Network.Enterprise.Enterprise;
import His.Network.Organization.Organization;
import His.Network.Role.Role;
import His.UserAccount.UserAccount;
import UserInterface.MEInterface.ProductDevelopmentMainJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 52909
 */
public class ProductDevelopment extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, HisSystem business) {
        return new ProductDevelopmentMainJPanel(userProcessContainer,account,organization,enterprise,business);//To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return "ProductDevelopment Staff";
    }
}
