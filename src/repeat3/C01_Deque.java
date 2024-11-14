package repeat3;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        deque.add(23);
        deque.addAll(Arrays.asList(12, 15, 76));
        System.out.println(deque);
        deque.push(56);
        System.out.println(deque);
        deque.iterator();
        System.out.println(deque);
        deque.element();
        deque.removeAll(deque);
        System.out.println(deque);


    }
}
