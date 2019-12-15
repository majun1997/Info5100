/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import His.Employee.Employee;
import His.HisSystem;
import His.Network.Enterprise.Enterprise;

import His.Network.Enterprise.HospitalE;
import His.Network.Network;
import His.Network.Organization.Organization;
import His.Network.Role.Patient;
import His.Network.WorkQueue.GeneralAccountingWork;
import His.Network.WorkQueue.PatientRegister;
import His.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 52909
 */
public class RegisteredHos extends javax.swing.JPanel {

    /**
     * Creates new form RegisteredHos
     */
    private JPanel rightPanel;
    private HisSystem system;
    private UserAccount account;
    private Organization organization;
    public RegisteredHos(JPanel rightPanel,HisSystem system,UserAccount account) {
        initComponents();
        this.rightPanel=rightPanel;
        this.system=system;
        this.account=account;
        this.NetworkList.removeAllItems();
        this.doctorList.removeAllItems();
        this.hospitalList.removeAllItems();
        popNetwork();
    }
    public void popNetwork(){
        this.NetworkList.removeAllItems();
        for(Map.Entry<String, Network> entry:system.getNetwork().entrySet()){
                //Step 2.a: check against each enterprise
                Network network=entry.getValue();
            NetworkList.addItem(network);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NetworkList = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        hospitalList = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        doctorList = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("<BACK");
        jButton1.setPreferredSize(new java.awt.Dimension(81, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Area");

        NetworkList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NetworkList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NetworkListItemStateChanged(evt);
            }
        });

        jLabel2.setText("Hospital");

        hospitalList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hospitalList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hospitalListItemStateChanged(evt);
            }
        });

        jLabel3.setText("Doctor");

        doctorList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("submit");
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NetworkList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doctorList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NetworkList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        this.rightPanel.remove(this);
        layout.previous(this.rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NetworkListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NetworkListItemStateChanged
        // TODO add your handling code here:
        this.hospitalList.removeAllItems();
        Network network = (Network) NetworkList.getSelectedItem();
        if (network != null){
            populateHospitalComboBox(network);
        }
    }//GEN-LAST:event_NetworkListItemStateChanged

    private void hospitalListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hospitalListItemStateChanged
        // TODO add your handling code here:
        this.doctorList.removeAllItems();
        HospitalE hospital = (HospitalE) this.hospitalList.getSelectedItem();
        if (hospital != null){
            populateDoctorComboBox(hospital);
        }
        
    }//GEN-LAST:event_hospitalListItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            PatientRegister request=new PatientRegister();
            ((Patient)account.getRole()).getPersonalCase().add(request.getPatientCase());
            request.setMessage("a new patient");
            request.setSender(account);
            request.setHospital((HospitalE)this.hospitalList.getSelectedItem());
            request.setNetwork((Network)this.NetworkList.getSelectedItem());
            request.setStatus("waiting");
            request.setRequestDate(new Date());

            if(doctorList.getSelectedItem().equals("any")){
                this.organization.getWorkQueue().getWorkRequestList().add(request);
                GeneralAccountingWork GArequest=new GeneralAccountingWork(15);
                GArequest.setStatus("pending");
                GArequest.setMessage("A Patient");

                for(Map.Entry<String, Organization> entryOrganization:((HospitalE)(this.hospitalList.getSelectedItem())).getOrganizationDirectory().getOrganizationList().entrySet()){
                    //Step 2.a: check against each enterprise
                    Organization org=entryOrganization.getValue();
                    if(org.getOrganizationtype()!=null){
                        if(org.getOrganizationtype().equals(Organization.Type.GeneralAccounting)){
                            org.getWorkQueue().getWorkRequestList().add(GArequest);
                        }
                    }
                }
            }
            else{
                for(UserAccount account:this.organization.getUserAccountDirectory().getUserAccountList()){
                if(account.getEmployee().equals((Employee)this.doctorList.getSelectedItem()))
                    request.setReceiver(account);
                    request.setDoctor((Employee)this.doctorList.getSelectedItem());
                    account.getWorkqueue().getWorkRequestList().add(request);
                }                                 
                request.setDoctor((Employee)this.doctorList.getSelectedItem());            
                GeneralAccountingWork GArequest=new GeneralAccountingWork(30);
                GArequest.setStatus("pending");
                GArequest.setMessage("A Patient(reservation)");
                for(Map.Entry<String, Organization> entryOrganization:((HospitalE)(this.hospitalList.getSelectedItem())).getOrganizationDirectory().getOrganizationList().entrySet()){
                    //Step 2.a: check against each enterprise
                    Organization org=entryOrganization.getValue();
                    if(org.getOrganizationtype()!=null){
                        if(org.getOrganizationtype().equals(Organization.Type.GeneralAccounting)){
                            org.getWorkQueue().getWorkRequestList().add(GArequest);
                        }
                    }
                }
            }  

            this.account.getWorkqueue().getWorkRequestList().add(request);
            //back
            CardLayout layout = (CardLayout)this.rightPanel.getLayout();
            this.rightPanel.remove(this);
            layout.previous(this.rightPanel);    
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please make selection!");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void populateDoctorComboBox(HospitalE hospital){
        for(Map.Entry<String, Organization> entryOrganization:hospital.getOrganizationDirectory().getOrganizationList().entrySet()){
                //Step 2.a: check against each enterprise
            Organization outpatient=entryOrganization.getValue();
        
            System.out.print(outpatient.getOrganizationtype());
            if(outpatient.getOrganizationtype()!=null)
            if(outpatient.getOrganizationtype().equals(Organization.Type.Outpatient)){
                this.organization=outpatient;
                
                for(Employee employee : outpatient.getEmployeeDirectory().getEmployeeList()){
                    this.doctorList.addItem(employee);
                }
            }
        }
        this.doctorList.addItem("any");
    }
    public void populateHospitalComboBox(Network network){
        for(Map.Entry<String, Enterprise> entryEnter:network.getEnterpriseDirectory().getEnterpriseList().entrySet()){
                //Step 2.a: check against each enterprise
                Enterprise enterprise=entryEnter.getValue();
            if(enterprise.getEnterpriseType()==Enterprise.EnterpriseType.Hospital){
                this.hospitalList.addItem(enterprise);
            }
            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox NetworkList;
    private javax.swing.JComboBox doctorList;
    private javax.swing.JComboBox hospitalList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
