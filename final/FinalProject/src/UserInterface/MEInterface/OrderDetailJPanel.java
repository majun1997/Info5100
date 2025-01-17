/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MEInterface;

import His.Network.WorkQueue.HosWork.PurchasingWork;
import His.Network.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class OrderDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderJPanel
     */
   private JPanel rightPanel;
   private WorkRequest result;
    public OrderDetailJPanel() {
       
    }

    public OrderDetailJPanel(JPanel rightPanel, WorkRequest result) {
         initComponents();
         this.rightPanel=rightPanel;//To change body of generated methods, choose Tools | Templates.
         this.result=result;
         populatedetail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hospitalTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        countTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("<back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("name");

        jLabel2.setText("hospital");

        jLabel3.setText("count");

        jLabel4.setText("message");

        jLabel5.setText("Order Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(179, 179, 179)
                .addComponent(jLabel5)
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(hospitalTextField)
                    .addComponent(countTextField)
                    .addComponent(messageTextField))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hospitalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          rightPanel.remove(this);
          CardLayout layout=(CardLayout)rightPanel.getLayout();
          layout.previous(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed
 private void populatedetail(){
     nameTextField.setText(((PurchasingWork)result).getMedicineStorage().getName());
     hospitalTextField.setText(((PurchasingWork)result).getHospital().getName());
     messageTextField.setText(result.toString());
     countTextField.setText(Integer.toString(((PurchasingWork)result).getAmount()));
     nameTextField.setEnabled(false);
     hospitalTextField.setEnabled(false);
     messageTextField.setEnabled(false);
     countTextField.setEnabled(false);
     
     
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField countTextField;
    private javax.swing.JTextField hospitalTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}
