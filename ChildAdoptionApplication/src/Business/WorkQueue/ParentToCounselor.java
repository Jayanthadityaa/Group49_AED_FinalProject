/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author jayanthkappagantulaa
 */
public class ParentToCounselor {
    
    private String requestResult;
    private Parents parent;
    private String counsellorFeeback;

    public ParentToCounselor(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.parent = parent;
        this.counsellorFeeback = new String();   
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents p) {
        this.parent = p;
    }

    public String getCounsellorFeeback() {
        return counsellorFeeback;
    }

    public void setCounsellorFeeback(String counsellorFeeback) {
        this.counsellorFeeback = counsellorFeeback;
    }
    
}
