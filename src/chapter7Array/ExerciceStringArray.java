package chapter7Array;

import chapter6ObjetAndMethode.OverLoadMethodMonth;

import java.util.Scanner;

public class ExerciceStringArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String arg[]){
        //System.out.println(ExerciceStringArray.getDay(7));
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Enter the day number you want : ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("The correspondent day of this number is : " + days[number-1]);
    }
    /*
    public static String getDay (int  day){
        switch (day){
            case 1 : return "Monday";
            case 2 : return "Tuesday";
            case 3 : return "wednesday";
            case 4 : return "Thursday";
            case 5 : return "Friday";
            case 6 : return "Saturday";
            case 7 : return "Sunday";
            default : return "Invalid, pleas enter a number between 1 and 12";
        }
    }*/
}
