package chapter10Polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("miaoh");
    }

    public void scratch(){
        System.out.println("I am a cat, i scratch things");
    }
}
