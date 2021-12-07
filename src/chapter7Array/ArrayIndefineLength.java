package chapter7Array;

import java.util.Scanner;

/*
Enter  any  number of grades.
Provide average score and higher and lowest.
 */
public class ArrayIndefineLength {
    private static Scanner scanner = new Scanner(System.in);
    private static int grades[];
    public static void main (String arg[]){
        System.out.println("How many grades do you want to enter ??");
        int gradesNumber = scanner.nextInt();
        grades = new int[gradesNumber];
        getGrades();
        sumGrades();
        average();
        getHighest();
        getlowest();
        System.out.println("Average : "+String.format("%.2f",average()));
        System.out.println("Highest score = "+getHighest());
        System.out.println("lowest score = "+getlowest());
    }
    public static void getGrades(){
        for (int i=0; i<grades.length ; i++){
            System.out.println("Enter grades # " +(i+1));
            int gradeValue = scanner.nextInt();
            grades[i]= gradeValue;
        }
    }
    public static int sumGrades(){
        int sum =0;
        for(int grade : grades){
            sum=sum+grade;
        }
        return sum;
    }
    public static double average(){
        return sumGrades()/grades.length;
    }
    public static int getHighest (){
        int highest = grades[0];
        for (int value : grades){
            if (value >= highest){
                highest = value;
            }
        }
        return highest;
    }
    public static int getlowest (){
        int lowest = grades[0];
        for (int value : grades){
            if (value <= lowest){
                lowest = value;
            }
        }
        return lowest;
    }

}
