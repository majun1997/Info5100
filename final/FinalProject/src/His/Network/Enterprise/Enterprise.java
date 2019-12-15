/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.Enterprise;

import His.Network.Organization.Organization;
import His.Network.Organization.OrganizationDirectory;
import His.Network.WorkQueue.MEWork.Medicine;
import His.Network.WorkQueue.MEWork.MedicineDictionary;
import java.util.ArrayList;



/**
 *
 * @author 52909
 */
public abstract class Enterprise extends Organization{
    public enum EnterpriseType{
        Hospital("Hospital"){},
        MedicalEnterprise("MedicalEnterprise"){};
        
        private String value;        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int debit=0;

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }
    private MedicineDictionary storage;
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        storage=new MedicineDictionary(1);
        organizationDirectory=new OrganizationDirectory();
    } 

    public MedicineDictionary getStorage() {
        return storage;
    }

    public void setStorage(MedicineDictionary storage) {
        this.storage = storage;
    }

    
}
