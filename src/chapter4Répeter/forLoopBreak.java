package chapter4Répeter;

import java.util.Scanner;

/*
Enter a text
Search for letter 'A' in this text
 */
public class forLoopBreak {
    public static void main(String arg[]) {
         boolean again ;


        //Ask for a text : string
        do {
            boolean letterfound = false ;
            int total = 0;
        System.out.println("Enter a text : ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        //scanner.close();
        for(int i=0 ; i<text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'A' || letter == 'a') {
                letterfound = true;
                int numberA = 1 ;
                total = total + numberA ;
                //break;
            }
        }
        //System.out.println(letterfound);
        if(letterfound){
            System.out.println("This text contain a " + total +" letter 'A' !");
        }else{
            System.out.println("This text doesn't contain a letter 'A' !");
        }
            System.out.println("If you want to run again type 'True' else type 'False' ");
            again = scanner.nextBoolean();
            //System.out.println(letterfound);
        }while (again);
    }
}
