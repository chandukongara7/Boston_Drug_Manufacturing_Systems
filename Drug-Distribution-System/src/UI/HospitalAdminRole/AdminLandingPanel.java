/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAdminRole;

/**
 *
 * @author chandukongara
 */
public class AdminLandingPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLandingPanel
     */
    public AdminLandingPanel() {
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

        btnManageOrganisation = new javax.swing.JButton();
        lblEnterpriseValue = new javax.swing.JLabel();
        lblEnterpriseTitle = new javax.swing.JLabel();
        lblAdminTitle = new javax.swing.JLabel();
        btnManageUser = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();

        btnManageOrganisation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnManageOrganisation.setText("Manage Organisation");
        btnManageOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganisationActionPerformed(evt);
            }
        });

        lblEnterpriseValue.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEnterpriseValue.setText("<Value>");

        lblEnterpriseTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEnterpriseTitle.setText("Enterprise:");

        lblAdminTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblAdminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminTitle.setText("Hospital Administrator");

        btnManageUser.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnManageUser.setText("Manage User");

        btnManageEmployee.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnManageEmployee.setText("Manage Employee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdminTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnterpriseTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEnterpriseValue, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnManageOrganisation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseTitle)
                    .addComponent(lblEnterpriseValue))
                .addGap(28, 28, 28)
                .addComponent(btnManageOrganisation)
                .addGap(40, 40, 40)
                .addComponent(btnManageEmployee)
                .addGap(41, 41, 41)
                .addComponent(btnManageUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageOrganisationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganisation;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JLabel lblAdminTitle;
    private javax.swing.JLabel lblEnterpriseTitle;
    private javax.swing.JLabel lblEnterpriseValue;
    // End of variables declaration//GEN-END:variables
}
