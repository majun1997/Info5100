/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline.Users;

import Business.Airline.Abstract.User;
import Business.Airline.Manage.MasterTravelSchedule;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class TravelOffice  extends User{
    private String officeName;
    private int ticketNumber;
    private ArrayList<Customer> customer;
    private MasterTravelSchedule schedule;
    public void addCustomer(Customer add){
        customer.add(add);
    }
    public Customer  addCustomer(String password, String userName,String userID){
        Customer add=new Customer(password,userName,userID);
        customer.add(add);
        return add;
    }
    public void delCustomer(Customer del){
        customer.remove(del);
    }
    public TravelOffice(String password, String userName,String userID,String officeName,UserList list) {
        
        super(password, userName, "TravelOffice",userID);
        this.ticketNumber=0;
        this.schedule=list.getSchedule();
        this.customer=new ArrayList<Customer>();
        this.officeName=officeName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public String buyTicket(){
        String a=officeName+ticketNumber;
        ticketNumber++;
        return a;
    }
    @Override
    public String toString(){
        return this.officeName;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public MasterTravelSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(MasterTravelSchedule schedule) {
        this.schedule = schedule;
    }
    
}
