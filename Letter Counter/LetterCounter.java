// Author : Rupa-Rd
// Project Name : Letter Counter
// Project Description : This application counts the number of character that a para has
// Date : 19-11-2023
// ----------------------------------------------------------------------------------------------

import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n------------CHAR COUNTER-------------");
        System.out.println("Enter a paragraph : ");
        String para = in.nextLine();
        int charcount = 0;
        for (int letter = 0; letter < para.length(); letter++) {
            if (para.charAt(letter) != ' ') {
                charcount++;
            }
        }
        System.out.println("\nWord Count : " + charcount);
    }
}
