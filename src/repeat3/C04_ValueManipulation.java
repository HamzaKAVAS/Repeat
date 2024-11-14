package repeat3;

import java.util.Arrays;

public class C04_ValueManipulation {
    public static void main(String[] args) {

        String value = "Hüseyin Hamza-Kavas-10-A-SAY";
        System.out.println(value); // Hüseyin Hamza-Kavas-10-A-SAY
        String[] atama = value.split("-");
        System.out.println(Arrays.toString(atama)); // [Hüseyin Hamza, Kavas, 10, A, SAY]
        atama[0] = "Enes";
        System.out.println(Arrays.toString(atama)); // [Enes, Kavas, 10, A, SAY]
        value = String.join("-", atama);
        System.out.println(value);


    }
}
