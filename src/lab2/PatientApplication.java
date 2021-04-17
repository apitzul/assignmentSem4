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
public class PatientApplication {
    
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        
        //System.out.println("Enter size : ");
        //int size=scan.nextInt();
        int size=50;
        Room[] patient=new Room[size];
        
        for(int i=0;i<size;i++){
            
            System.out.println("["+(i+1)+"]");
            System.out.println("Name : ");
            String name=scan1.nextLine(); // patient name
            
            System.out.println("Number: ");
            int number=scan.nextInt(); // patient number
            
            System.out.println("Address : ");
            String address=scan1.nextLine(); // patient address 
            
            System.out.println("TypeOfRoom : ");
            String type=scan1.nextLine(); // type of room
            
            System.out.println("NumofDay : ");
            int noDay=scan.nextInt(); // no of day    
            
            patient[i]=new Room(name,number,address,type,noDay);
            double payment=patient[i].calcPayment();
        
        }
        
        //count patient
        int count=0;
        double average=0.0;
        
        
        
        for(int i=0;i<size;i++){
        
            if(patient[i].getNoDay()>=20)
                count++;
               
           
            average+=patient[i].calcPayment();
        }
        System.out.println("================");
        System.out.println("Number of Patient is More Than 20 days: "+count);
        
        average=average/size;
        System.out.println("Average Payment : RM "+average);
    }
}
