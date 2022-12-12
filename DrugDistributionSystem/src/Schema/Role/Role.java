/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Role;
import Schema.EcoSystem;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;


/**
 *
 * @author chandukongara
 */
public abstract class Role {
public enum RoleType{
        Admin("Admin"), 
        Doctor("Doctor"),
        Logistics("Logistics"), 
        Pharmacist("Pharmacist");
        
        private String value;
        private RoleType(String value){
            this.value = value;
            }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override 
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea (JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network);
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
