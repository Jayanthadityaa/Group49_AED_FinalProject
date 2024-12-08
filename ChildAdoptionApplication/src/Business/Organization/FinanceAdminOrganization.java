/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author jayanthkappagantulaa
 */
public class FinanceAdminOrganization extends Organization{

    public FinanceAdminOrganization() {
        super(Organization.Type.FinanceAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceAdminRole());
        return roles;
    }
     
}