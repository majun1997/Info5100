/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network;

import His.Network.Enterprise.EnterpriseDirectoryE;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class Network {
    private String name;
    private EnterpriseDirectoryE enterpriseDirectory;
    public Network(){
        enterpriseDirectory=new EnterpriseDirectoryE();
    }
    public Network(String name){
        enterpriseDirectory=new EnterpriseDirectoryE();
        this.name=name;
    }
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectoryE getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
