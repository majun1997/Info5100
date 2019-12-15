/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelOffice;

import Business.Airline.Users.TravelOffice;
import Business.Airline.Users.UserList;
import java.awt.CardLayout;
import java.awt.Color;
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author 52909
 */
public class UpdateOffice extends javax.swing.JPanel {
    private TravelOffice office;
    private JPanel rightPanel;
    /**
     * Creates new form RegisterOffice
     */
    public UpdateOffice(TravelOffice office,JPanel rightPanel) {
        initComponents();
        this.office=office;
        this.rightPanel=rightPanel;
        MatteBorder borderRed = new MatteBorder(2, 2, 2, 2, new Color(255, 0,0));
        MatteBorder borderOri = new MatteBorder(0, 0, 0, 0, new Color(255, 255,255));
        usernameTxt.setText(office.getUserName());
        passwordTxt.setText(office.getPassword());
        rePasswordTxt.setText(office.getPassword());
        officeNameTxt.setText(office.getOfficeName());
        userIDTxt.setText(office.getUserID());
        passwordTxt.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
              warn();
            }
            public void removeUpdate(DocumentEvent e) {
              warn();
            }
            public void insertUpdate(DocumentEvent e) {
              warn();
            }

            public void warn() {
                
                Pattern p=Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
                Matcher m=p.matcher(String.valueOf(passwordTxt.getPassword()));
                if(!m.matches())
                    passwordTxt.setBorder(borderRed);
                else
                    passwordTxt.setBorder(borderOri);
            
            }
         });
        usernameTxt.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
              warn();
            }
            public void removeUpdate(DocumentEvent e) {
              warn();
            }
            public void insertUpdate(DocumentEvent e) {
              warn();
            }

            public void warn() {
                
                String a=usernameTxt.getText();
                if(a.equals("") || a==null)
                    usernameTxt.setBorder(borderRed);
                else
                    usernameTxt.setBorder(borderOri);
            
            }
         });
        
        rePasswordTxt.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
              warn();
            }
            public void removeUpdate(DocumentEvent e) {
              warn();
            }
            public void insertUpdate(DocumentEvent e) {
              warn();
            }

            public void warn() {
                
                String a=String.valueOf(rePasswordTxt.getPassword());
                if(!a.equals(String.valueOf(passwordTxt.getPassword())))
                    rePasswordTxt.setBorder(borderRed);
                else
                    rePasswordTxt.setBorder(borderOri);
            
            }
         });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordTxt = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        usernameTxt = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        registerBTN = new javax.swing.JButton();
        rePasswordTxt = new javax.swing.JPasswordField();
        passwordLabel1 = new javax.swing.JLabel();
        officeNameTxt = new javax.swing.JTextField();
        officeNameLabel = new javax.swing.JLabel();
        officeNameLabel1 = new javax.swing.JLabel();
        userIDTxt = new javax.swing.JTextField();

        setLayout(null);
        add(passwordTxt);
        passwordTxt.setBounds(345, 188, 133, 24);

        back.setText("<BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back);
        back.setBounds(0, 13, 113, 79);
        add(usernameTxt);
        usernameTxt.setBounds(345, 146, 133, 24);

        usernameLabel.setText("Username");
        add(usernameLabel);
        usernameLabel.setBounds(14, 149, 64, 18);

        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(14, 191, 64, 18);

        registerBTN.setText("Update");
        registerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBTNActionPerformed(evt);
            }
        });
        add(registerBTN);
        registerBTN.setBounds(345, 327, 81, 52);

        rePasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePasswordTxtActionPerformed(evt);
            }
        });
        add(rePasswordTxt);
        rePasswordTxt.setBounds(345, 225, 133, 24);

        passwordLabel1.setText("re-enter Password");
        add(passwordLabel1);
        passwordLabel1.setBounds(14, 228, 136, 18);
        add(officeNameTxt);
        officeNameTxt.setBounds(345, 262, 133, 24);

        officeNameLabel.setText("OfficeName");
        add(officeNameLabel);
        officeNameLabel.setBounds(14, 265, 136, 18);

        officeNameLabel1.setText("UserID");
        add(officeNameLabel1);
        officeNameLabel1.setBounds(14, 299, 325, 18);
        add(userIDTxt);
        userIDTxt.setBounds(345, 296, 133, 24);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.rightPanel.remove(this);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
        
        
    }//GEN-LAST:event_backActionPerformed
    
    private void rePasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePasswordTxtActionPerformed

    private void registerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBTNActionPerformed
        // TODO add your handling code here:
        String username=usernameTxt.getText();
        String password=String.valueOf(passwordTxt.getPassword());
        String repassword=String.valueOf(rePasswordTxt.getPassword());
        String officeName=officeNameTxt.getText();
        String userID=userIDTxt.getText();
        if(userID==null || userID.equals("")){
            JOptionPane.showMessageDialog(null, "username can not be empty");
            return;
        }
        if(username==null || username.equals("")){
            JOptionPane.showMessageDialog(null, "username can not be empty");
            return;
        }
        Pattern p=Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
        Matcher m=p.matcher(password);
        if(!m.matches())
        {
            JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and a"+"combination of number,upper case,lower case and"+"special charactors $,*,# or &");
            return;
        }
        if(password==null || password.equals("") ){
            JOptionPane.showMessageDialog(null, "password can not be empty");
            return;
        }
        if(repassword==null || repassword.equals("") || !repassword.equals(password)){
            JOptionPane.showMessageDialog(null, "RE-enter password can not be empty");
            return;
        }
        if(officeName==null || officeName.equals("")){
            JOptionPane.showMessageDialog(null, "Office Name can not be empty");
            return;
        }
        office.setOfficeName(officeName);
        office.setPassword(password);
        office.setUserID(userID);
        office.setUserName(username);
        this.rightPanel.remove(this);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_registerBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel officeNameLabel;
    private javax.swing.JLabel officeNameLabel1;
    private javax.swing.JTextField officeNameTxt;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JPasswordField rePasswordTxt;
    private javax.swing.JButton registerBTN;
    private javax.swing.JTextField userIDTxt;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
