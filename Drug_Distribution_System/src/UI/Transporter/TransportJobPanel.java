/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Transporter;

import Schema.EcoSystem;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import Schema.Organization.TransportOrganization;
import Schema.WorkQueue.WorkRequest;
import Schema.WorkQueue.TransportationWorkRequest;
import Schema.WorkQueue.HealthcareEquipmentWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author 16176
 */
public class TransportJobPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportJobPanel
     */
    JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private EcoSystem system;
    public TransportJobPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system){
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=(TransportOrganization)organization;
        this.system=system;
        populateTable();
        
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workreqTble.getModel();
        model.setRowCount(0);
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = ((TransportationWorkRequest) request);
            row[1] = request.getSender().getEmployee().getEmployeeName();
            row[2] = ((TransportationWorkRequest) request).getEquipmentinfo();
            row[3] = ((TransportationWorkRequest) request). getHospitalName();
            row[4] = ((TransportationWorkRequest) request). getUrgency();
            row[5] = request.getStatus();
            row[6] = request.getRequestDate();
            model.addRow(row);
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

        TransportationworkareaLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workreqTble = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        assignBtn = new javax.swing.JButton();
        processreqBtn = new javax.swing.JButton();

        TransportationworkareaLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TransportationworkareaLbl.setForeground(new java.awt.Color(0, 102, 102));
        TransportationworkareaLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transport.png"))); // NOI18N
        TransportationworkareaLbl.setText("TRNSPORTATION WORK AREA");

        workreqTble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Sender", "Status", "Message", "Haste"
            }
        ));
        jScrollPane1.setViewportView(workreqTble);

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        processreqBtn.setText("Process request");
        processreqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processreqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TransportationworkareaLbl))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn)
                            .addGap(73, 73, 73)
                            .addComponent(assignBtn)
                            .addGap(116, 116, 116)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(processreqBtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TransportationworkareaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(assignBtn)
                    .addComponent(processreqBtn)
                    .addComponent(refreshBtn))
                .addContainerGap(613, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void processreqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processreqBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workreqTble.getSelectedRow();
        if (selectedRow < 0){JOptionPane.showMessageDialog(null, "Please select a row!");
    }//GEN-LAST:event_processreqBtnActionPerformed
TransportationWorkRequest request = (TransportationWorkRequest)workreqTble.getValueAt(selectedRow, 0);
request.setStatus("Processing");
CardLayout layout = (CardLayout) userProcessContainer.getLayout();
userProcessContainer.add("ProcessRequest", new UI.Transporter.RequestTransportPanel(userProcessContainer,request));
layout.next(userProcessContainer);
    }
    
    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int selectedRow = workreqTble.getSelectedRow();
        if (selectedRow < 0){
        return;
        }
        TransportationWorkRequest request = (TransportationWorkRequest)workreqTble.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Assigned");
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TransportationworkareaLbl;
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processreqBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable workreqTble;
    // End of variables declaration//GEN-END:variables
}