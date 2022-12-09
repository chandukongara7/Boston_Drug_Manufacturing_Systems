/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.PharmaInventory;

import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class PharmaInventoryList {
    
    private ArrayList<PharmaInventory> ListOfMedicines;

    public ArrayList<PharmaInventory> getListOfMedicines() {
        return ListOfMedicines;
    }

    public void setListOfMedicines(ArrayList<PharmaInventory> ListOfMedicines) {
        this.ListOfMedicines = ListOfMedicines;
    }
    
    public PharmaInventoryList(){
        ListOfMedicines = new ArrayList<>();
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
