/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline.Users;

import Business.Airline.Company.Airplane;
import Business.Airline.Company.Fleet;
import Business.Airline.Company.Flight;
import Business.Airline.Company.FlightSchedule;
import Business.Airline.Company.Seat;
import Business.Airline.Company.Ticket;
import Business.Airline.Manage.MasterTravelSchedule;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 52909
 */
public class UserList {
    private ArrayList<TravelOffice> office;
    private MasterTravelSchedule schedule;
    private ArrayList<Airliner> airlineAgency;
    private ArrayList<Ticket> ticket;
    private MasterTravelSchedule masterSchedule;
    private Admin admin;
    public void setOffice(ArrayList<TravelOffice> office) {
        this.office = office;
    }


    public MasterTravelSchedule getMasterSchedule() {
        return masterSchedule;
    }

    public void setMasterSchedule(MasterTravelSchedule masterSchedule) {
        this.masterSchedule = masterSchedule;
    }


    public void setAirlineAgency(ArrayList<Airliner> airlineAgency) {
        this.airlineAgency = airlineAgency;
    }
    
    public void initUser() throws ParseException
    {
        //THIS IS A DEMO AND USERNAME IS WHO ACCOMPLISH THIS LINE
        //String password, String userName,String userID
        
        //String password, String userName,String userID,String officeName,UserList list
        TravelOffice office=new TravelOffice("1","JunMA","0000000000000","JunMA Office",this);    
        Customer customer=new Customer("YuChen1#","YuChen","0000000000002",office);
        office.addCustomer(customer);
        this.office.add(office);
        //String password, String userName,String userID,String Airline
        Airliner airlineAgency=new Airliner("1","QiushiZhang","0000000000001","AirChina");
        Airplane airplane=new Airplane("Boeing","777", 100, 4, 00001);
//    public FlightSchedule(Airliner agency,String depart,String arrive,String departTime,String tourTime,Date date,String flightNo)
        
        FlightSchedule schedule=new FlightSchedule(null,"Boston","Seattle","19:00","4h53min",(Date)(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019")),"CA9307");
        //Airplane airplane,FlightSchedule schedule,int []price
        int []price={500,1000,1500};
        Flight flight=new Flight(airplane,schedule,price);
        //flight.bookSeat(new Seat("4D",flight),customer,);
        //Ticket bookSeat(Seat s,Customer c,String n){
        //buy ticket
        
        
        airlineAgency.addFlightSchedule(schedule);
        schedule.setFlight(flight);
        airplane.setAvailable(false);
        airplane.setFlight(flight);
        airlineAgency.getFleet().addAirPlane(airplane);
        masterSchedule=new MasterTravelSchedule(this);
        masterSchedule.update();
        this.addAirlineAgency(airlineAgency);
        Ticket ticket=flight.bookSeat(flight.getSeat().get(1), customer, customer.getOffice().buyTicket());
        customer.addTicket(ticket);
        this.addTicket(ticket);
        //String Order,Fleet fleet
        
        //AirlineAgency agency,String depart,String arrive,String departTime,String tourTime,Date date
        //int row,int n,String flight,Airplane airplane,FlightSchedule schedule
         

        
        
        
        
        
        
        
        
        
    }
    public void addTicket(Ticket add){
        ticket.add(add);
    }
    public void delTicket(Ticket del){
        ticket.remove(del);
    }
    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    
    
    
    public UserList(){
        ticket=new ArrayList<Ticket>();
        office=new ArrayList<TravelOffice>();
        schedule=new MasterTravelSchedule(this);
        airlineAgency=new ArrayList<Airliner>();
        this.admin=new Admin();
    }

    public ArrayList<TravelOffice> getOffice() {
        return office;
    }

   

    public ArrayList<Airliner> getAirlineAgency() {
        return airlineAgency;
    }
    
    public TravelOffice addTravelOffice(String p,String u,String userID,String officeName)
    {
        TravelOffice add=new TravelOffice(p,u,userID,officeName,this);
        office.add(add);
        return add;
    }
    public void addTravelOffice(TravelOffice add)
    {
        office.add(add);
    }
    
    public void deleteCustomer(TravelOffice del)
    {
        office.remove(del);
    }
    
    
    public Airliner addAirlineAgency(String p,String u,String userID,String airline)
    {
        Airliner re=new Airliner(p,u,userID,airline);
        airlineAgency.add(re);
        return re;
    }
    public void addAirlineAgency(Airliner add)
    {
        airlineAgency.add(add);
    }
    public void deleteAirlineAgency(Airliner del)
    {
        airlineAgency.remove(del);
    }

    public MasterTravelSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(MasterTravelSchedule schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(ArrayList<Ticket> ticket) {
        this.ticket = ticket;
    }
    
}
