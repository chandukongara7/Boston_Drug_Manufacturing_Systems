/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema;

import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.Role.Role;
import Schema.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author junaidpatel
 */

public class EcoSystem extends Organization {
        private static EcoSystem business;
        private ArrayList<Network> networkList;

    public EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SysAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        if (!this.getUserAccountDirectory().checkIFUsernameIsunique(username)) {
            return false;
        }
        return true;
    }
}