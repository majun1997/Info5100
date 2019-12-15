/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*客户
*/
package Business.Airline.Users;

import Business.Airline.Abstract.User;
import Business.Airline.Company.Seat;
import Business.Airline.Company.Ticket;
import java.util.ArrayList;

/**
 *
 * @author 52909
 */
public class Customer extends User{
    private String nickName;
    private TravelOffice office;
    private ArrayList<Ticket> ticket;

    public Customer(String password, String userName,String userID) {
        super(password, userName, "Customer",userID);
        ticket=new ArrayList<Ticket>();


        this.nickName="";
    }
    public Customer(String password, String userName,String userID,TravelOffice office) {
        super(password, userName, "Customer",userID);
        ticket=new ArrayList<Ticket>();
        this.office=office;

        this.nickName="";
    }

    public TravelOffice getOffice() {
        return office;
    }

    public void setOffice(TravelOffice office) {
        this.office = office;
    }

    public void addTicket(Ticket add){
        ticket.add(add);
    }
    public void delTicket(Ticket del){
        ticket.remove(del);
    }
    public int getTicketNum(){
        int re=0;
        for(Ticket i:ticket)
        {
            re++;
        }
        return re;
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
       
    }

    @Override
    public String toString(){
        if(nickName=="")
            return this.getUserName();
        else
            return nickName;
    }

    public ArrayList<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(ArrayList<Ticket> ticket) {
        this.ticket = ticket;
    }
    
    
    
}
