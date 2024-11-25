package questionSolution;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Q18 - addDigits isminde bir method create ediniz.
        //       Parametresi int
        //       Return tipi de int
        //       Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        //       Tek basamaklı çıktığında, return etsin
        //
        //       Örnek1:
        //       Girdi 38
        //       Çıktı: 2
        //       Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
        //                 2 , tek basamaklı olduğundan, bunu döndürün.

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = scan.nextInt();

        System.out.println("while loop ile --> girdiginiz sayının tek haneli rakamlar toplamı : "+addDigits(sayi));
        System.out.println("   ***   ");
        System.out.println("%9  yontemi ile --> girdiginiz sayının tek haneli rakamlar toplamı : "+rakamlariTopla(sayi));

    }

    private static int rakamlariTopla(int sayi) {
        sayi = sayi % 9;//Bir sayının 9 a bölümünden kalan daima ardışık rakamları(teek haneli) toplamını verir
        return sayi;
    }

    private static int addDigits(int sayi) {
        while (sayi >= 10) {
            sayi = rakamTopla(sayi);
        }
        return sayi;
    }

    private static int rakamTopla(int sayi) {
        int rakam = 0;
        int toplam = 0;

        while (sayi > 0) {
            rakam = sayi % 10;//sayının birler basamagını rakama atar
            toplam += rakam;
            sayi /= 10;//sayının birler basamagını sayıdan ayırıp kalan basamaklar elde edilir
        }
        return toplam;
    }
}
