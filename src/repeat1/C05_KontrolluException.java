package repeat1;

import java.util.Scanner;

public class C05_KontrolluException {
    public static void main(String[] args) {

        // Kullanıcıdan ismini ve yaşını alın
        // eğer ikisi de 4 harften uzunsa "super"
        // 4 harften kısa olan varsa "kötü" yazdırın

        String isim = null;
        String soyisim = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen isminiz giriniz: ");
            isim = scanner.nextLine();
            if ( isim.length() < 4 ){
                throw new RuntimeException();
            }
            System.out.print("Lütfen soyisim giriniz: ");
            soyisim = scanner.nextLine();
            if ( soyisim.length() < 4 ){
                throw new RuntimeException();
            }
        } catch (Exception ignored) {

        }

        if ( isim.length() >= 4 && soyisim.length() >= 4 ){
            System.out.print("SÜPER");
        } else {
            System.out.print("KÖTÜ");
        }

    }
}
