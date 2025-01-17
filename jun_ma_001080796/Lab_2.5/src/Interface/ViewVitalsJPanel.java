/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;
import Bussiness.VitalSignHistory;
import javax.swing.table.DefaultTableModel;
import Bussiness.VitalSigns;
import static java.lang.System.out;

import javax.swing.JOptionPane;
/**
 *
 * @author majun
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
    private VitalSignHistory vsh;
    public ViewVitalsJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh=vsh;
        populateTable();
    }
    public ViewVitalsJPanel(VitalSignHistory vsh,double min,double max) {
        initComponents();
        this.vsh=vsh;
        populateTableAbn(min,max);
    }
    public void populateTable()
    {
        title.setText("VIEW ALL");
        DefaultTableModel dtm=( DefaultTableModel)tableDisplay.getModel();
        dtm.setRowCount(0);
        for(VitalSigns vs:vsh.getVitalSignHistory())
        {
            Object row[]=new Object[2];
            row[0]=vs;
            row[1]=vs.getBloodPressure();
            dtm.addRow(row);
        }
    }
    public void populateTableAbn(double min,double max)
    {
        title.setText("VIEW ABNORMAL");
        DefaultTableModel dtm=( DefaultTableModel)tableDisplay.getModel();
        dtm.setRowCount(0);
        for(VitalSigns vs:vsh.getVitalSignHistory())
        {
            if(vs.getBloodPressure()>max || vs.getBloodPressure()<min)
            {
                Object row[]=new Object[2];
                row[0]=vs;
                row[1]=vs.getBloodPressure();
                dtm.addRow(row);
                
            }
            
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

        jLabel4 = new javax.swing.JLabel();
        temperature = new javax.swing.JTextField();
        bloodPressure = new javax.swing.JTextField();
        pulse = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();
        btnDetail = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        jLabel4.setText("Date");

        temperature.setEnabled(false);

        bloodPressure.setEnabled(false);

        pulse.setEnabled(false);

        date.setEnabled(false);

        title.setText("View Vitals Sign");

        jLabel1.setText("Temperature");

        jLabel2.setText("Bloodpressure");

        jLabel3.setText("Pulse");

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "BloodPressure"
            }
        ));
        jScrollPane1.setViewportView(tableDisplay);

        btnDetail.setText("Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setText("update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnConfirm.setText("confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDetail)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bloodPressure, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pulse, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(temperature))
                            .addComponent(btnConfirm))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetail)
                    .addComponent(btnDelete)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        int selectedrow = tableDisplay.getSelectedRow();
        if(selectedrow>=0)
        {
            VitalSigns a=(VitalSigns)tableDisplay.getValueAt(selectedrow, 0);
            bloodPressure.setText(String.valueOf(a.getBloodPressure()));
            temperature.setText(String.valueOf(a.getTemprature()));
            date.setText(a.getDate());
            pulse.setText(String.valueOf(a.getPulse()));
            
        }
        else
            JOptionPane.showMessageDialog(null, "select a row now");
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = tableDisplay.getSelectedRow();
        if(selectedrow>=0)
        {
            VitalSigns a=(VitalSigns)tableDisplay.getValueAt(selectedrow, 0);
            vsh.deleteVitals(a);
            JOptionPane.showMessageDialog(null, "sucessfuly delete");
            populateTable();
            
        }
        else
            JOptionPane.showMessageDialog(null, "select a row now");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedrow = tableDisplay.getSelectedRow();
        if(selectedrow>=0)
        {
            VitalSigns a=(VitalSigns)tableDisplay.getValueAt(selectedrow, 0);
            setFieldEnabled(true);
            
            bloodPressure.setText(String.valueOf(a.getBloodPressure()));
            temperature.setText(String.valueOf(a.getTemprature()));
            date.setText(a.getDate());
            pulse.setText(String.valueOf(a.getPulse()));
            vsh.deleteVitals(a);
            //populateTable();
            
        }
        else
            JOptionPane.showMessageDialog(null, "select a row now");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        VitalSigns v=vsh.addVitals();
        v.setBloodPressure(Double.parseDouble(bloodPressure.getText()));
        v.setDate(date.getText());
        v.setPulse(Integer.parseInt(pulse.getText()));
        v.setTemprature(Double.parseDouble(temperature.getText()));
        JOptionPane.showMessageDialog(null,"vital signs update successfully");
        setFieldEnabled(false);
        populateTable();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void setFieldEnabled(boolean b)
    {
            temperature.setEnabled(b);
            bloodPressure.setEnabled(b);
            pulse.setEnabled(b);
            date.setEnabled(b);
            btnConfirm.setEnabled(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressure;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulse;
    private javax.swing.JTable tableDisplay;
    private javax.swing.JTextField temperature;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
