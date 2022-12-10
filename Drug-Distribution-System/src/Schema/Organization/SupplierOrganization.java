/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Organization;

import Schema.Role.Role;
import Schema.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class SupplierOrganization extends Organization {
    public SupplierOrganization(){
        super(Organization.OrganizationType.Supplier.getValue());
    }   
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        return roles;
    }
}
