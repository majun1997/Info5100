/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public static enum Type{
        Admin("Admin Organization") {
            @Override
            public Organization createOrganization(Type t) {
                return new AdminOrganization(t);
            }
        }, Doctor("Doctor Organization"){
            @Override
            public Organization createOrganization(Type t) {
                return new DoctorOrganization(t);
            }
        }, Lab("Lab Organization"){
            @Override
            public Organization createOrganization(Type t) {
                return new LabOrganization(t);
            }
        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public Organization createOrganization(Type t) {
            return t.createOrganization(t);
        }
        public String getValue() {
            return value;
        }
        
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<String> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
