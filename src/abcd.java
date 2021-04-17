import java.io.*;
import java.util.*;
/*
Strings containing an even number of one
   a b c d
----------------
A  B B C C
B  B B C C
C* B B C C
----------------
*/
public class abcd
{
 final static int STATES=3,INPUTS=4;
 
 public static void main (String[] args) throws IOException
 { 
 
    boolean [] accept = new boolean [STATES];
    int [][] fsm = new int[STATES][INPUTS]; // state table
    accept[0]=false;
    accept[1]=false;
    accept[2]=true;
    
    fsm[0][0]=1; 
    fsm[0][1]=1;
    fsm[0][2]=2; 
    fsm[0][3]=2;
    fsm[1][0]=1; 
    fsm[1][1]=1;
    fsm[1][2]=2; 
    fsm[1][3]=2;
    fsm[1][0]=1;
    fsm[2][1]=1;
    fsm[2][2]=2; 
    fsm[2][3]=2;
    
        // State A=0, State B = 1
     int inp = 0; // input symbol (0..INPUTS)
     int state = 0; // starting state;
     try
     { 
        inp = System.in.read() - 'a'; //^ character input,
        
        // convert to int.
        while (inp>=0 && inp<INPUTS)
        {
        state = fsm[state][inp]; // next state
        inp = System.in.read() - 'a'; // get next input
        }
     } 
     catch (IOException ioe)
     { 
        System.out.println ("IO error " + ioe); 
     }
     
     if (accept[state]) 
        System.out.println ("Accepted");
     else
        System.out.println ("Rejected");
    }
}