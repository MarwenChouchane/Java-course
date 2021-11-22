package chapter6ObjetAndMethode;

/*
write a class that creates instances of the rectangle class to find the total area of two rooms in house.
 */
public class AreaCalculator {
    public static void main(String  arg[]){
        /*************
         * Rectangle 1
         *************/
        //Create instance of Rectangle class.
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(40);
        double areaRoom1 = room1.calculateArea();

        /*************
         * Rectangle 2
         *************/
        //Create instance of Rectangle class.
        Rectangle room2 = new Rectangle(600,200);
        double areaRoom2 = room2.calculateArea();
        double totalArea = areaRoom1 + areaRoom2;
        System.out.println("The total area of the two room is : " +totalArea);

    }
}
