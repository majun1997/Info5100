/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Airline.Manage.MasterTravelSchedule;
import Business.Airline.Users.Customer;
import Business.Airline.Users.UserList;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class CustomerSecondJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSecondJPanel
     */
   private Customer customer;
   private JPanel rightPanel;
   private MasterTravelSchedule master;
    private UserList userlist;
    public CustomerSecondJPanel(Customer customer,JPanel rightPanel,UserList userlist) {
                       initComponents();   
                  
//To change body of generated methods, choose Tools | Templates.
           this.rightPanel=rightPanel;
           this.customer=customer;
           this.userlist=userlist;
           jLabel2.setText(customer.getUserName());
    
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBuytickets = new javax.swing.JButton();
        btnViewmyorrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Customer Home Page");

        btnBuytickets.setText("Buy Tickets");
        btnBuytickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyticketsActionPerformed(evt);
            }
        });

        btnViewmyorrder.setText("View my Order");
        btnViewmyorrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewmyorrderActionPerformed(evt);
            }
        });

        jButton1.setText("<<back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update my Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuytickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewmyorrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(btnBuytickets, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnViewmyorrder)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewmyorrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewmyorrderActionPerformed
        // TODO add your handling code here:
        CustomerOrderJPanel panel=new CustomerOrderJPanel(userlist.getSchedule(),rightPanel,customer,userlist);
         rightPanel.add("CustomerSechduleJpanel",panel);
        CardLayout layout=(CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
        
        
        
    }//GEN-LAST:event_btnViewmyorrderActionPerformed

    private void btnBuyticketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyticketsActionPerformed
        // TODO add your handling code here:
        CustomerSechduleJPanel panel=new CustomerSechduleJPanel(userlist.getSchedule(),rightPanel,customer,userlist);
         rightPanel.add("CustomerSechduleJpanel",panel);
        CardLayout layout=(CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnBuyticketsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.remove(this);
        layout.previous(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CustomerUpdateInformation panel=new CustomerUpdateInformation(customer,rightPanel);
         rightPanel.add("CustomerUpdateInformation",panel);
        CardLayout layout=(CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuytickets;
    private javax.swing.JButton btnViewmyorrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
