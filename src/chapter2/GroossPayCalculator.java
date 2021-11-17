package chapter2;

import java.time.Clock;
import java.util.Scanner;

public class GroossPayCalculator {
    public static void main(String arg[]) {
        // 1. Get the number of hours worked
        System.out.println("Entrer the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Entrer the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiplie hours and pay rate
        double grossPay = hours * rate;

        //4. Dispaly result
        System.out.println("The employee's grossPay is $" + grossPay);
    }
}
