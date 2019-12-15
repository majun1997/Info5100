/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*航空公司
*航空公司名字，继承用户
*拥有舰队~出发批次？
*可以获取飞行计划
* 大致顺序获取计划，安排航线-》航线内安排飞机
*/
package Business.Airline.Users;

import Business.Airline.Abstract.User;
import Business.Airline.Company.Fleet;
import Business.Airline.Company.FlightSchedule;
import Business.Airline.Manage.MasterTravelSchedule;
import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class Airliner extends User{
    private String airline;
    private Fleet fleet;
    private ArrayList<FlightSchedule> flightSchedule;
    public void addFlightSchedule(FlightSchedule add){
        add.setAgency(this);
        this.flightSchedule.add(add);
    }
    public void delFlightSchedule(FlightSchedule del){
        this.flightSchedule.remove(del);
    }
    public ArrayList<FlightSchedule> getFlightSchedule() {
        return flightSchedule;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }
    
    
    public Airliner(String password, String userName,String userID,String airline) {
        super(password, userName,"AirlineAgency",userID);
        fleet=new Fleet();
        this.airline=airline;
        flightSchedule=new ArrayList<FlightSchedule>();
    }
    
    @Override
    public String toString()
    {
        return airline;
    }

    public String getAirline() {
        
        return airline;
    }

    public void setFlightSchedule(ArrayList<FlightSchedule> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    
    
}
