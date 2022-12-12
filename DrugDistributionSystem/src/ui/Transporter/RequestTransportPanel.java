/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Transporter;

import com.db4o.cs.internal.messages.Message;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Schema.EcoSystem;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import Schema.WorkQueue.TransportationWorkRequest;  
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.DrugInventoryWarehouse.TransportRequestViewPanel;
import static java.lang.ProcessBuilder.Redirect.to;

/*
 *
 * @author lakshyagupta
 */

public class RequestTransportPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTransportPanel
     */
    JPanel userProcessContainer;
    TransportationWorkRequest request;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;
    
    public RequestTransportPanel(JPanel userProcessContainer,TransportationWorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etdLbl = new javax.swing.JLabel();
        timeCmbBox = new javax.swing.JComboBox<>();
        timezoneCmbBox = new javax.swing.JComboBox<>();
        vehiclenumLbl = new javax.swing.JLabel();
        txtVehicleNum = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        notifythroughmailBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        trpaLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 47, 90));

        etdLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etdLbl.setForeground(new java.awt.Color(255, 255, 255));
        etdLbl.setText("Expected Time Of Delivery :");

        timeCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00" }));
        timeCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeCmbBoxActionPerformed(evt);
            }
        });

        timezoneCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        vehiclenumLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vehiclenumLbl.setForeground(new java.awt.Color(255, 255, 255));
        vehiclenumLbl.setText("Vehicle Number:");

        txtVehicleNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleNumActionPerformed(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrowback.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        notifythroughmailBtn.setText("Intimate Hospital through Mail");
        notifythroughmailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifythroughmailBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1225, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        trpaLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        trpaLbl.setText("Transport Request Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(trpaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(trpaLbl)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehiclenumLbl)
                    .addComponent(etdLbl)
                    .addComponent(backBtn))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(timezoneCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtVehicleNum, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notifythroughmailBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVehicleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehiclenumLbl))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etdLbl)
                    .addComponent(timeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timezoneCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(notifythroughmailBtn))
                .addGap(288, 288, 288))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void timeCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeCmbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeCmbBoxActionPerformed
public void sendMailToCommunityMember(String to[], String subject, String message, String from, String password)
{
    String [] host = {"smtp@gmail.com"};
    Properties props = System.getProperties();
    props.put("mail.smtp.user", from);
    props.put("mail.smtp.port", 587);
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    JOptionPane.showMessageDialog(this, "New notification from Transport Department");        
}

    private void txtVehicleNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleNumActionPerformed

    private void notifythroughmailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifythroughmailBtnActionPerformed
        if(txtVehicleNum.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Vehicle Num" , "Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{            
        request.setTime(timeCmbBox.getSelectedItem().toString() +" "+ timezoneCmbBox.getSelectedItem().toString()+" "+"VehicleNumber" +txtVehicleNum.getText());
        String[] to = {"ckongarac@gmail.com"};
        sendMailToCommunityMember(to,
                "Alert from Transportation department",
                "The delivery details are for the equipment "+request.getEquipmentinfo()+" are" +request.getTime(),
                "infotestmail71@gmail.com",
                "edjklevvwfgdfxoa");
        JOptionPane.showMessageDialog(null,"Email sent successfully");
        }
    }//GEN-LAST:event_notifythroughmailBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransportJobPanel twjp = (TransportJobPanel) component;
        twjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel etdLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton notifythroughmailBtn;
    private javax.swing.JComboBox<String> timeCmbBox;
    private javax.swing.JComboBox<String> timezoneCmbBox;
    private javax.swing.JLabel trpaLbl;
    private javax.swing.JTextField txtVehicleNum;
    private javax.swing.JLabel vehiclenumLbl;
    // End of variables declaration//GEN-END:variables
}
