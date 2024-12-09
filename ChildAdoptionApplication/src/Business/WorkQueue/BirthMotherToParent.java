/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author jayanthkappagantulaa
 */
public class BirthMotherToParent {
    
    private String requestResult;
    private BirthMother mother;
 
    private Parents parent;
 
    public BirthMotherToParent(BirthMother BM, Parents p) {

        super();
        this.requestResult = new String();
        this.mother = BM;
        this.parent = p;
    }

    public BirthMother getBirthMother() {
        return mother;
    }

    public void setBirthMother(BirthMother m) {
        this.mother = m;
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

    public void setParent(Parents parent) {
        this.parent = parent;
    }
 @Override
    public String toString() {
        return mother.getUsername();
    }
    
}
