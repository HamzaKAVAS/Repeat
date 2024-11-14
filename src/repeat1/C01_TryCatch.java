package repeat1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        // Kullanıcıdan iki tamsayı isteyip
        // sayıları birbirine bölün ve sonucu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz...");
        try {
            System.out.print("1.tamsayı: ");
            int sayi1 = scanner.nextInt();
            System.out.print("2.tamsayı: ");
            int sayi2 = scanner.nextInt();

            System.out.println("İki sayının birbirine bölümü: " + ( sayi1 / sayi2 ) );

        } catch (InputMismatchException e) {
            System.out.println("Girilen değerler tamsayı olmalı");
            // e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("sayi2 sıfır olamaz");
        }


    }
}
