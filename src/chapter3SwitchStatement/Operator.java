package chapter3SwitchStatement;

/*
Relational operator :
  > greater than
  < less than
  >= greater than or equal to
  <= less than or equal to
  == equal to            for string : string1.equals(string2)
  != not equal to        for string : !string1.equals(string2)
Logical operator :
&&  = and  = both conditions must be true
||  = or   = at least one conditions must be true
!   = not  = condition must be false
 */

import java.util.Scanner;

/*
Qualify to a loan :
Person must make 30 000 $ and have been working in this job at least 2 years
 */
public class Operator {

    private static int yearsSalary = 30000;
    private static int yearsWorking = 2;

    public static void main(String arg[]) {
        //Ask for the salary
        System.out.println("Enter your salary : ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        //Ask for years of working
        System.out.println("Enter your years of working in this job : ");
        double years = scanner.nextDouble();
        scanner.close();

        // qualify to loan
        if (salary >= yearsSalary && years >= yearsWorking) {
            System.out.println("You are qualify for a loan");
        }else {
            System.out.println("You are not qualify for a loan");
        }
    }
}
