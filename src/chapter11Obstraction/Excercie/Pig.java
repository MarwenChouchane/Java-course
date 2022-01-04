package chapter11Obstraction.Excercie;

public class Pig extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Ziew");
    }

    @Override
    public void eat(){
        System.out.println("I eat pig food");
    }
}
