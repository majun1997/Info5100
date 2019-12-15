/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import UserInterface.Customer.CustomerFirstJPanel;
import UserInterface.Agency.TravelAgencyLogin;
import UserInterface.TravelOffice.OfficeLogin;
import UserInterface.Airliner.AirlinerAdminPanel;
import Business.Airline.Abstract.*;
import Business.Airline.Company.*;
import Business.Airline.Manage.*;
import Business.Airline.Users.*;
import java.awt.CardLayout;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 52909
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private UserList userList;
    public MainJFrame() throws ParseException {
        initComponents();
        userList=new UserList();
        userList.initUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        rightPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        travelBTN = new javax.swing.JButton();
        customerBTN = new javax.swing.JButton();
        airlineBTN = new javax.swing.JButton();
        agencyBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 722));

        rightPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        rightPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightPanel);

        travelBTN.setText("Travel Office");
        travelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelBTNActionPerformed(evt);
            }
        });

        customerBTN.setText("Customer");
        customerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBTNActionPerformed(evt);
            }
        });

        airlineBTN.setText("Airliner");
        airlineBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineBTNActionPerformed(evt);
            }
        });

        agencyBTN.setText("Travel Agency");
        agencyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agencyBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(travelBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airlineBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agencyBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(travelBTN)
                .addGap(55, 55, 55)
                .addComponent(customerBTN)
                .addGap(54, 54, 54)
                .addComponent(airlineBTN)
                .addGap(49, 49, 49)
                .addComponent(agencyBTN)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void travelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelBTNActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add("TravelAgencyLogin",new OfficeLogin(userList,rightPanel));
        //JPanel rightPanel;
        layout.next(rightPanel);
        
        
    }//GEN-LAST:event_travelBTNActionPerformed

    private void airlineBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineBTNActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add("AirlinerAdminPanel",new AirlinerAdminPanel(rightPanel,userList));
        layout.next(rightPanel);
    }//GEN-LAST:event_airlineBTNActionPerformed

    private void agencyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agencyBTNActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add("AdminLogin",new TravelAgencyLogin(userList,rightPanel));
        //JPanel rightPanel;
        layout.next(rightPanel);
    }//GEN-LAST:event_agencyBTNActionPerformed

    private void customerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBTNActionPerformed
        // TODO add your handling code here:
        CustomerFirstJPanel panel= new CustomerFirstJPanel(rightPanel,userList);
        rightPanel.add("CustomerFirstJpanel",panel);
        CardLayout layout=(CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_customerBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agencyBTN;
    private javax.swing.JButton airlineBTN;
    private javax.swing.JButton customerBTN;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton travelBTN;
    // End of variables declaration//GEN-END:variables
}