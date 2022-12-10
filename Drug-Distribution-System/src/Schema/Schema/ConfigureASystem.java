/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Schema;

import Schema.Employee.Employee;
import Schema.Role.SysAdminRole;
import Schema.UserAccount.UserAccount;

/**
 *
 * @author chandukongara
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("YGS");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("neu","neu",employee,new SysAdminRole());
        return system;
    }
    
}
