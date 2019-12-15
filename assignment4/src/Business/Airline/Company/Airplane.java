/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*我觉得这个是波音777这样的型号
*
*
*
*/
package Business.Airline.Company;

import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class Airplane {
    private boolean available;
    private String manufacture;
    private String model;
    private int row;
    private int column;
    private int serialNumber;//order
    private Flight flight;

    public Airplane (String manufacture, String model, int row,int column, int serialNumber){
        this.manufacture = manufacture;
        this.model = model;
        this.row=row;
        this.column=column;
        this.serialNumber = serialNumber;
        this.available=true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    @Override
    public String toString(){
        return this.manufacture;
    }
}
