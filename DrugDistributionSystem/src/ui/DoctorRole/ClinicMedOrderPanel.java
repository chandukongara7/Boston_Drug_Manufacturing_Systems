/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DoctorRole;

import Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Enterprise.MedicalEquipEnterprise;
import Schema.Network.Network;
import Schema.Organization.DoctorOrganization;
import Schema.Organization.EquipmentHandlingOrganization;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import Schema.WorkQueue.DrugInventoryWorkRequest;
import Schema.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lakshyagupta
 */
public class ClinicMedOrderPanel extends javax.swing.JPanel {
    private JPanel userprocessContainer;
    private UserAccount ua;
    private DoctorOrganization docOrg;
    private Enterprise ent;
    private MedicalEquipEnterprise medEqEnt;
    private Network ntw;
    private EcoSystem system;
    private Enterprise.EnterpriseType entType;
    private EquipmentHandlingOrganization eqHandOrg;

    /**
     * Creates new form ClinicMedOrderPanel
     */
public ClinicMedOrderPanel(JPanel userprocessContainer, UserAccount ua,DoctorOrganization docOrg, Enterprise ent, EcoSystem system, Network ntw) {
this.userprocessContainer=userprocessContainer;
this.ua = ua;
this.docOrg = docOrg;
this.ent=ent;
this.ntw=ntw;
this.system=system;
initComponents();
populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MedEquipLbl = new javax.swing.JLabel();
        equipnameCmbBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        urgencyLbl = new javax.swing.JLabel();
        equipnameCmbBox1 = new javax.swing.JComboBox();
        qtyLbl = new javax.swing.JLabel();
        qtyTxtFld = new javax.swing.JSpinner();
        backBtn = new javax.swing.JButton();
        sendReqBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        HeaderLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 47, 90));

        MedEquipLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        MedEquipLbl.setForeground(new java.awt.Color(255, 255, 255));
        MedEquipLbl.setText("Medicine");

        equipnameCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Oxygen Cylinder", "Pulse Oxymeter", "Stretcher", "Thermometer", "Stethescope", "Diabetes Machine", "COVID Testing Kits", "Syringes", "Blood pressure Kit", " " }));
        equipnameCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipnameCmbBoxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE", "MESSAGE", "QUANTITY", "SENDER", "RECEIVER", "STATUS", "REQUEST DATE", "ACTUAL PRICE", "LOAN PRICE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        urgencyLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        urgencyLbl.setForeground(new java.awt.Color(255, 255, 255));
        urgencyLbl.setText("Priority:");

        equipnameCmbBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "VERY CRITICAL(<2 HRS)", "MODERATE(<5 HRS)", "LOW PRIORITY(24 HRS)" }));
        equipnameCmbBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipnameCmbBox1ActionPerformed(evt);
            }
        });

        qtyLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        qtyLbl.setForeground(new java.awt.Color(255, 255, 255));
        qtyLbl.setText("Quantity:");

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrowback.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        sendReqBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/order.png"))); // NOI18N
        sendReqBtn.setText("Order");
        sendReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendReqBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refresh.png"))); // NOI18N

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

        HeaderLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        HeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLbl.setText("REQUEST MEDICINE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(HeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedEquipLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(urgencyLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(65, 65, 65)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(equipnameCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipnameCmbBox1, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtyTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendReqBtn)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedEquipLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipnameCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urgencyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipnameCmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendReqBtn))
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void equipnameCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipnameCmbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipnameCmbBoxActionPerformed

    private void equipnameCmbBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipnameCmbBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipnameCmbBox1ActionPerformed

    private void sendReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReqBtnActionPerformed
        DrugInventoryWorkRequest request = new DrugInventoryWorkRequest();
        request.setEquipmentName(equipnameCmbBox.getSelectedItem().toString());
        request.setSender(ua);
        request.setStatus("Sent");
        request.setUrgencyLevel(equipnameCmbBox1.getSelectedItem().toString());
        
        request.setQuantity(Integer.parseInt(qtyTxtFld.getValue().toString()));
        int check = Integer.parseInt(qtyTxtFld.getValue().toString());
        if ((check == 0 || (equipnameCmbBox1.getSelectedItem().toString().equals(" ")) || (equipnameCmbBox.getSelectedItem().toString().equals(" ")))) {
            JOptionPane.showMessageDialog(this, "Please Check your inputs!", "Warning", JOptionPane.ERROR_MESSAGE);
        } 
        else {
        
        
        Date date = new Date();
        int min = 20;
        int max = 40;       
        Random rand = new Random();

        int n1 = rand.nextInt((max - min)) + 1;
        int n2 = rand.nextInt(10) + 1;
        
        request.setActualprice(n1);
        request.setHospitalName(ent.getName());
        
        
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        request.setRequestDate(dateFormat.format(date));
    request.setLoanedprice(n2);
    Organization org = null;
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganization) {
                org = organization;
                System.out.println("****" + org);
                break;
            }
        }
    org.getWorkQueue().getWorkRequestList().add(request);
        ua.getWorkQueue().getWorkRequestList().add(request);
        // equiporg.getWorkQueue().getWorkRequestList().add(request);
        System.out.println("****** " + org.getName());
        System.out.println("******" + ent.getName());
        System.out.println("**** " + ntw.getName());
        for (Network network : system.getNetworkList()) {

            if (ntw.getName().equals(this.ntw.getName())) {
                for (Enterprise ent : ntw.getEnterpriseDirectory().getEnterpriseList()) {
                    System.out.println("****" + ent.getName());
                    System.out.println("******" + ent.getEnterpriseType());
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println("***** Organizatio Name:" + organization.getName());
                        if (organization.getName().equals("Equipment Organization")) {
                            System.out.println("True");
                            System.out.println("***** organization Name" + organization.getName());
                            organization.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }

            }
ua.getWorkQueue().getWorkRequestList().add(request);
populateTable();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_sendReqBtnActionPerformed
}
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userprocessContainer.remove(this);
        CardLayout layout = (CardLayout) userprocessContainer.getLayout();
        layout.previous(userprocessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderLbl;
    private javax.swing.JLabel MedEquipLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox equipnameCmbBox;
    private javax.swing.JComboBox equipnameCmbBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JSpinner qtyTxtFld;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton sendReqBtn;
    private javax.swing.JLabel urgencyLbl;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (WorkRequest request : docOrg.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[9];

            row[0] = ((DrugInventoryWorkRequest) request);
            String urgencyLevel = ((DrugInventoryWorkRequest) request).getUrgencyLevel();
            row[1] = urgencyLevel;
            int quantity = ((DrugInventoryWorkRequest) request).getQuantity();
            row[2] = quantity;
            row[3] = request.getSender();
            row[4] = ((DrugInventoryWorkRequest) request).getReceiver();
            row[5] = request.getStatus();
            
            String expectedArrivalTime = ((DrugInventoryWorkRequest) request).getExpectedArrivalTime();
            
            row[6] = request.getRequestDate();
            row[7] = ((DrugInventoryWorkRequest) request).getActualprice();
            row[8] = ((DrugInventoryWorkRequest) request).getLoanedprice();

            model.addRow(row);
        }
       
    }
}
