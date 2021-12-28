package chapter9Inherance;

public class Square extends OverwriteRectangle{
    @Override
    public double calculatePeremeter(){
        return sides*length;
    }
    public void print(String what) {
        System.out.println("I am a " +what);
    }
}
