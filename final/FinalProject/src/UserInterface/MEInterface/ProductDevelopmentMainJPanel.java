/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MEInterface;

import His.HisSystem;
import His.Network.Enterprise.Enterprise;
import His.Network.Organization.Organization;
import His.Network.WorkQueue.MEWork.Medicine;
import His.Network.WorkQueue.MEWork.MedicineDictionary;
import His.Network.WorkQueue.MEWork.MedicineStorage;
import His.UserAccount.UserAccount;
import UserInterface.ModifyAccount.ModifyAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ProductDevelopmentMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductDevelopmentJPanel
     */
    private JPanel rightPanel;
    private UserAccount account;
    private Organization organization;
    private HisSystem business;
    private Enterprise enterprise;
    
    private MedicineDictionary medicineDictionary;
    public  ProductDevelopmentMainJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, HisSystem business) {
         initComponents();
         this.rightPanel=userProcessContainer;
         this.account=account;
         this.business=business;
         this.organization=organization;
       
         this.enterprise=enterprise;
         this.medicineDictionary=enterprise.getStorage();            //To change body of generated methods, choose Tools | Templates.
         populatetable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        classficationTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jButton2.setText("View Detail");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("ProductDevelopment");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "price", "count", "productDate"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("<back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("name");

        jLabel3.setText("price");

        jLabel4.setText("classfication");

        classficationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classficationTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("description");

        jLabel6.setText("amount");

        btnModify.setText("Modify Password");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModify))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(191, 191, 191))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(classficationTextField)
                                            .addComponent(descriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(priceTextField)
                                            .addComponent(nameTextField))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(createBtn)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(createBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classficationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        try{
            String name=nameTextField.getText();
            int price=Integer.parseInt(priceTextField.getText());
            if(price <= 0)
            {
                JOptionPane.showMessageDialog(null, "Price must be positivr integer"); 
                return;
            }
            
            String description=descriptionTextField.getText();
            String classification=classficationTextField.getText();
            int count=Integer.parseInt(amountTextField.getText());
            if(count <= 0)
            {
                JOptionPane.showMessageDialog(null, "Count must be positive integer"); 
                return;
            }
            
            
            if(name == null || name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name cannot be empty!");
                return;
            }
            
            
            
            if(description == null || description.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Description cannot be empty!");
                return;
            }
            
            if(classification == null || classification.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Classification cannot be empty!");
                return;
            }
            
            
            
            Medicine medicine=medicineDictionary.productMedicine();
            medicine.setName(name);
            medicine.setPrice(price);
            medicine.setCompany(this.enterprise.getName());
            medicine.setDescription(description);
            medicine.setClassification(classification);
            medicine.setCount(count);
            String pattern1 = "yyyy-MM-dd";            
            medicine.setProductDate(new SimpleDateFormat(pattern1).toString());

            MedicineStorage medicineStorage1= new MedicineStorage(name,price,this.enterprise.getName(),description,classification,count);

            medicineDictionary.storeMedicine(medicineStorage1);
            populatetable();
            JOptionPane.showMessageDialog(null, "medicine Created Successfully");    
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a positive integer in price and count!"); 
        }
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         rightPanel.remove(this);
         CardLayout layout=(CardLayout)rightPanel.getLayout();
         layout.previous(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void classficationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classficationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classficationTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          int selectedRow=jTable2.getSelectedRow();
          if(selectedRow<0){
          JOptionPane.showMessageDialog(null,"Please select a row from table","warning",JOptionPane.WARNING_MESSAGE);
          
          
          }else{
                Medicine result=(Medicine)jTable2.getValueAt(selectedRow,0);
                MedicineDetailJPanel panel=new MedicineDetailJPanel(rightPanel,result);
                rightPanel.add("MedicineDetaiJPanel",panel);
                CardLayout layout=(CardLayout)rightPanel.getLayout();
                layout.next(rightPanel);
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)this.rightPanel.getLayout();
        this.rightPanel.add("modify",new ModifyAccount(this.account,this.rightPanel));
        layout.next(rightPanel);
    }//GEN-LAST:event_btnModifyActionPerformed
  public void populatetable(){
       DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
       dtm.setRowCount(0);
       for(Medicine medicine:medicineDictionary.getMedicineList()){
           Object[] row=new Object[7];
           row[0]=medicine;
           row[1]=medicine.getPrice();
           row[2]=medicine.getCompany();
           row[3]=medicine.getDescription();
           row[4]=medicine.getClassification();
           row[5]=medicine.getCount();
           row[6]=medicine.getProductDate();
           dtm.addRow(row);
           }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField classficationTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
