/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postlab3.postlab;

/**
 *
 * @author AFIQ ZULKIFFLE
 */
public class NightVisit extends ZooTaiping{
    private boolean packageA;
    private boolean packageB;
    private boolean packageC;

    public NightVisit(boolean packageA, boolean packageB, boolean packageC, String visitorName, String icNumber, boolean govServant) {
        super(visitorName, icNumber, govServant);
        this.packageA = packageA;
        this.packageB = packageB;
        this.packageC = packageC;
    }

 

    public boolean isPackageA() {
        return packageA;
    }

    public void setPackageA(boolean packageA) {
        this.packageA = packageA;
    }

    public boolean isPackageB() {
        return packageB;
    }

    public void setPackageB(boolean packageB) {
        this.packageB = packageB;
    }

    public boolean isPackageC() {
        return packageC;
    }

    public void setPackageC(boolean packageC) {
        this.packageC = packageC;
    }
    
    public double totalCharges(){
        double total=0.0;
        
        if(this.packageA)
            total+=50.0;
        else if(this.packageB)
            total+=75.0;
        else if(this.packageC)
            total+=100.0;
        else 
            total+=0.0;
        
        if(super.isGovServant())
            total=total*0.85;   

        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "NightVisit{" + "packageA=" + packageA + ", packageB=" + packageB + ", packageC=" + packageC + '}';
    }
    
    
}
