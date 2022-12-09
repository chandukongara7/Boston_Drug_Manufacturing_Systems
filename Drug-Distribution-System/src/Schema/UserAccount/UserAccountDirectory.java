/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.UserAccount;

import java.util.ArrayList;
import Schema.Employee.Employee;
import Schema.Role.Role;

/**
 *
 * @author chandukongara
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<>();
    } 

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
     for (UserAccount ua : userAccountList) {
         System.out.println("Name: " + ua.getUsername() + " Password: " + ua.getPassword());
        if (ua.getUsername().equals(username) && ua.getPassword ().equals(password)){
             return ua;
        }
     }
     return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
     UserAccount userAccount = new UserAccount();
     userAccount.setUsername(username);
     userAccount.setPassword(password);
     userAccount.setEmployee(employee);
     userAccount.setRole(role);
     userAccountList.add(userAccount);
     return userAccount;
             
    }
    
    public boolean checkIFUsernameIsunique(String username){
     for (UserAccount ua : userAccountList){
         if (ua.getUsername().equals(username))
             return false;
     }
     return true;
    }
}
