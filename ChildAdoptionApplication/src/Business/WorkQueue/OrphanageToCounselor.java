/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author jayanthkappagantulaa
 */
public class OrphanageToCounselor {
    
    private String requestResult;
    private Orphanage orphanage;
    private String counsellorFeeback;
    private Counsellor counsellor;

    public OrphanageToCounselor() {
        super();
    }

    public OrphanageToCounselor(Orphanage orphanage) {
        super();
        this.requestResult = new String();
        this.orphanage = orphanage;
        this.counsellorFeeback = new String();
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Orphanage getOrphanage() {
        return orphanage;
    }

    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }

    public String getCounsellorFeeback() {
        return counsellorFeeback;
    }

    public void setCounsellorFeeback(String counsellorFeeback) {
        this.counsellorFeeback = counsellorFeeback;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }
    
     public void selectCounsellor(){
        
      //TODO: Function to allot the Counsellor to BirthMother  
    }
    
}
