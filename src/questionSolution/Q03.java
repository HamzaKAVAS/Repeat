package questionSolution;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Q17 - Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        //       Test Data:
        //       Input: "aabbcccccddddaaa"
        //       Output: abcd

        // ANSWER //

        stringKarakterleriBirKezYazdiran("ey edip adanada pide ye");

    }

    private static void stringKarakterleriBirKezYazdiran ( String str ) {

        String sonuc = "";
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {

                sonuc += str.substring(i, i + 1);
            }
        }

        System.out.println(sonuc);
    }
}
