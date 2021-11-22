package chapter7Array;

import java.util.Random;

/*
Gerate a lottery ticket with 6 random number between 1-69
 */
public class FirstArrayLotteryTicketRemplissage {
    private static final int LENGTH = 6; //Constante
    private static final int MAX_TICEKT_NUMBER = 69;

     public static void main (String[] arg){
         int[] ticket = generateNumbers();
         printTicket(ticket);
     }
     public static int[] generateNumbers(){
         int[] lotteryTicket = new int[LENGTH];
         Random random = new Random();
         for (int i=0 ; i < LENGTH ; i++) {
                 int number = random.nextInt(MAX_TICEKT_NUMBER) + 1;
                 lotteryTicket[i] = number;
         }
             return lotteryTicket;
     }
     public static void printTicket(int ticket[]){
         for (int i=0 ; i < LENGTH ; i++){
             System.out.print(ticket[i] + " | ");
         }
     }
}
