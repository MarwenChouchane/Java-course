package chapter4Répeter;

import java.util.Scanner;

/*
  Find the average for each student's test score
 */
public class nestedLoop {
    public static void main(String arg[]) {

        int studentNumber = 24;
        int testNumber = 4;
        //Ask for the number of student and test
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < studentNumber; i++) {
            double total = 0;
            double average = 0;
            for (int j = 0; j < testNumber; j++) {
                System.out.println("Enter the score test of the test : " + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            average = total / testNumber;
            System.out.println("The test average for student : " + (i+1)+ " is : "+average);
        }
        scanner.close();
    }
}