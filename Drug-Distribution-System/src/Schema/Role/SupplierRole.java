/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Role;

import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.Schema.EcoSystem;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Supplier.SupplierJobPanel;

/**
 *
 * @author chandukongara
 */
public class SupplierRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new SupplierJobPanel(userProcessContainer,business,account,organization);
    }
    
    @Override
    public String toString() {
        return "Support Role";
    }
}
