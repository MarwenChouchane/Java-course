package chapter3StatementIF;

import java.util.Scanner;

/*IF statement (with two conditions)
Condition 1 : Salary >= 30000
Condition 2 : Yearsworking >= 2
Result : Qualify for Loan
 */
public class IFWith2ConditionsOneResult {
    private static int yearsSalary = 30000;
    private static int yearsWorking = 2;

    public static void main(String arg[]) {

        //Get values from the unknown
        System.out.println("How much do you make?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("From when have you been working at their current job?");
        double working = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= yearsSalary){
            if(working >= yearsWorking) {
                System.out.println("You are qualify for a loan");
            }else{
                System.out.println("Your years at working in this job are < "+yearsWorking);
            }
        }else {
            System.out.println("Your salary is < "+yearsSalary);
        }
    }
}
