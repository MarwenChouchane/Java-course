package methode;

import java.util.Scanner;

/*
Methode to ask user for their name than greet them by name.
 */
public class firstMethod {
    public static void main(String arg[]) {
    System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }
    public static void greetUser (String name){
        System.out.println("Hi there "+name);
    }
}
