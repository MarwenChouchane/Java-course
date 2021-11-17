package chapter5Methode;

/*
Cell phone bill
 1- initialize what we know (price of minute over the plan = 0.25 ; tax percentage of total call = 15%)
 2- Enter what we do not know (plan fee (forfait = minutes + price) ,  Total minute consommé)
 3- Calculate the total of over minute
 4- Calculate de total minute price (calculate the over minute price)
 5- calculate the tax in the total price
 6- Calculate the total bill
 */

import java.util.Scanner;

public class excerciceSeperatedMethode {
    static Scanner scanner = new Scanner(System.in);
    static double requiredPrice = 200;
    static double priceOverMinute;
    static double totaltax ;
    static double taxeBill = 0.15;
    static double totalPriceMinute ;
    static double totalBill ;

    public static void main(String arg[]){
        double feeMinute = getMinuteForfait();
        double feePrice = getPriceForfait();
        double totalMinute = getUsedMinute();
        scanner.close();
        double overMinutePrice = getOverMinutePrice(feeMinute,totalMinute);
        double totalMinutePrice = getTotalMinutePrice(overMinutePrice,feePrice);
        double billTax = getBillTax(totalMinutePrice,taxeBill);
        double Bill = getTotalBill(totalMinutePrice,billTax);
        System.out.println("The price of the minutes over your fee is " +overMinutePrice);
        System.out.println("The total price of your used minutes is " +totalMinutePrice);
        System.out.println("The total tax of your bill is " +billTax);
        System.out.println("The total of your bill with tax is " +Bill);
    }
    public static double getMinuteForfait (){
        System.out.println("Enter your number of the minutes in your fee : ");
        double minuteFee = scanner.nextDouble();
        return minuteFee;
    }
    public static double getPriceForfait (){
        System.out.println("Enter the price of your fee : ");
        double priceFee = scanner.nextDouble();
        return priceFee;
    }
    public static double getUsedMinute (){
        System.out.println("Enter the number of the total used minutes : ");
        double usedMinute = scanner.nextDouble();
        return usedMinute;
    }
    public static double getOverMinutePrice (double minuteFee , double usedMinute){
        if(usedMinute > minuteFee) {
            priceOverMinute = (usedMinute - minuteFee) * requiredPrice;
        }else{
            priceOverMinute = 0 ;
        }
        return priceOverMinute;
    }
    public static double getTotalMinutePrice (double priceOverMinute , double priceFee){
        totalPriceMinute = priceOverMinute + priceFee ;
        return totalPriceMinute;
    }
    public static double getBillTax (double totalPriceMinute , double taxeBill){
        totaltax = totalPriceMinute * taxeBill ;
        return totaltax;
    }
    public static double getTotalBill (double totalPriceMinute , double totaltax){
        totalBill = totalPriceMinute + totaltax ;
        return totalBill;
    }
}
