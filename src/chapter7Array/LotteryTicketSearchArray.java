package chapter7Array;

import java.util.Arrays;
import java.util.Random;

/*
insue that the lottery ticket does not have a duplicated number
 */
public class LotteryTicketSearchArray {
    private static final int LENGTH = 6; //Constante
    private static final int MAX_TICEKT_NUMBER = 1000;

    public static void main (String[] arg){
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int[] lotteryTicket = new int[LENGTH];
        Random random = new Random();
        for (int i=0 ; i < LENGTH ; i++) {
            int number ;
            //Generate a random number the seach and make sure it does not existe. If it does regenrate and search
            do{
                number= random.nextInt(MAX_TICEKT_NUMBER) + 1;
            }while(sequentialSearch(lotteryTicket, number));
            lotteryTicket[i] = number;
        }
        return lotteryTicket;
    }

    /**
     * does a sequatial search on the array to find a value
     * @param array   array to search through
     * @param numberSearch value to search for
     * @return true if found, famse if does not
     */
    public static boolean sequentialSearch(int[] array , int numberSearch){
// this is an enhanced loop : iterate through array and each time assigne the current element to 'value'
        for (int value : array){
            if (value >= numberSearch){
                return true;
            }
        }return false;
    }
    public static boolean binarySearch(int[] array , int numberSearch){
        //array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberSearch);
        if(index >= 0){
            return true;
        }else return false ;
    }
    public static void printTicket(int ticket[]){
        for (int i=0 ; i < LENGTH ; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
    public static boolean superioritySearch(int[] array , int numberSearch){
// this is an enhanced loop : iterate through array and each time assigne the current element to 'value'
        for (int value : array){
            if (value > numberSearch){
                return true;
            }
        }return false;
    }
}
