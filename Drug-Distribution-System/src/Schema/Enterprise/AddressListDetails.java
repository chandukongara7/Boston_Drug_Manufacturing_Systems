/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class AddressListDetails {
    private ArrayList<Address> addressListDetails;
    ArrayList<Address> showAddress;
    
    public AddressListDetails(){
        addressListDetails = new ArrayList<>();
    }

    public ArrayList<Address> getAddressListDetails() {
        return addressListDetails;
    }

    public void setAddressListDetails(ArrayList<Address> addressListDetails) {
        this.addressListDetails = addressListDetails;
    }

    public ArrayList<Address> getShowAddress() {
        return showAddress;
    }

    public void setShowAddress(ArrayList<Address> showAddress) {
        this.showAddress = showAddress;
    }
    
    public Address AddAddress(){
        Address a = new Address();
        addressListDetails.add(a);
        return a;
    }  
    
    public ArrayList<Address> searchAddress(String zipcode){
        showAddress = new ArrayList<>();
        for(Address a: addressListDetails){
            if(a.getZipcode().equals(zipcode)){
                showAddress.add(a);
                return showAddress;
            }
        }
        return null;
    }
}
