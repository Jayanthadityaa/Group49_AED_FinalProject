/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author jayanthkappagantulaa
 */
public class EcoSystem {
    public static EcoSystem system;
    public ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
//        if(system==null){
            system=new EcoSystem();
//        }
    System.out.println("system");
    System.out.println(system);

        return system;
    }
    
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
    
}
