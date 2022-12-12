/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.PharmaInventory;

import java.util.ArrayList;

/**
 *
 * @author junaidpatel
 */
public class PharmaInventoryList {
    private ArrayList<PharmaInventory> ListOfMedicines;
    
    public PharmaInventoryList(){
        ListOfMedicines = new ArrayList<>();
    }
    public ArrayList<PharmaInventory> getListOfMedicines() {
        return ListOfMedicines;
    }

    public void setListOfMedicines(ArrayList<PharmaInventory> ListOfMedicines) {
        this.ListOfMedicines = ListOfMedicines;
    }
    
    public PharmaInventory addMedicine(){
        PharmaInventory phInv = new PharmaInventory();
        ListOfMedicines.add(phInv);
        return phInv;
    }
    
    public void removeMedicine(PharmaInventory phInv){
        ListOfMedicines.remove(phInv);
    }
}
