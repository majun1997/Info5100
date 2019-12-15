/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*机票。。。
*/
package Business.Airline.Company;
import Business.Airline.Users.*;
/**
 *
 * @author 52909
 */
public class Ticket {
    private String airlineNO;
    private String ticketNumber;
    private String airlineAgency;
    private Seat seat;
    private Customer customer;

    public String getAirlineNO() {
        return airlineNO;
    }

    public void setAirlineNO(String airlineNO) {
        this.airlineNO = airlineNO;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getAirlineAgency() {
        return airlineAgency;
    }

    public void setAirlineAgency(String airlineAgency) {
        this.airlineAgency = airlineAgency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Ticket(String flight,Seat seat,String airlineAgency,Customer customer,String ticketNumber)
    {
        this.ticketNumber=ticketNumber;
        this.customer=customer;
        this.airlineNO=flight;
        this.seat=seat;
        this.airlineAgency=airlineAgency;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    @Override
    public String toString(){
        return ticketNumber;
    }

    
}
