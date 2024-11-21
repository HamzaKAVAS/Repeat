package questionSolution;

import java.util.Scanner;

public class Q01 {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Q15 - * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
        //       *
        //       * input      output
        //       * axyzm  ==   true
        //       * xyz    ==   true
        //       * x.yz   ==   false
        //       * xyaz   ==   false

        System.out.println("axyzm == " + girilenDegerDonduren());
        System.out.println("xyz == " + girilenDegerDonduren());
        System.out.println("x.yz == " + girilenDegerDonduren());
        System.out.println("xyaz == " + girilenDegerDonduren());
    }

    protected static boolean girilenDegerDonduren() {

        System.out.print("Lütfen bir kelime giriniz: ");
        String deger = scanner.next();
        boolean varsa;

        if ( deger.contains("xyz") ){
            varsa = true;
        }else {
            varsa = false;
        }

        return varsa;
    }
}
