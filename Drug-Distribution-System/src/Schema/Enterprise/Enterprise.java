/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Enterprise;

import Schema.Organization.Organization;
import Schema.Organization.OrganizationDirectory;

/**
 *
 * @author chandukongara
 */
    public abstract class Enterprise extends Organization {
        private EnterpriseType enterpriseType;
        private OrganizationDirectory organizationDirectory;
        private String zipcode;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        Supplier("Supplier"),
        Logistics("Logistics"),
        DrugInventoryWareHouse("DrugInventoryWareHouse");

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        private EnterpriseType(String value) {
        this.value = value;
        }

        @Override
        public String toString() {
        return value;
        }
    }
    
    public EnterpriseType getEnterpriseType() {
    return enterpriseType;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
    return organizationDirectory;
    }
    
    public String getZipcode() {
    return zipcode;
    }

    public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
    }
    
    
}
