/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author jayanthkappagantulaa
 */
public class CounselorToAdmin {
    
    private String requestResult;
     private Parents parent;
     private BirthMother birthMother;
     
     public CounselorToAdmin(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.parent = parent;   
        this.birthMother = new BirthMother();
    }
    
    public CounselorToAdmin(String message, BirthMother BM) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.birthMother = BM;   
        this.parent = new Parents();
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }


    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }

    public CounselorToAdmin(String requestResult) {
        this.requestResult = requestResult;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
     
    @Override
    public String toString() {
        return super.getMessage();
    }
    
}
