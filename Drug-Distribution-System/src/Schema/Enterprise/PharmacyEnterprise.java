/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Enterprise;

import Schema.Role.Role;
import Schema.WorkQueue.WorkQueue;
import Schema.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class PharmacyEnterprise extends Enterprise {
    
    private WorkQueue equipmentWorkQueue;
    
    public PharmacyEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Pharmacy);
        equipmentWorkQueue=new WorkQueue();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
    
}
