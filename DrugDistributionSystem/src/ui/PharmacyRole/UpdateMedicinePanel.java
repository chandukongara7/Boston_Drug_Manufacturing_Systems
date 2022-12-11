/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PharmacyRole;

import Schema.Enterprise.Enterprise;
import Schema.Organization.Organization;
import Schema.Organization.PharmacyOrganization;
import Schema.PharmaInventory.PharmaInventory;
import Schema.PharmaInventory.PharmaInventoryList;
import Schema.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 16176
 */
public class UpdateMedicinePanel extends javax.swing.JPanel {
        JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PharmaInventoryList pil;
    private Organization org;
    private PharmacyOrganization pharmorg;
    private PharmaInventory pi;

    /**
     * Creates new form UpdateMedicinePanel
     */
    public UpdateMedicinePanel(JPanel upContainer, UserAccount ua, Enterprise ent, PharmaInventory pi) {
        initComponents();
        this.userProcessContainer=upContainer;
        this.userAccount=ua;
        this.enterprise=ent;
        this.pil= pil;
        this.pharmorg= pharmorg;
        this.pi=pi;
        serialnumTxt.setText(String.valueOf(pi.getSerialNumber()));
        availabilityTxt.setText(String.valueOf(pi.getAvailableQuantity()));
        mednameTxt.setText(pi.getMedicineName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialnumLbl = new javax.swing.JLabel();
        serialnumTxt = new javax.swing.JTextField();
        mednameLbl = new javax.swing.JLabel();
        mednameTxt = new javax.swing.JTextField();
        availabilityLbl = new javax.swing.JLabel();
        availabilityTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 47, 90));

        serialnumLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        serialnumLbl.setText("Serial Number:");

        mednameLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mednameLbl.setText("Medicine Name:");

        availabilityLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        availabilityLbl.setText("Availability:");

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        headerLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        headerLbl.setText("Update Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serialnumLbl)
                                    .addComponent(mednameLbl)
                                    .addComponent(availabilityLbl))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(availabilityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mednameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serialnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(backBtn)
                                .addGap(134, 134, 134)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 437, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialnumLbl)
                    .addComponent(serialnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mednameLbl)
                    .addComponent(mednameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(availabilityLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(availabilityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmaLandingPanel pwjp = (PharmaLandingPanel) component;
        pwjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
pi.setMedicineName(mednameTxt.getText());
       int availableQuantity= Integer.parseInt(availabilityTxt.getText());
        pi.setAvailableQuantity(availableQuantity);
        int serialNumber= Integer.parseInt(serialnumTxt.getText());
        pi.setSerialNumber(serialNumber);
        
        
        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
         if(pi.getAvailableQuantity()<=pi.getReorderLevel()){
            
            
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availabilityLbl;
    private javax.swing.JTextField availabilityTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mednameLbl;
    private javax.swing.JTextField mednameTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel serialnumLbl;
    private javax.swing.JTextField serialnumTxt;
    // End of variables declaration//GEN-END:variables
}