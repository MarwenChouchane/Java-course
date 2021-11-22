package chapter6ObjetAndMethode;

public class SuiteExcercieCalculatorBill {
    public static void main (String arg[]){
        ExcercieOverLoadMethodCalculatorBill bill1 = new ExcercieOverLoadMethodCalculatorBill(2, 40, 100, 150);
        bill1.averagePrice();
        bill1.billTax();
        bill1.totalBill();
        bill1.itemsitedBill();
    }
}
