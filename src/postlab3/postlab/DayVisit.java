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
public class DayVisit extends ZooTaiping {
    private String category;

    public DayVisit(String category, String visitorName, String icNumber, boolean govServant) {
        super(visitorName, icNumber, govServant);
        this.category = category;
    }
    
    public double totalCharges(){
        
        double total=0.0;
        int year=Integer.parseInt(super.getIcNumber().substring(0, 1));
        int age=21-year;
        if(age<0){
            age=21+(100-year);
        }
        
        System.out.print("Age is "+age+" years old.");
        
        if(age<13)
            total+=15.0;
        else
            total+=25.0;
        
        
        if(super.isGovServant()){
            total=total*0.85;   
        }
        
        return total;
    }

    @Override
    public String toString() {
        return "DayVisit{" + "category=" + category + '}';
    }
    
    
}
