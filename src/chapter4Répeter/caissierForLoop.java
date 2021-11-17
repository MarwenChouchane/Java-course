package chapter4Répeter;

import java.util.Scanner;
/*
Enter the quantity of the article
 */
public class caissierForLoop {
    public static void main(String arg[]) {

        //Ask for the quantity
        System.out.println("Enter the quantity of the article : ");
        Scanner scanner = new Scanner(System.in);
        double quantity = scanner.nextDouble();
        double total =0;
        for (int i=0 ; i < quantity ; i++){
            System.out.println("Enter the price of the article : ");
            double price = scanner.nextDouble();
            total = total + price ;
        }
        scanner.close();
        System.out.println("The total is = " + total);
    }
}
