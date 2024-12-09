/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author jayanthkappagantulaa
 */
public class HospitalAdminToBank {
    
    
     private String requestResult;
     private BirthMother birthMother;
    
     public HospitalAdminToBank(String message, BirthMother BM) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.birthMother = BM;   
        
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }

    public HospitalAdminToBank(String requestResult) {
        this.requestResult = requestResult;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
    
}
