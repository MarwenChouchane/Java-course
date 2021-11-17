package chapter3SwitchStatement;

import java.util.Scanner;

/*
Total monnaies = 10 dt
Enter franc
Enter dinar
 */
public class ExcerciceDecision {

    public static void main(String arg[]) {
        //Ask for the franc
        System.out.println("Enter your total of franc : ");
        Scanner scanner = new Scanner(System.in);
        double franc = scanner.nextDouble();

        //Ask for the dinar
        System.out.println("Enter your total of dinar : ");
        double dinar = scanner.nextDouble();
        scanner.close();

        //Total of monnaie
        int totalrequired = 10 ;
        double totaldinar = franc + dinar ;
        if (totaldinar == totalrequired){
            System.out.println("You win !! ");
        }else if (totaldinar > totalrequired){
            double totalover = totaldinar - totalrequired;
            System.out.println("You went over by " + totalover);
        }else if (totaldinar < totalrequired) {
            double totalunder = totalrequired - totaldinar;
            System.out.println("You went under by " + totalunder);
        }
    }

}
