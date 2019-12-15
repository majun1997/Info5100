/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Organization;

import His.Employee.EmployeeDirectory;
import His.Network.Role.Role;
import His.Network.WorkQueue.WorkQueue;
import His.UserAccount.UserAccountDirectory;
import java.util.ArrayList;


/**
 *
 * @author raunak
 */
public abstract class Organization { 
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private Type Organizationtype;
    
    private static int counter=0;
    public enum Type{
        GeneralAccounting("GeneralAccounting"), Personnel("Personnel"), Nursing("Nursing"),
        Outpatient("Outpatient"),Purchasing("Purchasing"),Export("Export"),ProductDevelopment("ProductDevelopment");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public Type getOrganizationtype() {
        return Organizationtype;
    }

    public void setOrganizationtype(Type Organizationtype) {
        this.Organizationtype = Organizationtype;
    }
    
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter++;
        
    }

    public abstract ArrayList<Role> getSupportedRole();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    @Override
    public String toString(){
        return this.getName();
    }
}
