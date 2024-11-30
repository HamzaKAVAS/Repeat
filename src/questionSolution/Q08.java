package questionSolution;

public class Q08 {
    public static void main(String[] args) {

        /*
               1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
               Beklenen Çıktı:
                               1
                               2
                               3
                               4
                               .
                               .
                               .
                               19
                               20
        */

        for (int i = 2; i <= 20; i++) {
            System.out.println( i - 1 );
        }
        System.out.print(20); // "Process finished" yazısı ile son çıkan koddan değerle aralarında boşluk olmasın diye yapıldı.
    }
}
