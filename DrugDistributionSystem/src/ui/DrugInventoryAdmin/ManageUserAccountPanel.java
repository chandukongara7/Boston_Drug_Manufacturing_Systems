/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DrugInventoryAdmin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.HospitalAdminRole.*;
import Schema.Employee.Employee;
import Schema.Enterprise.Enterprise;
import Schema.Organization.Organization;
import Schema.Role.Role;
import Schema.UserAccount.UserAccount;

/**
 *
 * @author lakshyagupta
 */
public class ManageUserAccountPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPane
     * 
     */
    private JPanel container;
    private Enterprise enterprise;
    
    public ManageUserAccountPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        
        popOrganizationComboBox();
        popData();
        
    }
    public void popOrganizationComboBox(){
        orgCmbBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            orgCmbBox.addItem(organization);
        }
    }
    public void  populateEmployeeComboBox(Organization organization){
        empCmbBox.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            empCmbBox.addItem(employee);
        }
    }
    private void populateRoleComboBox(Organization org){
        roleCmbBox.removeAllItems();
        for (Role role : org.getSupportedRole()){
            roleCmbBox.addItem(role);
        
    }
}
    public void popData(){
        DefaultTableModel model = (DefaultTableModel) userTbl.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()){
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel)userTbl.getModel()).addRow(row);
                
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userTbl = new javax.swing.JTable();
        orgLbl = new javax.swing.JLabel();
        orgCmbBox = new javax.swing.JComboBox();
        empLbl = new javax.swing.JLabel();
        empCmbBox = new javax.swing.JComboBox();
        roleLbl = new javax.swing.JLabel();
        roleCmbBox = new javax.swing.JComboBox();
        usernameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        createuserBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 47, 90));

        userTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTbl);
        if (userTbl.getColumnModel().getColumnCount() > 0) {
            userTbl.getColumnModel().getColumn(0).setResizable(false);
            userTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        orgLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        orgLbl.setForeground(new java.awt.Color(255, 255, 255));
        orgLbl.setText("Organization  :");

        orgCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgCmbBoxActionPerformed(evt);
            }
        });

        empLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        empLbl.setForeground(new java.awt.Color(255, 255, 255));
        empLbl.setText("Employee      :");

        empCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        roleLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roleLbl.setForeground(new java.awt.Color(255, 255, 255));
        roleLbl.setText("Role             :");

        roleCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        usernameLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(255, 255, 255));
        usernameLbl.setText("Username    :");

        passwordLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setText("Password      :");

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createuserBtn.setText("Create");
        createuserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createuserBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        headerLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        headerLbl.setText("Manage User Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(headerLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headerLbl)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roleLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roleCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empLbl)
                            .addComponent(orgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLbl)
                            .addComponent(passwordLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTxt)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(createuserBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLbl)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLbl)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orgLbl)
                            .addComponent(orgCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empLbl)
                            .addComponent(empCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roleLbl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(roleCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(createuserBtn)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createuserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createuserBtnActionPerformed
        String userName = nameTxt.getText();
        String password = passwordTxt.getText();
                Organization organization = (Organization) orgCmbBox.getSelectedItem();
                Employee employee = (Employee) empCmbBox.getSelectedItem();
                Role role = (Role) roleCmbBox.getSelectedItem();
                
                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                popData();
                
    }//GEN-LAST:event_createuserBtnActionPerformed

    private void orgCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgCmbBoxActionPerformed
        Organization organization = (Organization) orgCmbBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_orgCmbBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createuserBtn;
    private javax.swing.JComboBox empCmbBox;
    private javax.swing.JLabel empLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox orgCmbBox;
    private javax.swing.JLabel orgLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JComboBox roleCmbBox;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JTable userTbl;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
