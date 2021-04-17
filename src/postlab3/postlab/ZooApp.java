/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package postlab3.postlab;
import java.io.*;
import java.util.*;
/**
 *
 * @author AFIQ ZULKIFFLE
 */
public class ZooApp {
    
    public static void main (String[] args){
        
        int size=2;

        ZooTaiping[] array=new ZooTaiping[size];
        
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        
        for(int i=0;i<size;i++){
            
            String name,icNum,category,choice;
            boolean govServ,packA,packB,packC;
            
            System.out.println("[Customer "+(i+1)+"]");
            System.out.println("What is your name ?");
            name=scan1.nextLine();
            
            System.out.println("What is your identification numbers ?");
            icNum=scan1.nextLine();
            
            System.out.println("Are you a government servant ? [yes/no]");
            choice=scan1.nextLine();
            
            if(choice.equals("yes"))
                govServ=true;
            else
                govServ=false;
            
            System.out.println("Do you want Day Visit or Night Visit ?[day/night]");
            choice=scan1.nextLine();
            
            System.out.println();
            
            if (choice.equals("day")){
                System.out.println("==== Day Visit ====");
                System.out.println("Are you in adult category or child category ?[adult/child]");
                category=scan1.nextLine();
                
                array[i]= new DayVisit(category,name,icNum,govServ); 
            }
                
            else if (choice.equals("night")){
                System.out.println("==== Night Visit ====");
                
                System.out.println("[Package A] :RM 50");
                System.out.println("[Package B] :RM 75");
                System.out.println("[Package C] :RM 100");
                System.out.println("Please Choose a Package [packA/packB/packC]:");
                choice=scan1.nextLine();
                
                packA=false;packB=false;packC=false;
                
                if(choice.equals("packA"))
                    packA=true;
                else if(choice.equals("packB"))
                    packB=true;         
                else if(choice.equals("packC"))
                    packC=true;
                            
                array[i]= new NightVisit(packA,packB,packC,name,icNum,govServ);
            }
  
        }//end loop
        
        //count&calculation
        int countDay=0;
        int countNight=0;
        double totIncome=0.0;
                
        for(int i=0;i<size;i++){
            
            if(array[i] instanceof DayVisit)
                countDay++;
            else if(array[i] instanceof NightVisit)
                countNight++;
            
            totIncome+=array[i].totalCharges();//   
        }
        //output
        System.out.println("Total Income Zoo Taiping : RM "+totIncome);
        System.out.println("Number of Visitors by Visit:");
        System.out.println("Day Visit :"+countDay +" , Night Visit:"+countNight);
        //package C details
        
        System.out.println("== Package C Details ==");
        for(int i=0;i<countNight;i++){
            if(array[i] instanceof NightVisit)
                System.out.println("["+(i+1)+"] "+array[i].toString());
        }
        
    }
}
