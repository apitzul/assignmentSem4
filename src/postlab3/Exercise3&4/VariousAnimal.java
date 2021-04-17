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
public class VariousAnimal {
    public static void main(String[] args){
        Animal ref;
        Dog aDog=new Dog("Lassie"); 
        Cow aCow=new Cow("Mabel");
        Cat aCat=new Cat("Tompok");
        Snake aSnake=new Snake("String");
        
        ref=aCow;
        ref.speak();
        
        ref=aDog;
        ref.speak();
        
        ref=aCat;
        ref.speak();
        
        ref=aSnake;
        ref.speak();
    }
}
