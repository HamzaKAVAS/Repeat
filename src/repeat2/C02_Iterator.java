package repeat2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 6, 9, 12, 15));

        // 2  6  9  12  15

        Iterator iterator = sayilar.iterator();
        System.out.println(iterator.hasNext()); // true
        // System.out.println(iterator.next()); // 2
        // System.out.println(iterator.next()); // 6
        // System.out.println(iterator.next()); // 9

        int sayi = (int) iterator.next();
        System.out.println(sayi); // 2
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar); // [6, 9, 12, 15]

        sayi = (int) iterator.next();
        System.out.println(sayi); // 6
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar); // [9, 12, 15]

        sayi = (int) iterator.next();
        System.out.println(sayi); // 9
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar); // [9, 12, 15]

        sayi = (int) iterator.next();
        System.out.println(sayi); // 12
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar); // [9, 15]



    }
}
