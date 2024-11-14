package repeat3;

import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(15);
        set.add(25);
        set.add(25);
        set.add(30);
        set.add(45);
        set.add(15);
        System.out.println(set); // [12, 15, 25, 30, 45]










    }
}
