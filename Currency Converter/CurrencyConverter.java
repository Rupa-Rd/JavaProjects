// Author : Rupa-Rd
// Project Name : Currency Converter
// Project Description : This converts the amount from Dollar(USD) to Rupees(INR)

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\t~~~~~~~~CURRENCY CONVERTER~~~~~~~~~~");
        System.out.println("\t\tConverts USD to INR\n");
        System.out.println("\t-------------------------------------------");

        System.out.print("\tAmount in USD : USD. ");
        double usd = in.nextDouble(); // Takes amount in USD

        // Converts into INR by multiplying into 83.29 and round it off to 2 decimals
        double inr = Math.round((usd * 83.29) * 100) / 100.0;

        // Prints amount in INR
        System.out.println("\tAmount in INR: Rs." + inr);

        System.out.println("\t-------------------------------------------");
    }
}
