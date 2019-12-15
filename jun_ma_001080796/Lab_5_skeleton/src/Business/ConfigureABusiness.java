/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import static java.lang.System.out;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        Organization add=new AdminOrganization(Organization.Type.Admin);
        business.getOrganizationDirectory().getOrganizationList().add(add);
        Employee addempl=add.getEmployeeDirectory().createEmployee("JunMA");
        //String username, String password, Employee employee, String role
        add.getUserAccountDirectory().createUserAccount("admin", "admin", addempl, "admin");
        add=new AdminOrganization(Organization.Type.Lab);
        business.getOrganizationDirectory().getOrganizationList().add(add);
        addempl=add.getEmployeeDirectory().createEmployee("Ben");
        //String username, String password, Employee employee, String role
        add.getUserAccountDirectory().createUserAccount("lab", "lab", addempl, "Lab assitant");
        add=new AdminOrganization(Organization.Type.Doctor);
        business.getOrganizationDirectory().getOrganizationList().add(add);
        addempl=add.getEmployeeDirectory().createEmployee("jackie");
        //String username, String password, Employee employee, String role
        add.getUserAccountDirectory().createUserAccount("doctor", "doctor", addempl, "doctor");
        return business;
    }
    
}
