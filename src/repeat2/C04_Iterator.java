package repeat2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C04_Iterator {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 45, 56, 70));
        System.out.println(numbers); // [10, 20, 30, 45, 56, 70]

        ListIterator<Integer> iterator = numbers.listIterator();
        int sayac = 0;
        while (iterator.hasNext() && sayac <= 2) {
            iterator.set(iterator.next() + 5);
            sayac++;
        }
        System.out.println(numbers); // [15, 25, 35, 45, 56, 70]


    }
}
