package TwoDimensionArray;

import java.util.ArrayList;
import java.util.List;

public class basic2_d {
    public static void main(String[] args) {
       ArrayList<Integer>a=new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        ArrayList<Integer>b=new ArrayList<>();
        b.add(10);b.add(20);
        ArrayList<Integer>c=new ArrayList<>();
        c.add(10);c.add(20);c.add(30);

        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> x = arr.get(i);
            for (int j = 0; j <x.size() ; j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }

    }
}
