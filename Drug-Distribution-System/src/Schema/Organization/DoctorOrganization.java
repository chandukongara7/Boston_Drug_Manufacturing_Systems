/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Organization;

import Schema.Doctor.DoctorPrescription;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Role.DoctorRole;
import Schema.Role.Role;
import Schema.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author chandukongara
 */
public class DoctorOrganization extends Organization {
    
        private ArrayList<DoctorPrescription> plist;
        public DoctorOrganization(){
        super(Organization.OrganizationType.Doctor.getValue());
        plist=new ArrayList<DoctorPrescription>();
        }
        
        @Override 
        public ArrayList<Role> getSupportedRole(){
            ArrayList<Role> roles = new ArrayList<>();
            roles.add(new DoctorRole() {
                
                public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Object business, Network network) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
            return roles;
        }
        
        public ArrayList<DoctorPrescription> getPlist() {
            return plist;
        }
        
        public void setPlist(ArrayList<DoctorPrescription> plist) {
            this.plist = plist;
        }
    
    
        public void addPrescription(DoctorPrescription prescription){
            plist.add(prescription);
        }
        
        
}
