/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Register;

/**
 *
 * @author Koundi
 */
public class registerOptions extends javax.swing.JPanel {

    JPanel userProcessContainer;

    EcoSystem system;

    public BirthMotherDirectory birthMotherDirectory;

    
    public registerOptions() {
        
    }

    public registerOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.birthMotherDirectory = system.getBirthMotherDirectory();
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

        jPanel1 = new javax.swing.JPanel();
        btnRegMother = new javax.swing.JButton();
        btnRegFamily = new javax.swing.JButton();
        btnOrphanageReg = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btnRegMother.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRegMother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maternity.png"))); // NOI18N
        btnRegMother.setText("MOTHER");
        btnRegMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMotherActionPerformed(evt);
            }
        });

        btnRegFamily.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRegFamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/family.png"))); // NOI18N
        btnRegFamily.setText("FAMILY");
        btnRegFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegFamilyActionPerformed(evt);
            }
        });

        btnOrphanageReg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOrphanageReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baby-3.png"))); // NOI18N
        btnOrphanageReg.setText("ORPHAN");
        btnOrphanageReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrphanageRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrphanageReg, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegMother, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(566, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnRegMother)
                .addGap(18, 18, 18)
                .addComponent(btnRegFamily)
                .addGap(18, 18, 18)
                .addComponent(btnOrphanageReg, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMotherActionPerformed

        registerMother ls = new registerMother(userProcessContainer, system );
        userProcessContainer.add("registerMother", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegMotherActionPerformed

    private void btnRegFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegFamilyActionPerformed
        // TODO add your handling code here:
        registerFamily ls = new registerFamily(userProcessContainer, system);
        userProcessContainer.add("registerFamily", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegFamilyActionPerformed

    private void btnOrphanageRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrphanageRegActionPerformed
        // TODO add your handling code here:
        registerOrphanage ls = new registerOrphanage(userProcessContainer, system );
        userProcessContainer.add("registerOrphanage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrphanageRegActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrphanageReg;
    private javax.swing.JButton btnRegFamily;
    private javax.swing.JButton btnRegMother;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
