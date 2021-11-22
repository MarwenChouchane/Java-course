package chapter6ObjetAndMethode;

public class ExcercieOverLoadMethodCalculatorBill {
    private int id;
    private double baseCoast;
    private double allowtedMinut;
    private double usedMinut;
    //Constructor
    public ExcercieOverLoadMethodCalculatorBill(){
        id = 0 ;
        baseCoast = 80;
        allowtedMinut = 500;
        usedMinut = 500;
    }
    public ExcercieOverLoadMethodCalculatorBill(int Id){
        id = Id ;
        baseCoast = 80;
        allowtedMinut = 500;
        usedMinut = 500;
    }
    public ExcercieOverLoadMethodCalculatorBill(int ID, double baseCOAST, double allowtedMINUTE, double usedMINUTE){
        setid(ID);
        setbasecoast(baseCOAST);
        setallowtedMinut(allowtedMINUTE);
        setusedMinut(usedMINUTE);
    }
    public int getid (){
        return id;
    }
    public void setid(int ID){
        id = ID;
    }
    public double getbaseCoast(){
        return baseCoast;
    }
    public void setbasecoast(double baseCOAST){
        baseCoast = baseCOAST;
    }
    public double getallowtedMinut(){
        return allowtedMinut;
    }
    public void setallowtedMinut(double allowtedMINUTE){
        allowtedMinut = allowtedMINUTE;
    }
    public double getusedMinut(){
        return usedMinut;
    }
    public void setusedMinut(double usedMINUTE){
        usedMinut = usedMINUTE;
    }
    public double averagePrice (){
        if (usedMinut <= allowtedMinut){
            return 0;
        }
        double averageMinutePrice = 0.2;
        double averageMinute = usedMinut - allowtedMinut ;
        return averageMinute * averageMinutePrice;
    }
    public double billTax(){
        double taxPrice = 0.1 ;
        return taxPrice * (baseCoast + averagePrice()) ;
    }
    public double totalBill(){
        return billTax() + baseCoast + averagePrice() ;
    }
    public void itemsitedBill(){
        System.out.println( "ID is : " +id);
        System.out.println( "Base Coast is  : " +baseCoast);
        System.out.println( "Average price is  : " +averagePrice());
        System.out.println( "The bill tax is  : " +billTax());
        System.out.println( "The Total bill is  : " +totalBill());
    }
}
