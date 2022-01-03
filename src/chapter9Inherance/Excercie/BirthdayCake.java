package chapter9Inherance.Excercie;

public class BirthdayCake extends Cake{
    public double candles;

    public double getCandles() {
        return candles;
    }

    public void setCandles(double candles) {
        this.candles = candles;
    }

    public BirthdayCake() {
        super("Vanilla");
    }
}
