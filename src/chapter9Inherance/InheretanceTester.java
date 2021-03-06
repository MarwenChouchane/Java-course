package chapter9Inherance;

public class InheretanceTester {
    public static void main (String[] arg){
        testChaineInherance();
    }
    public static void testEmployeInherance(){
        //Person person = new Person();
        Employee employee = new Employee();
        OverwriteRectangle rectangle = new OverwriteRectangle();
        rectangle.print();
        Square square = new Square();
        square.print("carré");
        testSquareInherance();
    }
    public static void testSquareInherance(){
        OverwriteRectangle rectangle = new OverwriteRectangle();
        rectangle.setLength(8);
        rectangle.setWidth(4);
        System.out.println("My rectangle perimeter is : "+rectangle.calculatePeremeter());

        Square square = new Square();
        square.setLength(8);
        square.setWidth(4);
        System.out.println("My square perimeter is : "+square.calculatePeremeter());
    }
    public static void testChaineInherance(){
        Mother mom = new Mother();
        mom.setName("Henda");
        System.out.println(mom.getName()+ " is a " + mom.getGender());
    }
}
