/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Enterprise;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectoryE {
    private Map<String,Enterprise> enterpriseList;
    private static int ID=0;
    public EnterpriseDirectoryE(){
        this.enterpriseList=new HashMap();
    }
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalE(name);
            if(!enterpriseList.containsKey(enterprise.getName()))
                enterpriseList.put(enterprise.getName(),enterprise);
        }
        if(type==Enterprise.EnterpriseType.MedicalEnterprise)
        {
            enterprise=new MedicalEnterE(name);
            if(!enterpriseList.containsKey(enterprise.getName()))
                enterpriseList.put(enterprise.getName(),enterprise);
        }
        return enterprise;
    }

    public Map<String,Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(Map<String,Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        EnterpriseDirectoryE.ID = ID;
    }
    
}
