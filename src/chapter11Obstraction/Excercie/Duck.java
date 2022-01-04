package chapter11Obstraction.Excercie;

public class Duck extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Ducksss");
    }

    @Override
    public void eat(){
        System.out.println("I eat duck food");
    }
}
