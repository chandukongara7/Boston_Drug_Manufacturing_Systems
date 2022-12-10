/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Organization;

import Schema.Role.MedicalEquipmentRole;
import Schema.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class DrugHandlingOrganization extends Organization {
    public DrugHandlingOrganization(){
        super(Organization.OrganizationType.MedicalEquipment.getValue());
    }
        
        @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalEquipmentRole());
        return roles;
    }
        
        
}
