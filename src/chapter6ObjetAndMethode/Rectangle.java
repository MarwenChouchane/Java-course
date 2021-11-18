package chapter6ObjetAndMethode;

public class Rectangle {    // protected = all the class in this package have the acces to this variabl.
    private double length;  //private = only this class have acces to this variable.
    private double width;   // public = all the class have acces to this variable

    //is a constructor = must have the same name of the class : role = initialize variable
    public Rectangle(){ //we dont know the value of the parameters
        length = 0;
        width = 0;
    }

    public Rectangle(double rectangleLength , double rectangleWidth){ //we do know the value of the parameters
        setLength(rectangleLength); //or this.length = rectangleLength;
        setWidth(rectangleWidth); //or this.width = rectangleWidth;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double rectangleLength){
        this.length = rectangleLength;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double rectangleWidth){
        this.width = rectangleWidth;
    }

    public double calculatePerimeter(){
       return (2*length)+(2*width);
    }

    public double calculateArea(){
        return length*width;
    }
}
