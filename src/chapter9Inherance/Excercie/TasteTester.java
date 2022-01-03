package chapter9Inherance.Excercie;

public class TasteTester {
    public static void main (String[] arg){
        WeedingCake weedingCake = new WeedingCake();
        weedingCake.setTiers(3);
        weedingCake.setPrice(50);
        weedingCake.setFlavor("Pistache");
        System.out.println("Your "+weedingCake.getFlavor()+" cake with "+weedingCake.getTiers()+" tiers cost you: "+weedingCake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(12);
        birthdayCake.setPrice(20);
        System.out.println("Your "+birthdayCake.getFlavor()+" cake with "+birthdayCake.getCandles()+" candle cost you: "+birthdayCake.getPrice());
    }
}
