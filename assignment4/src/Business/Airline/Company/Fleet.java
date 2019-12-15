/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*机组
*/
package Business.Airline.Company;

import Business.Airline.Users.Airliner;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class Fleet {
    
    private ArrayList<Airplane> airplane;
    
    

    /**
     *
     * @param fleetName
     */
    
    public Fleet(){
        airplane=new ArrayList<Airplane>();
        
        
    }

    public ArrayList<Airplane> getAirplane() {
        return airplane;
    }

    public void setAirplane(ArrayList<Airplane> airplane) {
        this.airplane = airplane;
    }


    public Airplane addAirPlane(String manufacture, String model, int row,int col, int serialNumber)
    {
        Airplane add=new Airplane(manufacture,model,row,col,serialNumber);
        airplane.add(add);
        return add;
    }
    public void addAirPlane(Airplane add)
    {
        airplane.add(add);
    }
    public void deleteAirPlane(Airplane del)
    {
        airplane.remove(del);
    }
    
}
