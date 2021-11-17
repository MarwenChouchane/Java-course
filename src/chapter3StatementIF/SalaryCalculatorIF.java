package chapter3StatementIF;

import java.util.Scanner;

/*
IF statement
All salespeople get a payment of 1000$ a weak
Salespeople who exceed 10 sales get an additional bonus of 250$.
 */
public class SalaryCalculatorIF {
    private static int bonus;

    public static void main(String arg[]) {
        //Initialize known values
        int salary = 1000;
        int bonus = 250;

        //Get values from the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > 10){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" +salary);
    }
}
