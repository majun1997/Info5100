/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class DoctorOrganization extends Organization{
    private ArrayList<String> supportedRole;
    public DoctorOrganization(Type t){
        super(t.getValue());
        this.supportedRole=new ArrayList<String>();
    }
    @Override
    public ArrayList<String> getSupportedRole()
    {
        return supportedRole;
    }
}
