/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Enterprise;

import His.Network.Organization.Organization;
import His.Network.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class HospitalE extends Enterprise{
    public HospitalE(String name){
        super(name,Enterprise.EnterpriseType.Hospital);
    }
    
    @Override
    public  ArrayList<Role> getSupportedRole(){
        return null;
    };
}
