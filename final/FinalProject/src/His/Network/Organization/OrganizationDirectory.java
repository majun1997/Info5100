/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Organization;

import His.Network.Organization.Hospital.NursingO;
import His.Network.Organization.Hospital.OutpatientO;
import His.Network.Organization.Hospital.PurchasingO;
import His.Network.Organization.ME.ExportO;
import His.Network.Organization.ME.ProductDevelopmentO;
import His.Network.Organization.Organization.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 52909
 */
public class OrganizationDirectory {
     private Map<String,Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new HashMap();
    }

    public Map<String,Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.GeneralAccounting.getValue())){
            organization = new GeneralAccountingO();
            organization.setOrganizationtype(type);
            if(!organizationList.containsKey(organization.getName()))
                organizationList.put(organization.getName(),organization);
        }
        else if (type.getValue().equals(Type.Personnel.getValue())){
            organization = new PersonnelO();
            organization.setOrganizationtype(type);
            if(!organizationList.containsKey(organization.getName()))
                organizationList.put(organization.getName(),organization);
        }
        else if (type.getValue().equals(Type.Nursing.getValue())){
            organization = new NursingO();
            organization.setOrganizationtype(type);
            if(!organizationList.containsKey(organization.getName()))
            organizationList.put(organization.getName(),organization);
        }
        else if (type.getValue().equals(Type.Outpatient.getValue())){
            organization = new OutpatientO();
            organization.setOrganizationtype(type);
            if(!organizationList.containsKey(organization.getName()))
            organizationList.put(organization.getName(),organization);
        }
        else if (type.getValue().equals(Type.Purchasing.getValue())){
            organization = new PurchasingO();
            organization.setOrganizationtype(type);
            if(!organizationList.containsKey(organization.getName()))
            organizationList.put(organization.getName(),organization);
        }
        else if (type.getValue().equals(Type.Export.getValue())){
            organization = new ExportO();
            organization.setOrganizationtype(type);
            if(!organizationList.containsKey(organization.getName()))
            organizationList.put(organization.getName(),organization);
        }
        else if (type.getValue().equals(Type.ProductDevelopment.getValue())){
            organization = new ProductDevelopmentO();
            organization.setOrganizationtype(type);
            if(!organizationList.containsKey(organization.getName()))
            organizationList.put(organization.getName(),organization);
        }
          return organization;
    }
}
