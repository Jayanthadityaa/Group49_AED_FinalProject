/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author jayanthkappagantulaa
 */
public class BirthMotherToInsuranceManager {
    
    private BirthMother birthMother;
    private UserAccount userAccount;
    private Insurance insurance;
    private InsuranceAccountDirectory insuranceDir;

    public BirthMotherToInsuranceManager(BirthMother birthMother, UserAccount userAccount, Insurance insurance, InsuranceAccountDirectory insur) {
        super();
        this.birthMother = birthMother;
        this.userAccount = userAccount;
        this.insurance = insurance;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return birthMother.getFirstName();
    }
    
}
