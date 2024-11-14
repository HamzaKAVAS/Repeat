package repeat1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_SayiToplama {
    public static void main(String[] args) {

        // Kullanıcıdan toplanmak üzere tamsayılar isteyin
        // ve kullanıcı q veya Q'ya basıncaya kadar işlemi devam ettirin
        // kullanıcı q veya Q ya bastığında
        // kaç adet sayı girildiğini ve toplamın ne olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;
        int girilenSayi;
        String girilenMetin = "";

        do {
            System.out.println("Lütfen toplanmak üzere tamsayılar giriniz.\nBitirmek için Q tuşuna basınız.");
            try {
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {
                girilenMetin = scanner.nextLine();
                if ( girilenMetin.equalsIgnoreCase("Q")){
                    break;
                }else System.out.println("GIRIŞ HATALIDIR...Girilen değerler tamsayı veya Q olmalıdır");
            }

        }while ( !girilenMetin.equalsIgnoreCase("Q"));

        System.out.println( sayac + " adet sayının toplamı: " + toplam );































    }
}
