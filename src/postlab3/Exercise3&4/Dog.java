/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postlab3;

/**
 *
 * @author apitz
 */
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    
    public void speak(){
        System.out.print("Woof");
    }
}

