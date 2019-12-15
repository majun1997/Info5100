/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package His.UserAccount;

import His.Employee.Employee;
import His.Network.Role.Role;
import His.Network.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String realname;
    private String SSN;
    private Role role;
    private WorkQueue workqueue;
    private Employee employee;
    public UserAccount(String username,String password,String realname,String SSN,Role role,Employee employee) {
        this.SSN=SSN;
        this.password=password;
        this.username=username;
        this.realname=realname;
        this.role=role;
        this.workqueue=new WorkQueue();
        this.employee=employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public String toString() {
        return realname;
    }
    
    
    
}