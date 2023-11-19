// Author : Rupa-Rd
// Project Name : Word Counter
// Project Description : This application counts the number of words that a para has
// Date : 19-11-2023
// ----------------------------------------------------------------------------------------------

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n------------WORD COUNTER-------------");
        System.out.println("Enter a paragraph : ");
        String para = in.nextLine();
        int wordcount = 0;
        for (int letter = 0; letter < para.length(); letter++) {
            if (para.charAt(letter) == ' ') {
                wordcount++;
            }
        }
        System.out.println("\nWord Count : " + wordcount);
    }
}
