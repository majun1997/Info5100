/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Enterprise;

import His.Network.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class MedicalEnterE extends Enterprise{
    public MedicalEnterE(String name){
        super(name,Enterprise.EnterpriseType.MedicalEnterprise);
    }
    /**
     * todo
     * @return 
     */
    @Override
    public  ArrayList<Role> getSupportedRole(){
        return null;
    };
}
