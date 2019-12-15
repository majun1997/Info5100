/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
/**
 *
 * @author 52909
 */
public class MainJFrame extends javax.swing.JFrame {
    private Product product;
    /**
     * Creates new form NewJFrame
     */
    public MainJFrame() {
        initComponents();
        product=new Product(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitJPanel = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        CreateBTN = new javax.swing.JButton();
        ViewBTN = new javax.swing.JButton();
        DisplayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateBTN.setText("Create");
        CreateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBTNActionPerformed(evt);
            }
        });

        ViewBTN.setText("View");
        ViewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlJPanelLayout = new javax.swing.GroupLayout(ControlJPanel);
        ControlJPanel.setLayout(ControlJPanelLayout);
        ControlJPanelLayout.setHorizontalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(ControlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlJPanelLayout.setVerticalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(CreateBTN)
                .addGap(61, 61, 61)
                .addComponent(ViewBTN)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        SplitJPanel.setLeftComponent(ControlJPanel);

        javax.swing.GroupLayout DisplayJPanelLayout = new javax.swing.GroupLayout(DisplayJPanel);
        DisplayJPanel.setLayout(DisplayJPanelLayout);
        DisplayJPanelLayout.setHorizontalGroup(
            DisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        DisplayJPanelLayout.setVerticalGroup(
            DisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        SplitJPanel.setRightComponent(DisplayJPanel);

        getContentPane().add(SplitJPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBTNActionPerformed
        // TODO add your handling code here:
        CreateJPanel create=new CreateJPanel(product);
        SplitJPanel.setRightComponent(create);
    }//GEN-LAST:event_CreateBTNActionPerformed

    private void ViewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBTNActionPerformed
        // TODO add your handling code here:
        ViewPanel view=new ViewPanel(product);
        SplitJPanel.setRightComponent(view);
    }//GEN-LAST:event_ViewBTNActionPerformed

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
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton CreateBTN;
    private javax.swing.JPanel DisplayJPanel;
    private javax.swing.JSplitPane SplitJPanel;
    private javax.swing.JButton ViewBTN;
    // End of variables declaration//GEN-END:variables
}
