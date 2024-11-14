package repeat2;

import java.util.Arrays;

public class C01_Iterator {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 9, 12};

        // her bir elemanı 2 arttır

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
        System.out.println(Arrays.toString(arr)); // [3, 5, 7, 11, 14]

        // index kullanmadan her bir elemanı 2 arttıralım

        for (int each : arr) {
            each += 2;
        }
        System.out.println(Arrays.toString(arr)); // aynısı verdi baktığımız zaman index kullanmadan artış olmadı


    }
}
