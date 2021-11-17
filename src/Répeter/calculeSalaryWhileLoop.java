package Répeter;

import java.util.Scanner;

/*
Entrer le nombre des heurs de travail par semaine.
Frais d'heure = 15$
Calcule de salaire hebdomadaire.
 */
public class calculeSalaryWhileLoop {

    public static void main(String arg[]) {
        int hourprice = 15;
        int maxhours = 40;
        //Ask for the number of hour
        System.out.println("Enter your hours of work this week : ");
        Scanner scanner = new Scanner(System.in);
        double hours = scanner.nextDouble();

        //Validate input
        while (hours > maxhours || hours < 0){
            System.out.println("Invalid hours!! Your hours must be less than 40h per week " );
            hours = scanner.nextDouble();
        }
        //Calcul of salary
        while (hours <= maxhours){
            double salary = hours * hourprice ;
            System.out.println("Your salary of this week =  " + salary);
            hours = scanner.nextDouble();
        }
    }
}
