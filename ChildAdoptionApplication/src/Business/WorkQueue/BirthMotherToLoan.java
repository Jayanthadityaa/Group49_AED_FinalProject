/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author jayanthkappagantulaa
 */
public class BirthMotherToLoan {
    
    private BirthMother birthMother;
    private Loan loan;

    public BirthMotherToLoan(String message, Loan loan, BirthMother bm) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.loan = loan;
        this.birthMother =bm;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }
    
    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return super.getSender().getName();
    }
    
}
