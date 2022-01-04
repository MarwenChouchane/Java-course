package chapter11Obstraction.chapter11a;

import chapter11Obstraction.chapter11a.Rectangle;
import chapter11Obstraction.chapter11a.shape;

public class shapeTester {
    public static void main (String[]arg){
        shape rectangle = new Rectangle(5,8);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
