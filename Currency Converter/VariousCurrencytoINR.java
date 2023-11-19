// Author : Rupa-Rd
// Project Name : Currency Converter 2.0
// Project Description : This converts the amount from USD, KRW, JPY, AUD and GBP to Rupees(INR)
// Abbrevations :
// USD - United States Dollar
// KRW - Korean Won
// JPY - Japanese Yen
// AUD - Australian Dollar
// GBP - Great Britain Pound
// Date : 19-11-2023
// ----------------------------------------------------------------------------------------------

import java.util.Scanner;

public class VariousCurrencytoINR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\t----------CURRENCY CONVERTER 2.0----------");
        System.out.println("\tSelect Currency and Press key Accordingly");
        System.out.println("\t-------------------------------------------");
        System.out.println(
                "\t| 1. USD to INR\t\t\t\t |\n\t| 2. KRW to INR\t\t\t\t |\n\t| 3. JPY to INR\t\t\t\t |\n\t| 4. AUD to INR\t\t\t\t |\n\t| 5. GBP to INR\t\t\t\t |");
        System.out.println("\t-------------------------------------------");
        System.out.print("\tEnter your choice : ");
        int CurrecnyChoice = in.nextInt();
        System.out.print("\tEnter the amount : ");
        double amount = in.nextDouble();
        double inr = 0;
        switch (CurrecnyChoice) {
            case 1:
                inr = Math.round((amount * 83.3217) * 100) / 100.0;
                break;
            case 2:
                inr = Math.round((amount * 0.0644189) * 100) / 100.0;
                break;
            case 3:
                inr = Math.round((amount * 0.556677) * 100) / 100.0;
                break;
            case 4:
                inr = Math.round((amount * 54.267418) * 100) / 100.0;
                break;
            case 5:
                inr = Math.round((amount * 103.756537) * 100) / 100.0;
                break;
            default:
                break;
        }
        System.out.println("\tAmount in INR : " + inr);
        System.out.println("\t-------------------------------------------");
    }
}
