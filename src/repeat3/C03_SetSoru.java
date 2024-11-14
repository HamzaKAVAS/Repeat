package repeat3;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C03_SetSoru {
    public static void main(String[] args) {
        // verilen bir Array'de tekrar edilen bir sayı varsa
        // tekrar eden sayıları silip
        // Array'i her sayıdan sadece 1 tane bulunacak şekilde kaydedin
        // örnek input : {2, 3, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1}
        //       output : [1,2,3,4,5]

        int[] arr = {2, 3, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1};

        Set<Integer> set = new TreeSet<>();

        for (int each : arr) {
            set.add(each);
        }
        System.out.println("Set: " + set);

        int[] arrDegisim = new int[set.size()];
        System.out.println(Arrays.toString(arrDegisim));

        int index = 0;

        for (int each : set) {
            arrDegisim[index] = each;
            index++;
        }
        System.out.println("Array eklendi: " + Arrays.toString(arrDegisim));


    }
}
