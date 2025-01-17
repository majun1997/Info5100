/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Agency;

import Business.Airline.Company.Ticket;
import Business.Airline.Users.Airliner;
import Business.Airline.Users.Customer;
import Business.Airline.Users.TravelOffice;
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
public class OfficePanel extends javax.swing.JPanel {
    private ArrayList<TravelOffice> office;
    private JPanel rightPanel;
    private UserList list;
    /**
     * Creates new form OfficePanel
     */
    public OfficePanel(ArrayList<TravelOffice> office,JPanel rightPanel,UserList list) {
        initComponents();
        this.office=office;
        this.list=list;
        this.rightPanel=rightPanel;
        populate();
    }
    public void populate(){
        DefaultTableModel dtms = (DefaultTableModel)tableAirliner.getModel();
        dtms.setRowCount(0);
        for(TravelOffice a:office)
        {
            Object[] row = new Object[dtms.getColumnCount()];
            row[0]=a;
            row[1]=a.getUserName();
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
        tableAirliner = new javax.swing.JTable();
        backBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tableAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Office", "username"
            }
        ));
        jScrollPane1.setViewportView(tableAirliner);

        backBTN.setText("<BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Office");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBTN)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
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
        
        int selectedRow = tableAirliner.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                TravelOffice prod = (TravelOffice)tableAirliner.getValueAt(selectedRow, 0);
                for(Customer c:prod.getCustomer()){
                    for(Ticket ticket:c.getTicket()){
                        list.delTicket(ticket);
                    
                        ticket.getSeat().getFlight().returnSeat(ticket);
                    }
                    
                    
                    
                }
                list.deleteCustomer(prod);
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
    private javax.swing.JTable tableAirliner;
    // End of variables declaration//GEN-END:variables
}
