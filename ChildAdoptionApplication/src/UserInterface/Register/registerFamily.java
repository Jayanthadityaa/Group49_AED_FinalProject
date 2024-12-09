/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Register;

/**
 *
 * @author Koundi
 */
public class registerFamily extends javax.swing.JPanel {

    EcoSystem system;
    JPanel userProcessContainer;
    private String username;
    private static int count = 0;
    private String email;
    private String password;
    private boolean worstCaseScenerio;
    private boolean finChild;
    private boolean bigChanges;
    private boolean comSituation;
    private boolean currChildrenOnBoard;
    private boolean eduRealities;
    private boolean promises;
    private boolean guilt;
    private ParentsDirectory parentDirectory;
    private ParentToCounselor parentToCounselor;
    private Enterprise enterprise;
    private Organization organization;
    
    
    public registerFamily(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        addInputVerifiers();
        populateComboBox();
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
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtConfPassword = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        isPrepared = new javax.swing.JRadioButton();
        notPrepared = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        isFinance = new javax.swing.JRadioButton();
        notSelectFinance = new javax.swing.JRadioButton();
        isBigChange = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        notBigChange = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        notComfortable = new javax.swing.JRadioButton();
        isComfortable = new javax.swing.JRadioButton();
        isChildrenOnBoard = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        notOnBoardChildren = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        isEducated = new javax.swing.JRadioButton();
        notEducated = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        isPromise = new javax.swing.JRadioButton();
        notPromise = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        notGuilty = new javax.swing.JRadioButton();
        isGuilty = new javax.swing.JRadioButton();
        hospitalJComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Username*:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email*:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password*:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Confirm Password*:");

        btnConfirm.setBackground(new java.awt.Color(255, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel5.setText("Are you ready to handle any type of scenario?");

        isPrepared.setText("Yes");

        notPrepared.setText("No");
        notPrepared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notPreparedActionPerformed(evt);
            }
        });

        jLabel6.setText("Are you financially ready for the child?");

        isFinance.setText("Yes");

        notSelectFinance.setText("No");

        isBigChange.setText("Yes");

        jLabel7.setText("Are you ready for big changes?");

        notBigChange.setText("No");

        jLabel8.setText("Is your spouse onboard with the situation?");

        notComfortable.setText("No");

        isComfortable.setText("Yes");

        isChildrenOnBoard.setText("Yes");

        jLabel9.setText("Are your current children onboard with the situation? ");

        notOnBoardChildren.setText("No");

        jLabel10.setText("Do you have knowledge about the adoption process?");

        isEducated.setText("Yes");

        notEducated.setText("No");

        jLabel11.setText("Will you be committed to your promises?");

        isPromise.setText("Yes");

        notPromise.setText("No");

        jLabel12.setText("Are you adopting out of guilt?");

        notGuilty.setText("No");

        isGuilty.setText("Yes");

        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Select Hospital:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(isComfortable)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(notComfortable))
                                        .addComponent(jLabel8)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(isBigChange)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(notBigChange))
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(isFinance)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(notSelectFinance))
                                        .addComponent(jLabel6)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(isPrepared)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(notPrepared))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(isEducated)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(notEducated))
                                .addComponent(jLabel10)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(isGuilty)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(notGuilty))
                                .addComponent(jLabel12)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(isPromise)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(notPromise))
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(isChildrenOnBoard)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(notOnBoardChildren))
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(271, 271, 271)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isPrepared)
                            .addComponent(notPrepared))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isFinance)
                            .addComponent(notSelectFinance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isBigChange)
                            .addComponent(notBigChange))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isComfortable)
                            .addComponent(notComfortable)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isChildrenOnBoard)
                            .addComponent(notOnBoardChildren))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isEducated)
                            .addComponent(notEducated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isPromise)
                            .addComponent(notPromise))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isGuilty)
                            .addComponent(notGuilty))))
                .addGap(26, 26, 26)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateStrings();
        
        InputVerifier passwordValidation = new ValidatePasswords();
        InputVerifier emailValidation = new ValidateEmailTextField();
             txtUsername.setInputVerifier(stringValidation);
   
        txtPassword.setInputVerifier(passwordValidation);
        txtConfPassword.setInputVerifier(passwordValidation);
        txtEmail.setInputVerifier(emailValidation);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        try{

            String username = txtUsername.getText();
            if(username.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Username");
                throw new RuntimeException("Please enter the Username");
            }

            this.email = txtEmail.getText();
            this.password = txtPassword.getText();

            // nikhil 12112021
            if (isPrepared.isSelected() && notPrepared.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  worstcase scenario options");
                throw new RuntimeException("Please select only one of the Availaible options");

            }
            else

            if(isPrepared.isSelected()){
                this.worstCaseScenerio = true;
            }
            else
            this.worstCaseScenerio = false;

            if (isFinance.isSelected() && notSelectFinance.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  financial options ");
                throw new RuntimeException("Please select only one of the  financial options");

            }
            else
            if(isFinance.isSelected()){
                this.finChild = true;
            }
            else
            this.finChild = false;

            if (isBigChange.isSelected() && notBigChange.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  Big Change options ");
                throw new RuntimeException("Please select only one of the  financial options");

            }
            else
            if(isBigChange.isSelected()){
                this.bigChanges = true;
            }
            else
            this.bigChanges = false;

            if (isComfortable.isSelected() && notComfortable.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  Comfortable options ");
                throw new RuntimeException("Please select only one of the  Comfortable options");
            }
            else
            if(isComfortable.isSelected()){
                this.comSituation = true;
            }
            else
            this.comSituation = false;

            if (isChildrenOnBoard.isSelected() && notOnBoardChildren.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  Board options ");
                throw new RuntimeException("Please select only one of the  Board options");
            }
            else

            if(isChildrenOnBoard.isSelected()){
                this.currChildrenOnBoard = true;
            }
            else
            this.currChildrenOnBoard = false;

            if (isEducated.isSelected() && notEducated.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  Eduucation  options ");
                throw new RuntimeException("Please select only one of the  Eduucation options");
            }
            else

            if(isEducated.isSelected()){
                this.eduRealities = true;
            }
            else
            this.eduRealities = false;

            if (isPromise.isSelected() && notPromise.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  Promise  options ");
                throw new RuntimeException("Please select only one of the  Promise options");
            }
            else

            if(isPromise.isSelected()){
                this.promises = true;
            }
            else
            this.promises = false;
            if (notGuilty.isSelected() && isGuilty.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select only one of the  Guilty  options ");
                throw new RuntimeException("Please select only one of the  Guilty options");
            }
            else

            if(isGuilty.isSelected()){
                this.guilt = true;
            }
            else
            this.guilt = false;

            HospitalEnterprise hospital = (HospitalEnterprise) hospitalJComboBox.getSelectedItem();

            if (hospital == null){
                JOptionPane.showMessageDialog(null, "Please select the Hospital");
                throw new RuntimeException("Please enter the Hospital");
            }
            if ( txtUsername == null){
                JOptionPane.showMessageDialog(null, "Please enter Username");
                throw new RuntimeException("Please enter username");
            }

            for (Network n : system.getNetworkList()){
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                        for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
                            if(ua.getUsername().equals(username)){
                                JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                                for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList()){
                                    if(ua1.getUsername().equals(username)){
                                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                                        return;
                                    }
                                }
                            }

                        }
                    }
                }
            }

            Parents parent = new Parents(username, email, password,worstCaseScenerio,
                finChild, bigChanges, comSituation, currChildrenOnBoard, eduRealities, promises, guilt );
            hospital.getParentDirectory().addParents(parent);
            parentToCounselor = new ParentToCounselor("Please review the parent profile", parent);
            hospital.getWorkQueue().getParentToCounselor().add(parentToCounselor);

            String message =  " <h1>Welcome To Child Adoption Center</h1> <body>  <br>Your Registration is successful! </br> <br>Your Profile ID is " + parent.getParentId()
            + "and your Userid: "+parent.getUsername()+"</br> <br> Kindly wait for your Counselor to review your details!</br> </body> <h2> Thank you! </h2>";

            EmailFormat em = new EmailFormat(this.email,message, "Registration Successful at Child Adoption Center" );
            em.sendEmail();

            SuccessDialog d = new SuccessDialog("Your Registration was successful! Please Logout!");
            d.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter valid data", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        txtUsername.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfPassword.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();

        isPrepared.setSelected(false);
        notPrepared.setSelected(false);

        isFinance.setSelected(false);
        notSelectFinance.setSelected(false);

        isBigChange.setSelected(false);
        notBigChange.setSelected(false);

        isComfortable.setSelected(false);
        notComfortable.setSelected(false);

        isChildrenOnBoard.setSelected(false);
        notOnBoardChildren.setSelected(false);

        isEducated.setSelected(false);
        notEducated.setSelected(false);

        isPromise.setSelected(false);
        notPromise.setSelected(false);

        isGuilty.setSelected(false);
        notGuilty.setSelected(false);

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void notPreparedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notPreparedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notPreparedActionPerformed
private void populateComboBox() {
        //hospitalJComboBox.removeAllItems();
        hospitalJComboBox.removeAllItems();
        for(Network n: system.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                    hospitalJComboBox.addItem(e);
                }    
            }
        }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JRadioButton isBigChange;
    private javax.swing.JRadioButton isChildrenOnBoard;
    private javax.swing.JRadioButton isComfortable;
    private javax.swing.JRadioButton isEducated;
    private javax.swing.JRadioButton isFinance;
    private javax.swing.JRadioButton isGuilty;
    private javax.swing.JRadioButton isPrepared;
    private javax.swing.JRadioButton isPromise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton notBigChange;
    private javax.swing.JRadioButton notComfortable;
    private javax.swing.JRadioButton notEducated;
    private javax.swing.JRadioButton notGuilty;
    private javax.swing.JRadioButton notOnBoardChildren;
    private javax.swing.JRadioButton notPrepared;
    private javax.swing.JRadioButton notPromise;
    private javax.swing.JRadioButton notSelectFinance;
    private javax.swing.JTextField txtConfPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}