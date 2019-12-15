/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*空管局设置的飞行时间？

*/
package Business.Airline.Company;

import Business.Airline.Users.Airliner;
import java.util.Date;

/**
 *
 * @author 52909
 */
public class FlightSchedule {
    private Airliner agency;
    private String depart;
    private String arrive;
    private String departTime;
    private String tourTime;
    private Date date;
    private String flightNo;
    private Flight flight;
    
    public FlightSchedule(Airliner agency,String depart,String arrive,String departTime,String tourTime,Date date,String flightNo)
    {
        this.agency=agency;
        this.arrive=arrive;
        this.depart=depart;
        this.departTime=departTime;
        this.tourTime=tourTime;
        this.date=date;
        this.flightNo=flightNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public Airliner getAgency() {
        return agency;
    }

    public void setAgency(Airliner agency) {
        this.agency = agency;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getTourTime() {
        return tourTime;
    }

    public void setTourTime(String tourTime) {
        this.tourTime = tourTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString()
    {
        return this.agency.getAirline();
    }
}
