/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Role;

import Schema.Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.Organization.PharmacyOrganization;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.PharmacyRole.PharmaLandingPanel;

/**
 *
 * @author chandukongara
 */
public class PharmacistRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new PharmaLandingPanel(userProcessContainer, account, enterprise, (PharmacyOrganization)organization,network);
    //return new PharmaManagementJPanel();
    }
    
    @Override
    public String toString() {
        return "Pharmacist Role";
    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Object business, Network network) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
