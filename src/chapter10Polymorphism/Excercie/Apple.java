package chapter10Polymorphism.Excercie;

public class Apple extends Fruits{
    public Apple(){
        setCalories(80);
    }

    public static void removeSeed(){
        System.out.println("Apple seed are removed");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }
}
