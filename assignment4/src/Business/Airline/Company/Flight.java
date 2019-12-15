/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*我觉得这个是类似CA9307这样的飞行代号
*
*
*
*
*/
package Business.Airline.Company;


import Business.Airline.Users.Airliner;
import Business.Airline.Users.Customer;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class Flight {
    FlightSchedule schedule;
    
    private Airplane airplane;
    private int seatNumber;
    private int maxSeat;
    private ArrayList<Seat> seat;
    private int []price;
    public int getSeatNumber() {
        return seatNumber;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public ArrayList<Seat> getSeat() {
        return seat;
    }
    


    public Ticket bookSeat(Seat s,Customer c,String n){
        //Ticket(String flight,Seat seat,String airlineAgency,Customer customer,String ticketNumber)
        Ticket ticket=new Ticket(schedule.getFlightNo(),s,schedule.getAgency().getAirline(),c,n);
        s.bookIt();
        this.seatNumber--;
        return ticket;
    }
    public Flight(Airplane airplane,FlightSchedule schedule,int []price){
        this.schedule=schedule;
        this.price=price;
        this.seat=new ArrayList<Seat>();
        schedule.setFlight(this);
        airplane.setAvailable(false);
        this.seatNumber=airplane.getColumn()*airplane.getRow();
        this.airplane=airplane;
        this.maxSeat=this.seatNumber;
        
        for(int i=0;i<airplane.getRow();i++)
        {
            for(int j=0;j<airplane.getColumn();j++)
            {
                String b=String.valueOf((char)(j+'a'));
                String a=""+(i+1)+b;
                Seat add=new Seat(a,this);
                seat.add(add);
            }
        }
        
    }
    public void returnSeat(Ticket ticket){
        Seat seatt=ticket.getSeat();
        
        seatt.setAvailable(true);
       
        this.seatNumber++;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeat(ArrayList<Seat> seat) {
        this.seat = seat;
    }

    public FlightSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(FlightSchedule schedule) {
        this.schedule = schedule;
    }

    public int getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(int maxSeat) {
        this.maxSeat = maxSeat;
    }
    @Override
    public String toString(){
        return this.getSchedule().getAgency().getAirline();
    }
    
}
