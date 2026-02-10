package array;

import java.util.ArrayList;

public class arrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr.size());
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(40);
        arr.add(90);
        System.out.println(arr);
        System.out.println(arr.size());

        arr.set(2,99);
        System.out.println(arr);

    }
}
