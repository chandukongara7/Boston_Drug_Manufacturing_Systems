/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Role;

import Schema.Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.DoctorOrganization;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.doctor.DoctorLandingPanel;

/**
 *
 * @author chandukongara
 */
public abstract class DoctorRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new DoctorLandingPanel(userProcessContainer,account,(DoctorOrganization)organization,enterprise,business,network);
    }
    
    @Override
    public String toString() {
        return "Doctor Role";
    }
}
