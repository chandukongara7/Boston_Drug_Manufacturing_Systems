/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Enterprise;

import Schema.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class LogisticsEnterprise extends Enterprise {
    
    public LogisticsEnterprise(String name){
        super (name, Enterprise.EnterpriseType.Logistics);
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;

    }
    
}
