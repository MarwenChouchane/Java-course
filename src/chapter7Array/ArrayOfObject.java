package chapter7Array;

import java.util.Scanner;

/*
Enter any number of grade, provide them with their average score, as well as the hihest and lowest score.
 */
public class ArrayOfObject {
    private static Scanner scanner = new Scanner(System.in);
    private static int grade[] ;
    public static void main (String arg[]){
        System.out.println("How many grade do you want to enter : ");
        int gradeNumber = scanner.nextInt();
        grade = new int[gradeNumber];
        getGrade();
        averageGrade();
        System.out.println("Average : " +String.format("%.2f" , averageGrade())); //+String.format("%.2f" = nombre des choffre après la virgule
        highestGrade();
        System.out.println("Highest : " +highestGrade());
        lowestGrade();
        System.out.println("Lowest : " +lowestGrade());
    }
    public static void getGrade(){
        for (int i=0 ; i < grade.length ; i++){
            System.out.println("Enter grade #" + (i+1));
            int gradeValue = scanner.nextInt();
            grade[i] =  gradeValue ;
        }
    }
    public static int sumGrade(){
        //enhanced loop
        int sum = 0;
        for (int gradevalue : grade){
            sum = sum + gradevalue ;
        }return sum;
    }
    public static double averageGrade(){
        double average = sumGrade()/grade.length;
        return average ;
    }
    public static double highestGrade(){
        int highest = grade[0];
        for (int highestValue : grade){
            if(highestValue > highest){
                highest = highestValue;
            }
        }return highest;
    }
    public static double lowestGrade(){
        int lowest = grade[0];
        for (int lowestValue : grade){
            if(lowestValue < lowest){
                lowest = lowestValue;
            }
        }return lowest;
    }
}
