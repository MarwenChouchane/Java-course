package chapter3StatementIF;

import java.util.Scanner;

/*IF Else statement
All salespeople expected to make 10 sales a weak
Salespeople who do, receive a congratulatory message.
Salespeople who do not, they are informed of how many sales they were short.
 */
public class SalesMessageIFElse {
    private static int weeksales = 10;

    public static void main(String arg[]) {
        //Get values from the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make decision
        if(sales >= weeksales){
            System.out.println("congratulation");
        }else{
            int salesShort =  weeksales - sales ;
            System.out.println("You have not make you weeksales, You were "+salesShort +" sales short");
        }
    }
}
