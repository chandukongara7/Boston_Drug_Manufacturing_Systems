/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Role;

import Schema.EcoSystem;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.Organization.PharmacyOrganization;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PharmacyRole.PharmaLandingPanel;

/**
 *
 * @author chandukongara
 */
public class PharmacistRole extends Role {

@Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
    return new PharmaLandingPanel(userProcessContainer, account, enterprise, (PharmacyOrganization)organization,network);
}

@Override
public String toString() {
    return "Pharmacist Role";
}
}
