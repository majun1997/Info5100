/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*
*/
package Business.Airline.Manage;

import Business.Airline.Company.Flight;
import Business.Airline.Company.FlightSchedule;
import Business.Airline.Users.Airliner;
import Business.Airline.Users.TravelOffice;
import Business.Airline.Users.UserList;
import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class MasterTravelSchedule {
    
    private UserList list;
    private ArrayList<FlightSchedule> flightSchedule;
    private ArrayList<Flight> flight;
    public MasterTravelSchedule(UserList user){
        this.flightSchedule=new ArrayList<FlightSchedule>();
        this.list=user;
        this.flight=new ArrayList<Flight>();
    }
    public void update()
    {
        this.flightSchedule=new ArrayList<FlightSchedule>();
        this.flight=new ArrayList<Flight>();
        updateSchedule();
        getAllflight();
    }
    private void updateSchedule(){
        this.flightSchedule=new ArrayList<FlightSchedule>();
        
        for(Airliner a:this.list.getAirlineAgency()){
            
            for(FlightSchedule schedule:a.getFlightSchedule())
            {
                
                this.flightSchedule.add(schedule);
            }
        }
    }
    private void getAllflight()
    {
        for(FlightSchedule a:flightSchedule)
        {
            if(a.getFlight()!=null)
                flight.add(a.getFlight());
        }
    }

    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }

    public UserList getList() {
        return list;
    }

    public void setList(UserList list) {
        this.list = list;
    }

    public ArrayList<FlightSchedule> getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(ArrayList<FlightSchedule> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
    
}
