package questionSolution;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        // reverseString isminde bir method create ediniz.
        // Bu method bir String'i parametre olarak alsın.
        // Ve bu method, girilen String'i tersten print etsin.
        //
        //
        // Örn: String = "Java'yı Seviyorum."
        // Print: .muroyiveS ıy'avaJ

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = scanner.nextLine();

        System.out.println(reverseString(str));

    }

    private static String reverseString(String str) {
        String str2 = str.trim();
        String strTers = "";

        for (int i = str2.length() - 1; i >= 0; i--) {

            strTers += str2.charAt(i);
        }

        return strTers;
    }
}
