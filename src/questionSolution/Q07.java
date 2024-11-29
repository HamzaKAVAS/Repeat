package questionSolution;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        while ( sayi != 0){
            toplam = (sayi % 10) + toplam;
            sayi = sayi / 10;
        }
        System.out.println("Basamak Toplam: " + toplam);

    }
}
