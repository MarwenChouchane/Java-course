package chapter9Inherance;

public class OverwriteRectangle {
    protected double length;
    protected double width;
    protected double sides =4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSide() {
        return sides;
    }

    public void setSide(double side) {
        this.sides = side;
    }

    public double calculatePeremeter(){
        return (length*2)+ (2*width);
    }
    public void print() {
        System.out.println("I am a rectangle");
    }
}
