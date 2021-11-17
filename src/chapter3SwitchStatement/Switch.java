package chapter3SwitchStatement;

import java.util.Scanner;

/*
Ask for grade
write message in function with the grade
 */
public class Switch {

    public static void main(String arg[]) {
        //Ask for the grade
        System.out.println("Enter your grade!");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        scanner.close();

        //Write the message
        String message;
        //switch = egualité.
        switch (grade){
            case 'A':
                message = "Excelente job";
                break;
            case 'B':
                message = "Great job";
                break;
            case 'C':
                message = "Good job";
                break;
            case 'D':
                message = "you  need to work harder";
                break;
            case 'F':
                message = "UH  OH";
                break;
            default:
                message = "Error Invalid grade";
                break;
        }
        System.out.println(message);
    }

}