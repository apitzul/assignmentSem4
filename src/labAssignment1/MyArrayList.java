/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labAssignment1;

/**
 * 
Name : Muhammad Afiq Bin Zulkiffle
Sid# : 2019423132
Course: CSC508
Group#: Your group (CS2304A/etc.)
Assign#: 1
Due Date: 23 April 2021
Program Description: Implementation of user define MyArrayList
* 
*/
public class MyArrayList
{
        // default initial capacity
        private static final int INITIAL_CAPACITY = 50; 
        private Object[] theData;   // the array to hold the list elements
        private int size = 0;     // the current size
        private int capacity = 0;   // the current capacity

        //Default constructor
        //Creates an array of size 10
        public MyArrayList()
       {
           theData = new Object[INITIAL_CAPACITY];
           capacity = INITIAL_CAPACITY;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        //Return the number of elements in this list 
        public int size() {
            return size;
        }
        
        public void insertAtFront(Object theValue)
        {
            if(size >= capacity)  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {
                 for (int i = size; i > 0; i--)
                    theData[i] =  theData[i-1]; // move elements down
                 
                    theData[0] = theValue;  //insert the item at front
                    size++; //increment the size
              }

        } //end add
        
        
        public void insertAtBack(Object theValue)
        {
            if(size >= capacity)  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {
                    int i = size;
                    theData[i+1] = theValue;  //insert the item at back
                    size++; //increment the size
              }

        } //end add the back
        
        public void insertAtIndex(Object theValue,int index)
        {
            if(size >= capacity)  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {  
                 for (int i = size; i > index; i--)
                    
                     theData[i] =  theData[i-1]; // move elements down

                    theData[index] = theValue;  //insert the item at index
                    size++; //increment the size
              }

        } //end add
        
        
        
        public void removeFromFront(Object theValue)
        {
            if(size >= capacity)  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {
                 for (int i = 0; i < size-1; i++)
                    theData[i] =  theData[i+1]; // move elements down
                 

                 theData[size-1] = null;  //remove item at front
                    size--; //increment the size
              }
            

        } //end add
        
        
        public void removeFromBack(Object theValue)
        {
            if(size >= capacity)  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {
                    theData[size-1] = null;  //remove item at back
                    size--; //increment the size
              }
            

        } //end add
        
        
        public Object get(int index)
        {
            if(index < 0 || index >= size)
                throw new ArrayIndexOutOfBoundsException(index);
            else
            {
                return theData[index];
            }
        } //end get
        
        // display the elements of the list
        public void display()
        {
            for ( int i = 0; i < size; i++)
            {
                System.out.println(theData[i]);
                System.out.println();
            }
        } 
        
        
        
        
}

