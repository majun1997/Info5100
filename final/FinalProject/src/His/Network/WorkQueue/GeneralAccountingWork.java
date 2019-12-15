/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package His.Network.WorkQueue;

/**
 *
 * @author 52909
 */
public class GeneralAccountingWork extends WorkRequest{
    private int money=0;
    public GeneralAccountingWork(int money){
        this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}
