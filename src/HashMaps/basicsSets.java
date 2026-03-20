package HashMaps;

import java.util.HashSet;

public class basicsSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert O(1)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(94);
        set.add(40);
        System.out.println(set);
        // search  O(1)
        System.out.println(set.contains(30));  // it will give ans in true or false
        // size
        System.out.println(set.size());

        Object[] arr= set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();



    }
}
