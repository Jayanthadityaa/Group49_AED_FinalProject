/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ParentsRole;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jayanthkappagantulaa
 */
public class ParentsWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Parents parents;

    /**
     * Creates new form ParentsWorkAreaJPanel
     */
    public ParentsWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.parents = account.getParent();
        valueLabel.setText(enterprise.getName());
       addDashBoard();
    }
    
     public void addDashBoard(){
        ParentDashboard lp = new ParentDashboard(parents);
        dashboardPanel.add(lp);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        checkRequestsPending = new javax.swing.JButton();
        btnViewFamily = new javax.swing.JButton();
        dashboardPanel = new javax.swing.JPanel();
        btnScheduleVisitOrphanage = new javax.swing.JButton();

        enterpriseLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 153, 153));
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 153, 153));
        valueLabel.setText("<value>");

        checkRequestsPending.setBackground(new java.awt.Color(255, 204, 204));
        checkRequestsPending.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        checkRequestsPending.setText("Check Birth Mother Request");
        checkRequestsPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRequestsPendingActionPerformed(evt);
            }
        });

        btnViewFamily.setBackground(new java.awt.Color(255, 204, 204));
        btnViewFamily.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        btnViewFamily.setText("View/Update Family Profile");
        btnViewFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFamilyActionPerformed(evt);
            }
        });

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(900, 424));

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
        );

        btnScheduleVisitOrphanage.setBackground(new java.awt.Color(255, 204, 204));
        btnScheduleVisitOrphanage.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        btnScheduleVisitOrphanage.setText("Schedule visit with Orphanage");
        btnScheduleVisitOrphanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleVisitOrphanageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkRequestsPending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnScheduleVisitOrphanage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkRequestsPending, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnScheduleVisitOrphanage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkRequestsPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRequestsPendingActionPerformed
        if(userAccount.getParent().getBloodGroup() == null){
            JOptionPane.showMessageDialog(this, "Please complete your profile to view requests!");
            return;
        }

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewBirthMotherRequestsJPanel", new ViewBirthMotherRequestsJPanel(userProcessContainer, userAccount, organization, enterprise,system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkRequestsPendingActionPerformed

    private void btnViewFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFamilyActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FamilyProfile", new FamilyProfile(userAccount,organization,userProcessContainer));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewFamilyActionPerformed

    private void btnScheduleVisitOrphanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleVisitOrphanageActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewOrphanageSchedule", new ViewOrphanageSchedule(userProcessContainer));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnScheduleVisitOrphanageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnScheduleVisitOrphanage;
    private javax.swing.JButton btnViewFamily;
    private javax.swing.JButton checkRequestsPending;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
