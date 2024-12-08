/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author jayanthkappagantulaa
 */
public class OrphangeEnterprise {
    
    public OrphangeEnterprise(String name){
        super(name,Enterprise.EnterpriseType.OrphanageEnterprise);
    }
      
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
