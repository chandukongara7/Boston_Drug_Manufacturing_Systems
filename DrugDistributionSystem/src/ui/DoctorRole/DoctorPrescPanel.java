/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DoctorRole;

import Schema.Doctor.DoctorPrescription;
import Schema.Doctor.PrescriptionList;
import Schema.Enterprise.Enterprise;
import Schema.Organization.DoctorOrganization;
import Schema.Organization.Organization;
import Schema.Organization.PharmacyOrganization;
import Schema.UserAccount.UserAccount;
import Schema.WorkQueue.DoctorWorkRequest;
import Schema.WorkQueue.PharmacyWorkRequest;
import Schema.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lakshyagupta
 */
public class DoctorPrescPanel extends javax.swing.JPanel {
    private PrescriptionList presList;
    private DoctorOrganization docOrg;
    private Enterprise ent;
    private UserAccount ua;
    private JPanel upContainer;
    private DoctorPrescription pres;
    private DoctorWorkRequest docreq;

    /**
     * Creates new form DoctorPrescPanel
     */
    public DoctorPrescPanel(JPanel upContainer, PrescriptionList presList, UserAccount ua, Enterprise ent, DoctorOrganization docOrg) {
         initComponents();
        this.upContainer = upContainer;
        this.ua = ua;
        this.ent = ent;
        this.docOrg = docOrg;
       
         populateWorkReqTable();
    }
public void populateWorkReqTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest request : ua.getWorkQueue().getWorkRequestList()) {
            try {
            Object[] row = new Object[4];
            String medication = ((PharmacyWorkRequest) request).getMedicationName();
            System.out.println("****" + medication);
            row[0] = (PharmacyWorkRequest) request;
            int quantity = ((PharmacyWorkRequest) request).getQuantity();
            row[1] = quantity;
            row[2] = request.getReceiver();
            String result = request.getStatus();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            catch (ClassCastException ignored) {}

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

        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        sexLbl = new javax.swing.JLabel();
        sexCmbBox = new javax.swing.JComboBox<>();
        diagnosisLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextField();
        medicationLbl = new javax.swing.JLabel();
        medicationCmbBox = new javax.swing.JComboBox<>();
        timesLbl = new javax.swing.JLabel();
        timesSpin = new javax.swing.JSpinner();
        forLbl = new javax.swing.JLabel();
        forSpin = new javax.swing.JSpinner();
        saveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 47, 90));

        nameLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("Name:");

        ageLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(255, 255, 255));
        ageLbl.setText("Age:");

        sexLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexLbl.setForeground(new java.awt.Color(255, 255, 255));
        sexLbl.setText("Gender:");

        sexCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please select--", "Male", "Female" }));

        diagnosisLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        diagnosisLbl.setForeground(new java.awt.Color(255, 255, 255));
        diagnosisLbl.setText("Diagnosis:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(jTextField1);

        medicationLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        medicationLbl.setForeground(new java.awt.Color(255, 255, 255));
        medicationLbl.setText("Medication:");

        medicationCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please select--", "Paracetomol", "Crocin", "Synthroid", "Crestor", "Ventolin", "Esomeprazole", "Insulin", "Infliximab", "Fluticasone", "Rusovastatin", "Januvia(diabetes)", "Lantus(diabetes)", "Abilify(psychosis, depression)", "Symbicort(asthma)", "Tamiflu(influenza)", "Cialis(erectile dysrunction)", "Viagra(erectile dysrunction)", "Suboxone(opiate addiction)", " " }));

        timesLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        timesLbl.setForeground(new java.awt.Color(255, 255, 255));
        timesLbl.setText("Frequency");

        forLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        forLbl.setForeground(new java.awt.Color(255, 255, 255));
        forLbl.setText("Days:");

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medical Name", "Total Quantity", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrowback.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
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
        headerLbl.setText("Doctor Prescription");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(headerLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(medicationLbl)
                                .addGap(18, 18, 18)
                                .addComponent(medicationCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(backBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diagnosisLbl)
                                    .addComponent(sexLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timesLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timesSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(forLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(forSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveBtn)
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sexCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diagnosisLbl)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicationCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timesSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(backBtn)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        DoctorPrescription p = new DoctorPrescription();

        p.setDiagnosis(jTextField1.getText());

        p.setNameOfMedicine(medicationCmbBox.getSelectedItem().toString());

        p.setNoOfDays((Integer) timesSpin.getValue());

        p.setNoOfDays((Integer) forSpin.getValue());
        p.setNetworkName(ent.getName());
        String age = ageTxt.getText();
        boolean flag = true;
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age should be an integer!");
            flag = false;
        }

        if (p.getDiagnosis().equals("")) {
            JOptionPane.showMessageDialog(null, " Diagnosis cannot be empty!");
            flag = false;
        } else if (nameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Patient name cannot be empty!");
            flag = false;

        }
        if (flag == true) {
            docOrg.addPrescription(p);

            PharmacyWorkRequest request = new PharmacyWorkRequest();

            request.setMedicationName(medicationCmbBox.getSelectedItem().toString());
            request.setQuantity(((Integer) timesSpin.getValue()) * ((Integer) forSpin.getValue()));
            request.setSender(ua);
            request.setStatus("Sent");

            JOptionPane.showMessageDialog(null, "Prescription added successfully");

            System.out.println("****" + ent.getName());
            Organization org = null;

            for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof PharmacyOrganization) {
                    org = organization;
                    System.out.println("****" + org);
                    break;
                }
            }
            if (org != null) {

                org.getWorkQueue().getWorkRequestList().add(request);
                ua.getWorkQueue().getWorkRequestList().add(request);
            }

            populateWorkReqTable();
        }
 // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
upContainer.remove(this);
        CardLayout crd = (CardLayout) upContainer.getLayout();
        crd.previous(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JLabel forLbl;
    private javax.swing.JSpinner forSpin;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> medicationCmbBox;
    private javax.swing.JLabel medicationLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> sexCmbBox;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JLabel timesLbl;
    private javax.swing.JSpinner timesSpin;
    // End of variables declaration//GEN-END:variables
}
