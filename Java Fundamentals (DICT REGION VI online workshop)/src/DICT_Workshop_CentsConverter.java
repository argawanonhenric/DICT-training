import java.util.Scanner;
public class DICTWorkshop_Assignment {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int Halfdollar = 50;
        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int change, coinsLeft;

        System.out.print("Enter change in cents: ");
        change = console.nextInt();

        System.out.println("Equivalent exchange in Dollars: " + change / Halfdollar);
        change = change % Halfdollar;

        System.out.println("Equivalent exchange in Quarters: " + change / Quarter);
        change = change % Quarter;

        System.out.println("Equivalent exchange in Dimes: " + change / Dime);
        change = change % Dime;

        System.out.println("Equivalent exchange in Nickels: " + change / Nickel);
        coinsLeft = change % Nickel;

        System.out.println("Equivalent exchange in Pennies:  " + coinsLeft );


    }
}