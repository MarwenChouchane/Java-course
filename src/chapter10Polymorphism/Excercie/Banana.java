package chapter10Polymorphism.Excercie;

public class Banana extends Fruits{
    public Banana(){
        setCalories(50);
    }

    public static void peel(){
        System.out.println("The banana is peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }
}
