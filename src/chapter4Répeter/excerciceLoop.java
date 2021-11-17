package chapter4Répeter;

import java.util.Random;

/*
&&
||
 */
public class excerciceLoop {
    public static void main(String arg[]) {
        int stepNumber = 20;
        int roll = 5;
        int rollNumber = 0;
        double total = 0;
        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);
        //for (int j = 0; j < stepNumber; j++) {

            for (int i = 0; i < roll; i++) {
                rollNumber = i+1;
                System.out.println("Enter the chichbich number of the roll : " +rollNumber);
                /*int number = scanner.nextInt();
                if (number > 6 || number < 1){
                    System.out.println("the number must be betwen 1 and 6");
                    i--;
                    rollNumber--;
                }else{
                    total = total + number;
                }*/
                int number = random.nextInt(6) + 1;
                System.out.println("The random number is " +number);
                total = total + number;

                double reste = total - stepNumber ;

                if(total == stepNumber){
                    System.out.println("You win !! you have passed all the spaces in " +rollNumber+ " rolls");
                    break;
                }else if(total > stepNumber){
                    System.out.println("You lose !! you passed with "+reste+" spaces");
                    break;
                }else if(total < stepNumber && rollNumber == roll) {
                    double missed = stepNumber - total;
                    System.out.println("You advanced to space " + total);
                    System.out.println("You lose !! you missed "+missed+" spaces");
                }else {
                        System.out.println("You advanced to space " + total);
                    }
                }
            }


        //}
    }

