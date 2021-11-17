package chapter3StatementIF;

import java.util.Scanner;

/* Ask for the score
Determinate the grade
 */
public class IFWithMultipleConditionAndResult {


    public static void main(String arg[]) {
        //Ask for the score
        System.out.println("Enter your score!");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        //scanner.close();

        //Determinate the grade
        char grade = 0;
        if (score < 60) {
            grade = 'F';
        }else if(score < 70){
            grade = 'E';
        }else if (score < 80){
            grade = 'D';
        }else if (score < 85){
            grade = 'C';
        }else if (score < 90){
            grade = 'B';
        }else if (score < 100){
            grade = 'A';
        }

        System.out.println("Your grade is " +grade);
    }
}