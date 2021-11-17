package chapter4Répeter;

import java.util.Scanner;

/*
Enter 2 number.
Sum the 2 number.
Repeat.
 */
public class sumNumberDoWhileLoop {
    public static void main(String arg[]) {

        boolean again ;
        do {
            //Ask for two number
            System.out.println("Enter your first number : ");
            Scanner scanner = new Scanner(System.in);
            double number1 = scanner.nextDouble();
            System.out.println("Enter your second number : ");
            double number2 = scanner.nextDouble();

            //Check number positive
            while (number1 < 0 || number2 < 0) {
                System.out.println("The two number must be over the 0 !!");
                System.out.println("Enter your first number : ");
                number1 = scanner.nextDouble();
                System.out.println("Enter your second number : ");
                number2 = scanner.nextDouble();
            }
            //Sum the two number
            double sum = number1 + number2 ;
            System.out.println("The sum of the two number is =  " + sum);

            //Repeat
            System.out.println("If you want to run again type 'True' else tupe 'False' ");
            again = scanner.nextBoolean();
        }while (again);

    }
}
