package questionSolution;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Q19 - powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        //       Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        //       Örnek 1:
        //       input: 27
        //       output: true
        //
        //       Örnek 2:
        //       Girdi: 0
        //       Çıktı: false
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        System.out.println(powerOfThree(num));

    }

    private static boolean powerOfThree(int num) {
        boolean b = false;
        int carpim = 1;

        for (int i = 1; i < num / 3; i++) { //num/3 olmadan direk num da yazılabilir
            carpim *= 3;

            if (carpim == num) {
                b = true;
                break;
            }
        }
        return b;
    }
}
