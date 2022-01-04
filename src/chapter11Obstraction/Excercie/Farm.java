package chapter11Obstraction.Excercie;

import chapter10Polymorphism.Cat;
import chapter10Polymorphism.Dog;

public class Farm {

    public static void main (String[] arg){
        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();

        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();

    }
}
