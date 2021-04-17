/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
import java.io.*;
/**
 *
 * @author apitz
 */
public class Room extends Patient{
    
    public String typeRoom; // type of room
    public int noDay; // no of day

    public Room() {
        super();
        this.typeRoom = null;
        this.noDay = 0;
    }
    
    public Room(String patientName, int patientNumber, String patientAddress,String typeRoom, int noDay) {
        super(patientName, patientNumber, patientAddress);
        this.typeRoom = typeRoom;
        this.noDay = noDay;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getNoDay() {
        return noDay;
    }

    public void setNoDay(int noDay) {
        this.noDay = noDay;
    }

    @Override
    public String toString() {
        super.toString();
        return "Room{" + "typeRoom=" + typeRoom + ", noDay=" + noDay + '}';
    }
    
    public double calcPayment(){
        
        double payment=0;
        
        if(getTypeRoom().equals("Diamond"))
                payment=200;
        else if(getTypeRoom().equals("Gold"))
                payment=100;
        else if(getTypeRoom().equals("Silver"))
                payment=80;
        else if(getTypeRoom().equals("Bronze"))
                payment=50;
        else
            payment=0;
        
        if(getNoDay()>=20)
            
            payment=payment*0.75;
        
            
        return payment;
    }
    
}
