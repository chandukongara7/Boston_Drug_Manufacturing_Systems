/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Role;

import Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.HealthcareEquipmentWareHouse.HealthcareEquipmentWorkAreaJPanel;

/**
 *
 * @author chandukongara
 */
public class MedicalEquipmentRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new HealthcareEquipmentWorkAreaJPanel(userProcessContainer, business, account,  organization,network);
    }
    
    @Override
    public String toString() {
        return "Medical Equipment Role";
    }
    
}
