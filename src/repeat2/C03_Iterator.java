package repeat2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(12, 45, 23, 68, 14, 29));
        System.out.println(sayilar); // [12, 45, 23, 68, 14, 29]

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()) {
            int sayi = (int) itr.next();
            if (sayi % 2 == 0) {
                itr.remove();
            }

        }
        System.out.println(sayilar);

        // tüm elemanları toplama

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 45, 68, 25, 74, 32));
        System.out.println(list); // [12, 45, 68, 25, 74, 32]

        Iterator<Integer> rte = list.iterator();
        int toplam = 0;

        while (rte.hasNext()) {
            int say = (int) rte.next();
            toplam += say;
        }
        System.out.println(toplam); // 256


    }
}
