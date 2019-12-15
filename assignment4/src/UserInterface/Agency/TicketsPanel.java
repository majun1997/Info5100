/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Agency;

import Business.Airline.Company.Seat;
import Business.Airline.Company.Ticket;
import Business.Airline.Users.Airliner;
import Business.Airline.Users.Customer;
import Business.Airline.Users.UserList;
import java.awt.CardLayout;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 52909
 */
public class TicketsPanel extends javax.swing.JPanel {
    private ArrayList<Ticket> ticket;
    private JPanel rightPanel;
    private UserList list;
    /**
     * Creates new form TicketsPanel
     * @param ticket
     */
    public TicketsPanel(ArrayList<Ticket> ticket,JPanel rightPanel,UserList list) {
        initComponents();
        this.ticket=ticket;
        this.rightPanel=rightPanel;
        this.list=list;
        populate();
    }
//    private String airlineNO;
//    private String ticketNumber;
//    private String airlineAgency;
//    private Seat seat;
//    private Customer customer;
    public void populate(){
        DefaultTableModel dtms = (DefaultTableModel)ticketTable.getModel();
        dtms.setRowCount(0);
        for(Ticket a:ticket)
        {
            Object[] row = new Object[dtms.getColumnCount()];
            row[0]=a;
            row[1]=a.getAirlineNO();
            row[2]=a.getCustomer();
            row[3]=a.getSeat();
            row[4]=a.getAirlineAgency();
            out.println(a+" "+a.getAirlineNO()+" "+a.getCustomer()+" "+a.getSeat()+" "+a.getAirlineAgency());
            dtms.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ticketTable = new javax.swing.JTable();
        backBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        ticketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket Order", "Airline number", "Customer", "Seat", "Airliner"
            }
        ));
        jScrollPane1.setViewportView(ticketTable);

        backBTN.setText("<BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jButton1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        this.rightPanel.remove(this);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          int selectedRow = ticketTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
            
                Ticket prod = (Ticket)ticketTable.getValueAt(selectedRow, 0);
                
                                 
                prod.getCustomer().delTicket(prod);
                            
                
                
                list.delTicket(prod);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ticketTable;
    // End of variables declaration//GEN-END:variables
}