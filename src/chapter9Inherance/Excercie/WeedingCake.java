package chapter9Inherance.Excercie;

public class WeedingCake extends Cake{
    public int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public WeedingCake() {
        super("Chokolat");
    }
}
