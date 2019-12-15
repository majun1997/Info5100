/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His;

import His.Employee.EmployeeDirectory;
import His.Network.Enterprise.Enterprise;
import His.Network.Network;
import His.Network.Organization.Organization;
import His.Network.Role.Role;
import His.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 52909
 */
public class HisSystem extends Organization{
    public int origanizationID=0;
    public int employeeID=0;
   
    private EmployeeDirectory employeelist;
    private static HisSystem hisSystem;
    private Map<String,Network> network;
    public static HisSystem getInstance(){
        if(hisSystem==null){
            hisSystem=new HisSystem();
        }
        return hisSystem;
    }
    public void createAndAddNetwork(Network add){
        
        network.put(add.getName(),add);
        
    }
    public EmployeeDirectory getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(EmployeeDirectory employeelist) {
        this.employeelist = employeelist;
    }
    /**
     * todo
     * @return 
     */
    @Override
    public  ArrayList<Role> getSupportedRole(){
        return null;
    };
    public HisSystem(){
        super("HIS");
        employeelist=new EmployeeDirectory();
        network=new HashMap<String,Network>();
        
    }

   
    public Map<String,Network> getNetwork() {
        return network;
    }

    public void setNetwork(Map<String,Network> network) {
        this.network = network;
    }
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Map.Entry<String, Network> entrynet:network.entrySet()){
            Network net=entrynet.getValue();
            for(Map.Entry<String, Enterprise> entryent:net.getEnterpriseDirectory().getEnterpriseList().entrySet()){
                if(!entryent.getValue().getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                        return false;
                Enterprise ent=entryent.getValue();
                for(Map.Entry<String, Organization> entrorg:ent.getOrganizationDirectory().getOrganizationList().entrySet()){
                    System.out.println(entrorg.getValue());
                    if(!entrorg.getValue().getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                        return false;
                }
            }
        }
        return true;
    }

    
}
