/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DrugInventoryAdmin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Schema.Enterprise.Enterprise;
import ui.HospitalAdminRole.*;



/**
 *
 * @author 16176
 */
public class AdminLandingPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    

    /**
     * Creates new form AdminLandingPanel
     */
    public AdminLandingPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLbl.setText(enterprise.getName());
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
        enterpriseLbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        manageOrgBtn = new javax.swing.JButton();
        manageemployeeBtn = new javax.swing.JButton();
        manageuserBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        enterpriseLbl.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLbl.setText("Enterprise : ");
        jPanel1.add(enterpriseLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        valueLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        valueLbl.setForeground(new java.awt.Color(255, 255, 255));
        valueLbl.setText("<Value>");
        jPanel1.add(valueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        manageOrgBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageOrgBtn.setText("Manage Organization");
        manageOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgBtnActionPerformed(evt);
            }
        });
        jPanel1.add(manageOrgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 230, 40));

        manageemployeeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageemployeeBtn.setText("Manage Employee");
        jPanel1.add(manageemployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 230, 40));

        manageuserBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageuserBtn.setText("Manage User");
        jPanel1.add(manageuserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 230, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        headerLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        headerLbl.setText("Drug Inventory Admin ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgBtnActionPerformed
       ManageOrganisationPanel manageOrgJPanel = new ManageOrganisationPanel(userProcessContainer, enterprise.getOrganizationDirectory());
       userProcessContainer.add("manageOrgJPanel", manageOrgJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrgBtnActionPerformed
 
    private void manageemployeeBtnActionPerformed(java.awt.event.ActionEvent evt){
        ManageEmployeePanel manageemployeeJPanel = new ManageEmployeePanel(userProcessContainer, enterprise.getOrganizationDirectory());
         userProcessContainer.add("manageemployeeJPanel",manageemployeeJPanel );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }
    
    private void manageuserBtnActionPerformed(java.awt.event.ActionEvent evt) {
        ManageUserAccountPanel muajp = new ManageUserAccountPanel(userProcessContainer, enterprise);
         userProcessContainer.add("ManageUserAccountPanel",muajp );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageOrgBtn;
    private javax.swing.JButton manageemployeeBtn;
    private javax.swing.JButton manageuserBtn;
    private javax.swing.JLabel valueLbl;
    // End of variables declaration//GEN-END:variables
}