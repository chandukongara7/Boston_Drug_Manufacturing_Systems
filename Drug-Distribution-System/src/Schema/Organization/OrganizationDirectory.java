/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Organization;

import Schema.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory () {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(OrganizationType type){
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.Doctor.getValue())){
        organization = new DoctorOrganization();
        organizationList.add(organization);
        }

        else if (type.getValue().equals(OrganizationType.Pharmacy.getValue())){
        organization=new PharmacyOrganization();
        organizationList.add(organization);
        }

        else if (type.getValue().equals(OrganizationType.Supplier.getValue())){
        organization=new SupplierOrganization();
        organizationList.add(organization);
        }

        else if (type.getValue().equals(OrganizationType.MedicalEquipment.getValue())){
        organization=new DrugHandlingOrganization();
        organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.Transport.getValue())){
        organization=new TransportOrganization();
        organizationList.add(organization);
        }
        return organization;
    }
}
