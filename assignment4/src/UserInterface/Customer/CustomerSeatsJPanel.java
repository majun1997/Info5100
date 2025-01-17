/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Airline.Company.Flight;
import Business.Airline.Company.Seat;
import Business.Airline.Company.Ticket;
import Business.Airline.Users.Customer;
import Business.Airline.Users.TravelOffice;
import Business.Airline.Users.UserList;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class CustomerSeatsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSeatsJPanel
     */
    private Flight flight;
    private JPanel rightPanel;
    private Customer customer;
    private UserList userlist;
    

    public CustomerSeatsJPanel(Flight result, JPanel rightPanel, Customer customer,UserList userlist) {
        initComponents();
        this.flight=result;
        this.rightPanel=rightPanel;
        this.customer=customer;
        this.userlist=userlist;
         init();                   //To change body of generated methods, choose Tools | Templates.
       jLabel1.setText(customer.getUserName());
       jLabel2.setText(flight.getSchedule().getFlightNo());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seatCombo = new javax.swing.JComboBox();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        seatCombo.setMaximumRowCount(500);
        seatCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seatCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatComboActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(seatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(btnConfirm)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirm)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack)))
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        Seat seat=(Seat)seatCombo.getSelectedItem();
        
       
        
        
        Ticket ticket=flight.bookSeat(seat, customer, customer.getOffice().buyTicket());
        userlist.addTicket(ticket);
        customer.getTicket().add(ticket);
        JOptionPane.showMessageDialog(null, "purchase successfully");
        rightPanel.remove(this);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
        
        
        
        
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void seatComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatComboActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         rightPanel.remove(this);
         CardLayout layout=(CardLayout)rightPanel.getLayout();
         layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed
   private void init(){
        seatCombo.removeAllItems();
        for(Seat seat:flight.getSeat())
        {
            if(seat.isAvailable())
                seatCombo.addItem(seat);
        }
       
       
   }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox seatCombo;
    // End of variables declaration//GEN-END:variables
}
