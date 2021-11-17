package methode;

import java.util.Scanner;

/*
  Methode to approv user :
  conditions :
  1- must make than 25 000$
  2- Have crédit scroe equal to 700 or more
 */
public class secondMethode {
    static int requiredSalary = 25000;
    static int requiredScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {
        double allSalary = getSalary();
        double allScore = getScore();
        scanner.close();
        boolean qualification = userQualification(allSalary,allScore);
        notifyUser(qualification);
    }

    public static double getSalary() {
            System.out.println("Enter your salary : ");
            double salary = scanner.nextDouble();
            return salary;
    }
    public static double getScore() {
            System.out.println("Enter your credit score : ");
            double score = scanner.nextDouble();
            return score;
    }

    public static boolean userQualification (double salary , double score) {
        if (salary > requiredSalary && score >= requiredScore) {
            return true;
        }else{
            return false;
        }
    }
    public static void notifyUser (boolean qualify) {
        if (qualify) {
            System.out.println("You are allowed to have a credit ");
        }else{
            System.out.println("You aren't allowed to have a credit ");
        }
    }
}
