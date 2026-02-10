package array;

import java.util.ArrayList;

public class BasicOperationArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        System.out.println(arr);

        for (int i = 0; i < 6; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        System.out.println(arr.size());

        arr.set(2,99);
        System.out.println(arr.get(2));

        // to want to add the value in array list
        arr.add(100);
        System.out.println(arr.get(6));

        System.out.println(arr.size());
    }


}
