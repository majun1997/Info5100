/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*  航班上的座位
*/
package Business.Airline.Company;

import Business.Airline.Users.Customer;


/**
 *
 * @author 52909
 */
public class Seat {
    private String seat;
    private boolean available;
   
    private Customer customer;
    private Flight flight;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public Seat(String seat,Flight flight)
    {
        this.seat=seat;
        this.flight=flight;
        available=true;
        
    }
    public void bookIt(){
        
        this.available=false;
        
    }
    public boolean isVailable() {
        return available;
    }

    public void setVailable(boolean vailable) {
        this.available = vailable;
    }

    public String getSeat() {
        return seat;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    @Override
    public String toString(){
        return seat;
    }

    
}
