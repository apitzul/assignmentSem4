/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postlab3.postlab;

/**
 *
 * @author apitz
 */
public abstract class ZooTaiping {
    private String visitorName;
    private String icNumber;
    private boolean govServant;

    public ZooTaiping(String visitorName, String icNumber, boolean govServant) {
        this.visitorName = visitorName;
        this.icNumber = icNumber;
        this.govServant = govServant;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public boolean isGovServant() {
        return govServant;
    }

    public void setGovServant(boolean govServant) {
        this.govServant = govServant;
    }
    
    public abstract double totalCharges();

    @Override
    public String toString() {
        return "ZooTaiping{" + "visitorName=" + visitorName + ", icNumber=" + icNumber + ", govServant=" + govServant + '}';
    }
    
}
