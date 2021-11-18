package chapter6ObjetAndMethode;

import java.util.Scanner;

public class AreaCalculator2 {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String  arg[]){ //static method can't contient non static methode
        AreaCalculator2 calculator = new AreaCalculator2();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double area = calculator.gettotalArea(kitchen,bathroom);
        System.out.println("The total area is : "+area);
        calculator.scanner.close();
    }

    public Rectangle getRoom (){
        System.out.println("Enter your room length : ");
        double length = scanner.nextDouble();
        System.out.println("Enter your room width : ");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);
    }
    public double gettotalArea(Rectangle Rectangle1 , Rectangle Rectangle2){
        return Rectangle1.calculateArea() + Rectangle2.calculateArea();
    }
}
