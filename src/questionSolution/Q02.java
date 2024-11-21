package questionSolution;

import java.util.Scanner;

public class Q02 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Q16 - Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
        //       Test Data:
        //       Input the string: The quick brown fox jumps over the lazy dog.
        // 	     Expected Output: Number of words in the string: 9

        int sonuc = kacKelimeOldugunuYazdiranMethod("merhaba dünya hello world");
        System.out.println("Girilen String'te kelime sayısı : " + sonuc);

    }

    protected static int kacKelimeOldugunuYazdiranMethod(String str) {

        int count = 0;

        char space = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == space){
                count++;
            }
        }
        return count + 1;

    }

}
