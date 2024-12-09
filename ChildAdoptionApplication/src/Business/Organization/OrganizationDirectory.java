/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import javax.swing.MultiUIDefaults.MultiUIDefaultsEnumerator.Type;

/**
 *
 * @author jayanthkappagantulaa
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Counselor.getValue())){
            organization = new CounselorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BankManager.getValue())){
            organization = new BankManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinanceAdmin.getValue())){
            organization = new FinanceAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsuranceManager.getValue())){
            organization = new InsuranceManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BirthMotherOrg.getValue())){
            organization = new BirthMotherOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ParentsOrg.getValue())){
            organization = new ParentsOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.OrphanageAdmin.getValue())){
        organization = new OrphanAdminOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    public boolean containsType(Type type){
        for (Organization org : organizationList){
            if(org.getName().equals(type.getValue())){
                return true;
            }
        }
        return false;
    }
    
}
