import java.util.ArrayList;
import java.util.Scanner;


public class CheckOutApp{

    static ArrayList<String>  itemNames  = new ArrayList<>();
    static ArrayList<Integer> itemQtys   = new ArrayList<>();
    static ArrayList<Double>  itemPrices = new ArrayList<>();

    static final double VAT_RATE      = 0.075;
    static final double DISCOUNT_RATE = 0.08;  

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("******SEMICOLON STORE CHECKOUT SYSTEM**********\n");

        System.out.print("Enter Cashier Name   : ");
        String cashierName = input.nextLine().trim();

        System.out.print("Enter Customer Name  : ");
        String customerName = input.nextLine().trim();

    
            String answer = "yes";

        while (answer.equals("yes")) {
            System.out.print("\nEnter product name  : ");
            String name = input.nextLine().trim();

            System.out.print("Enter quantity of item   : ");
            int qty = input.nextInt();

            System.out.print("Enter price per item  : ");
            double price = input.nextDouble();

            addItemToCart(name, qty, price);
            System.out.println("Item added to cart ✅️\n");

            System.out.print("Add more item? [yes/no]: \n");
            answer = input.nextLine().trim().toLowerCase();
            input.nextLine();
        }


    System.out.print("\nHow much did the customer give to you? ");
    double amountPaid = input.nextDouble();

    double subTotal  = calculateSubTotal();
    double discount  = calculateDiscount(subTotal);
    double vat       = calculateVAT(subTotal);
    double billTotal = calculateBillTotal(subTotal, discount, vat);
    double balance   = calculateBalance(amountPaid, billTotal);

  
    printHeader(cashierName, customerName); printCartItems();
    
    printTotals(subTotal, discount, vat, billTotal, amountPaid, balance);
    }



    public static void addItemToCart(String name, int qty, double price) {
    
        itemNames.add(name);
        itemQtys.add(qty);
        itemPrices.add(price);
    }


    public static double calculateSubTotal() {
    
        double subTotal = 0;
        
        for (int count = 0; count < itemNames.size(); count++) {
        
            subTotal += itemQtys.get(count) * itemPrices.get(count);
        }
        return subTotal;
    }

    public static double calculateDiscount(double subTotal) {
    
        return subTotal * DISCOUNT_RATE;
    }


    public static double calculateVAT(double subTotal) {
    
        return subTotal * VAT_RATE;
    }


    public static double calculateBillTotal(double subTotal, double discount, double vat) {
    
        return subTotal - discount + vat;
    }

    public static double calculateBalance(double amountPaid, double billTotal) {
    
        return amountPaid - billTotal;
    }



    public static void printHeader(String cashierName, String customerName) {
    
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date    : " + "01-Jun-26 4:38:14");
        System.out.println("Cashier : " + cashierName);
        System.out.println("Customer: " + customerName);
    }


    public static void printCartItems() {
    
        System.out.println("*".repeat(52));
        
        System.out.printf("%-18s %5s %10s %12s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        
        System.out.println("*".repeat(52));

        for (int count = 0; count < itemNames.size(); count++) {
            String name  = itemNames.get(count);
            int    qty   = itemQtys.get(count);
            double price = itemPrices.get(count);
            double total = qty * price;

            System.out.printf("%-18s %5d %10.2f %12.2f%n", name, qty, price, total);
        }
        System.out.println("*".repeat(52));
    }


    public static void printTotals (double subTotal, double discount, double vat, double billTotal, double amountPaid, double balance) {
    
        System.out.printf("%30s  %10.2f%n", "Sub Total:",  subTotal);
        System.out.printf("%30s  %10.2f%n", "Discount:",   discount);
        System.out.printf("%30s  %10.2f%n", "VAT @ " + (VAT_RATE * 100) + "%:", vat);
        System.out.println("*".repeat(52));
        
        System.out.printf("%30s  %10.2f%n", "Bill Total:",  billTotal);
        System.out.printf("%30s  %10.2f%n", "Amount Paid:", amountPaid);
        System.out.printf("%30s  %10.2f%n", "Balance:",     balance);
        System.out.println("*".repeat(52));
        
        System.out.println("         THANK YOU FOR YOUR PATRONAGE");
        
        System.out.println("*".repeat(52));
    }


}
