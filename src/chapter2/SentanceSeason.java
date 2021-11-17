package chapter2;

import java.util.Scanner;

public class SentanceSeason {
    public static void main(String arg[]) {
        // 1. Get the season of the year
        System.out.println("Entrer the season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2. Get a whole number
        System.out.println("Entrer a whole number");
        String number = scanner.next();

        //3. Get an adjective
        System.out.println("Entrer an adjective");
        String adjective = scanner.next();
        scanner.close();

        //4. Dispaly result
        System.out.print("On a " +adjective +" ");
        System.out.print(season+ " day, I drink a minimum of ");
        System.out.print(number + " cups of coffee");
    }
}
