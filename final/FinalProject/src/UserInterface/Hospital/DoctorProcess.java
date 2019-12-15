
package UserInterface.Hospital;

import His.HisSystem;
import His.Network.Enterprise.Enterprise;
import His.Network.Enterprise.HospitalE;
import His.Network.Organization.Organization;
import His.Network.Role.Hos.Nursing;
import His.Network.Role.Patient;
import His.Network.WorkQueue.GeneralAccountingWork;
import His.Network.WorkQueue.HosWork.NursingWork;
import His.Network.WorkQueue.MEWork.Medicine;
import His.Network.WorkQueue.MEWork.MedicineDictionary;
import His.Network.WorkQueue.MEWork.MedicineStorage;
import His.Network.WorkQueue.PatientRegister;
import His.Network.WorkQueue.WorkRequest;
import His.UserAccount.UserAccount;
import UserInterface.Hospital.OutpatientJPanel;
import UserInterface.SysAdmin.SysAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 52909
 */
public class DoctorProcess extends javax.swing.JPanel {

    /**
     * Creates new form DoctorProcess
     */
    private JPanel rightPanel;
    private UserAccount account;
    private Organization organization;
    private HisSystem business;
    private HospitalE enterprise;
    private Map<String,String> medicine;
    private PatientRegister patientRegister;
    public DoctorProcess(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, HisSystem business,PatientRegister patientRegister) {
        initComponents();
        this.rightPanel=userProcessContainer;
        this.account=account;
        this.business=business;
        this.organization=organization;
        this.enterprise=(HospitalE)enterprise;
        this.medicine=new HashMap();
        this.patientRegister= patientRegister;
        populateMedicineCombo();
    }
    public void populateMedicineCombo(){
        this.medicineCombo.removeAllItems();
        this.enterprise.getStorage().getMedicineStorageMap();
        for (Map.Entry<String, MedicineStorage> entry : enterprise.getStorage().getMedicineStorageMap().entrySet()) {              
            medicineCombo.addItem(entry.getKey());                 
        }
    }
    public void populateMedicine(){
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        
        model.setRowCount(0);
        int i=0;
        for (Map.Entry<String, String> entry : medicine.entrySet()) {              
            
            Object[] row = new Object[2];
            row[0] = entry.getKey();            
            row[1] = entry.getValue();           
                
            model.addRow(row);
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
        caseInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        countInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        medicineCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nursingCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        attentionInput = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient Case");

        jLabel2.setText("Medicine");

        countInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countInputActionPerformed(evt);
            }
        });

        jLabel3.setText("count");

        medicineCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Nursing");

        nursingCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Specified", "not specified" }));

        jLabel5.setText("Attention");

        jButton2.setText("add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Count"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<< Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(medicineCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(46, 46, 46)
                                .addComponent(nursingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(countInput, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(attentionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(caseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jScrollPane1)
                .addContainerGap())

                    

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(caseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(countInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(medicineCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nursingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(attentionInput)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton4)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(attentionInput.getText() == "" || caseInput.getText() == "" || attentionInput.getText() == null || caseInput.getText() == null)
        {
            JOptionPane.showMessageDialog(null, "Please input something!");
        }
        else
        {
            String patientCase=this.caseInput.getText();
            MedicineDictionary med=new MedicineDictionary(1);
            for (Map.Entry<String, String> entry : medicine.entrySet()) {              
                MedicineStorage add = new MedicineStorage();
                add.setName(entry.getKey());
                
                add.setCount(Integer.parseInt(entry.getValue()));
                med.getMedicineStorageMap().put(entry.getKey(), add);
            }
            if(nursingCombo.getSelectedItem().equals("Specified")){
                //需要护士

                for(Map.Entry<String, Organization> entryOrganization:enterprise.getOrganizationDirectory().getOrganizationList().entrySet()){
                //Step 2.a: check against each enterprise
                    Organization org=entryOrganization.getValue();
                    if(org.getOrganizationtype()!=null)
                    if(org.getOrganizationtype().equals(Organization.Type.Nursing)){
                        NursingWork request=new NursingWork();
                        request.setMessage(attentionInput.getText());
                        request.setRequestDate(new Date());
                        request.setStatus("waiting");
                        request.setSender(account);
                        request.setPatient((Patient)patientRegister.getSender().getRole());
                        org.getWorkQueue().getWorkRequestList().add(request);
                        GeneralAccountingWork nursingGA=new GeneralAccountingWork(20);
                        nursingGA.setStatus("pending");
                        nursingGA.setMessage("nursing fee");
                        for(Map.Entry<String, Organization> entryOrganization1:enterprise.getOrganizationDirectory().getOrganizationList().entrySet()){
                //Step 2.a: check against each enterprise
                            Organization orgGA=entryOrganization1.getValue();
                            if(orgGA.getOrganizationtype()!=null){
                                if(orgGA.getOrganizationtype().equals(Organization.Type.GeneralAccounting)){
                                    orgGA.getWorkQueue().getWorkRequestList().add(nursingGA);
                                }
                            }
                        }
                    }
                }
            }
            int medmoney=0;
            for(Map.Entry<String, String> entry : medicine.entrySet()){
                medmoney+=(this.enterprise.getStorage().getMedicineStorageMap().get(entry.getKey()).getPrice()*1.0625)*Integer.parseInt(entry.getValue());
            }
            GeneralAccountingWork medfee=new GeneralAccountingWork(medmoney);
            medfee.setStatus("pending");
            medfee.setMessage("medicine fee");
            for(Map.Entry<String, Organization> entryOrganization:enterprise.getOrganizationDirectory().getOrganizationList().entrySet()){
                //Step 2.a: check against each enterprise
                            Organization orgGA=entryOrganization.getValue();
                if(orgGA.getOrganizationtype()!=null){
                    if(orgGA.getOrganizationtype().equals(Organization.Type.GeneralAccounting)){
                        orgGA.getWorkQueue().getWorkRequestList().add(medfee);
                    }
                }
            }
            this.patientRegister.setStatus("completed");
            this.patientRegister.getPatientCase().setStatus(true);
            this.patientRegister.getPatientCase().setCase(patientCase);
            this.patientRegister.getPatientCase().setMedicine(med);
            this.rightPanel.remove(this);
            Component[] componentArray = this.rightPanel.getComponents();
            Component component = componentArray[componentArray.length - 1];
            OutpatientJPanel outpatientJPanel = (OutpatientJPanel) component;
            outpatientJPanel.poptable();
            CardLayout layout = (CardLayout) this.rightPanel.getLayout();
            layout.previous(this.rightPanel);    
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            int a=Integer.parseInt(this.countInput.getText());
            if(a>=this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).getCount())
            {
                a=this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).getCount();
                this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).setCount(0);
                if(a==0){
                    JOptionPane.showMessageDialog(null, "no storage");
                    return;
                }                            
                else
                    JOptionPane.showMessageDialog(null, "not enough storage set max");

            }
            else
                this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).setCount(this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).getCount()-a);
            if (a > 0){
                if(medicine.containsKey((String)this.medicineCombo.getSelectedItem()))
                {
                    int b=Integer.parseInt(this.medicine.get((String)this.medicineCombo.getSelectedItem()));
                    //System.out.print(this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).getCount());
                    
                    this.medicine.put((String)this.medicineCombo.getSelectedItem(),String.valueOf(a+b));

                }
                else
                    this.medicine.put((String)this.medicineCombo.getSelectedItem(),String.valueOf(a));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Count must be positive");
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a number!");
        }
        
        
        populateMedicine();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            int a=Integer.parseInt(this.countInput.getText());
            if(a<=0)
            {
                JOptionPane.showMessageDialog(null, "Count must be positive");
            }
            else
            {
                if(medicine.containsKey((String)this.medicineCombo.getSelectedItem()))
                {
                    int b=Integer.parseInt(this.medicine.get((String)this.medicineCombo.getSelectedItem()));
                    if(b>a)
                    {
                        this.medicine.remove((String)this.medicineCombo.getSelectedItem(),String.valueOf(b));
                        this.medicine.put((String)this.medicineCombo.getSelectedItem(),String.valueOf(b-a));
                        
                        
                        this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).setCount(this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).getCount()+a);
                                
                        
                    }
                    else
                    {
                        this.medicine.remove((String)this.medicineCombo.getSelectedItem(),String.valueOf(b));
                        this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).setCount(this.enterprise.getStorage().getMedicineStorageMap().get((String)this.medicineCombo.getSelectedItem()).getCount()+b);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No such medicine!");   
                }
            }
            
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a number!");
        }
        
        
        populateMedicine();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout l = (CardLayout) rightPanel.getLayout();
        l.previous(rightPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void countInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attentionInput;
    private javax.swing.JTextField caseInput;
    private javax.swing.JTextField countInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox medicineCombo;
    private javax.swing.JComboBox nursingCombo;
    // End of variables declaration//GEN-END:variables
}