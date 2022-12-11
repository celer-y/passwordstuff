/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.test1;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import jssc.SerialPort;
import jssc.SerialPortException;

import java.sql.*;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chkUpperCase = new javax.swing.JCheckBox();
        chkNumbers = new javax.swing.JCheckBox();
        chkSymbol = new javax.swing.JCheckBox();
        btnGenerate = new javax.swing.JButton();
        txtboxPass = new javax.swing.JPasswordField();
        lblSite = new javax.swing.JLabel();
        see = new javax.swing.JToggleButton();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtboxSite = new javax.swing.JTextField();
        txtboxUser = new javax.swing.JTextField();
        chkLowerCase = new javax.swing.JCheckBox();
        btnCopy = new javax.swing.JButton();
        lblPass1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        chkUpperCase.setText("Uppercase A-Z");

        chkNumbers.setText("Digits 0-9");
        chkNumbers.setToolTipText("");

        chkSymbol.setText("Symbols #@&");
        chkSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSymbolActionPerformed(evt);
            }
        });

        btnGenerate.setText("Generate");
        btnGenerate.setToolTipText("");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        txtboxPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtboxPassActionPerformed(evt);
            }
        });

        lblSite.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblSite.setText("Site");
        lblSite.setName(""); // NOI18N

        see.setText("👁");
        see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblUser.setText("Username");

        lblPass.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblPass.setText("Password");

        chkLowerCase.setText("Lowercase a-z");
        chkLowerCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLowerCaseActionPerformed(evt);
            }
        });

        btnCopy.setText("Copy");
        btnCopy.setToolTipText("");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        lblPass1.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblPass1.setText("Password Length");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(lblPass)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtboxUser, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addComponent(lblSite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtboxSite))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtboxPass, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(see))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPass1)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkSymbol))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkLowerCase, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkUpperCase))
                                .addGap(227, 227, 227)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblSite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtboxSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtboxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(see)
                    .addComponent(btnCopy))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass1)
                    .addComponent(btnGenerate)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkUpperCase)
                    .addComponent(chkNumbers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkLowerCase)
                    .addComponent(chkSymbol))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkLowerCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLowerCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLowerCaseActionPerformed

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeActionPerformed
        if (see.isSelected()){
            txtboxPass.setEchoChar((char)0);
        } else
        txtboxPass.setEchoChar('*');

    }//GEN-LAST:event_seeActionPerformed

    private void txtboxPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtboxPassActionPerformed

    }//GEN-LAST:event_txtboxPassActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        CharacterRule lowercase = new CharacterRule(EnglishCharacterData.LowerCase);
        CharacterRule uppercase = new CharacterRule(EnglishCharacterData.UpperCase);
        CharacterRule digits = new CharacterRule(EnglishCharacterData.Digit);
        CharacterRule special = new CharacterRule(EnglishCharacterData.Special);

        PasswordGenerator passwordGenerator = new PasswordGenerator();

        String password;

        int passLength = 16;

        passLength = (Integer) jSpinner1.getValue();
        password = getPassword(lowercase, uppercase, digits, passLength, special, passwordGenerator);

        passLength = (Integer) jSpinner1.getValue();

        StringSelection stringSelectionObj = new StringSelection(password);
        Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboardObj.setContents(stringSelectionObj, null);

        txtboxPass.setText(password);

        SerialPort serialPort = new SerialPort("COM10");

        try {
            serialPort.openPort();
            serialPort.setParams(9600, 8, 1, 0);
        } catch (SerialPortException e) {
            e.printStackTrace();
        }

        try {
            serialPort.writeString(password);
        } catch (SerialPortException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnGenerateActionPerformed

    private void chkSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSymbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSymbolActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopyActionPerformed

    private String getPassword(CharacterRule lowercase, CharacterRule uppercase, CharacterRule digits, int passLength, CharacterRule special, PasswordGenerator passwordGenerator) {
        String password;
        if (chkUpperCase.isSelected()& chkNumbers.isSelected() & chkSymbol.isSelected()){ // no lowercase
            password = passwordGenerator.generatePassword(passLength, uppercase, digits, special);

        } else if (chkLowerCase.isSelected() & chkNumbers.isSelected() & chkSymbol.isSelected()){ // no no uppercase
            password = passwordGenerator.generatePassword(passLength, lowercase, digits, special);

        } else if(chkLowerCase.isSelected() & chkUpperCase.isSelected() & chkSymbol.isSelected()){ // no numbers
            password = passwordGenerator.generatePassword(passLength, lowercase, uppercase, special);

        } else  if(chkLowerCase.isSelected() & chkUpperCase.isSelected()& chkNumbers.isSelected()){ // no symbols
            password = passwordGenerator.generatePassword(passLength, lowercase, uppercase, digits);

        } else if (chkNumbers.isSelected() & chkSymbol.isSelected()) { // no letters
            password = passwordGenerator.generatePassword(passLength, special, digits);

        } else if (chkUpperCase.isSelected() & chkLowerCase.isSelected()) { // letters only
            password = passwordGenerator.generatePassword(passLength, lowercase, uppercase);

        } else if (chkLowerCase.isSelected() & chkNumbers.isSelected()) { //  lowercase and number
            password = passwordGenerator.generatePassword(passLength, lowercase, digits);

        } else if (chkLowerCase.isSelected() & chkSymbol.isSelected()) { //  lowercase and special
            password = passwordGenerator.generatePassword(passLength, lowercase, special);

        } else if (chkUpperCase.isSelected() & chkNumbers.isSelected()) { // uppercase and number
            password = passwordGenerator.generatePassword(passLength, uppercase, digits);

        } else if (chkUpperCase.isSelected() & chkSymbol.isSelected()) { //  uppercase and special
            password = passwordGenerator.generatePassword(passLength, uppercase, special);

        } else {
        password = passwordGenerator.generatePassword(passLength, lowercase, uppercase, digits, special);
        }
        return password;
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JCheckBox chkLowerCase;
    private javax.swing.JCheckBox chkNumbers;
    private javax.swing.JCheckBox chkSymbol;
    private javax.swing.JCheckBox chkUpperCase;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblSite;
    private javax.swing.JLabel lblUser;
    private javax.swing.JToggleButton see;
    private javax.swing.JPasswordField txtboxPass;
    private javax.swing.JTextField txtboxSite;
    private javax.swing.JTextField txtboxUser;
    // End of variables declaration//GEN-END:variables
}
