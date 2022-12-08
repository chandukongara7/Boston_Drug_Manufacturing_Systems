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
public class DrugInventoryEnterprise extends Enterprise {
    private WorkQueue equipmentWorkQueue;
    public DrugInventoryEnterprise(String name){
        super(name, Enterprise.EnterpriseType.DrugInventoryWareHouse);
        equipmentWorkQueue=new WorkQueue();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
    public WorkQueue getEquipmentworkqueue(){
        return equipmentWorkQueue;
    }
    public void setEquipmentworkqueue(WorkQueue equipmentworkqueue) {
        this.equipmentWorkQueue = equipmentworkqueue;
    }
}
