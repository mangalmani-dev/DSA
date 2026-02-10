package methods;

import java.util.Scanner;

public class scope {

    static  int i=10;     // global declarations
    public static void main(String[] args) {
        System.out.println(i);
        i=45;
        System.out.println(i);
        fun();
        System.out.println(i);
    }
    public static void fun(){
        i=65;
    }
}
