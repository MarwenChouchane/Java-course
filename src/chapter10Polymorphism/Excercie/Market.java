package chapter10Polymorphism.Excercie;

public class Market {
    public static void main (String [] arg){
        Fruits juice = new Apple();
        juice.makeJuice();
        ((Apple)juice).removeSeed();
        System.out.println("Your juice has "+((Apple)juice).getCalories()+" Calories");

        juice = new Banana();
        juice.makeJuice();
        ((Banana)juice).peel();
        System.out.println("Your juice has "+((Banana)juice).getCalories()+" Calories");

        Fruits orange = new Fruits();
        squeez(juice);
        squeez(orange);
    }

    public static void squeez(Fruits fruits){
        System.out.println("Squeezing....");
        fruits.makeJuice();
    }
}
