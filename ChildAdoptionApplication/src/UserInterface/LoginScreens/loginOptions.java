/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.LoginScreens;

import Business.EcoSystem;
import Business.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author jayanthkappagantulaa
 */
public class loginOptions extends javax.swing.JPanel {
    
     JPanel userProcessContainer;
     EcoSystem system;
     Organization.Type type;

    /**
     * Creates new form loginOptions
     */
    public loginOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin = new javax.swing.JButton();
        btnMother = new javax.swing.JButton();
        btnFamily = new javax.swing.JButton();
        btnCounselor = new javax.swing.JButton();
        btnFinance = new javax.swing.JButton();
        btnFinance1 = new javax.swing.JButton();

        btnAdmin.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAdmin.setText("ADMIN");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnMother.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMother.setText("MOTHER");
        btnMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotherActionPerformed(evt);
            }
        });

        btnFamily.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnFamily.setText("FAMILY");
        btnFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamilyActionPerformed(evt);
            }
        });

        btnCounselor.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCounselor.setText("COUNSELOR");
        btnCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCounselorActionPerformed(evt);
            }
        });

        btnFinance.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnFinance.setText("INSURANCE");
        btnFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceActionPerformed(evt);
            }
        });

        btnFinance1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnFinance1.setText("BANK");
        btnFinance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinance1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMother, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCounselor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinance1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin)
                    .addComponent(btnFinance))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMother)
                    .addComponent(btnFinance1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFamily)
                    .addComponent(btnCounselor))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.HospitalAdmin);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotherActionPerformed

        loginScreen ls = new loginScreen(userProcessContainer, system, type.BirthMotherOrg);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMotherActionPerformed

    private void btnFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamilyActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.ParentsOrg);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFamilyActionPerformed

    private void btnCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCounselorActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.Counselor);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCounselorActionPerformed

    private void btnFinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer,system, type.InsuranceManager);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFinanceActionPerformed

    private void btnFinance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinance1ActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer,system, type.BankManager);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFinance1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCounselor;
    private javax.swing.JButton btnFamily;
    private javax.swing.JButton btnFinance;
    private javax.swing.JButton btnFinance1;
    private javax.swing.JButton btnMother;
    // End of variables declaration//GEN-END:variables
}
