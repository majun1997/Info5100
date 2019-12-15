/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His;

import His.Employee.Employee;
import His.Network.Role.SystemAdmin;
import His.UserAccount.UserAccount;

/**
 *
 * @author 52909
 */
public class ConfigureASystem {
    public static HisSystem configure(){        
        HisSystem system = HisSystem.getInstance();       
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin","sysadmin","sysadmin",new SystemAdmin(),employee);
        return system;
    }
}
