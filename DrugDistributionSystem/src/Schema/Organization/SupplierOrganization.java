/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Organization;

import Schema.Role.Role;
import Schema.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author junaidpatel
 */
public class SupplierOrganization extends Organization{
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
