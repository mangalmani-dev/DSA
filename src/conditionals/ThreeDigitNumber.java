package conditionals;

import java.util.Scanner;

public class ThreeDigitNumber {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n= sc.nextInt();
//
//        if(n>99&&n<1000){
//            System.out.println("the given numbers is three digit numbers");
//        }
//        else {
//            System.out.println("the given numbers is not a three digit numbers");
//        }
//    }
                                 // five digit numbers
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n= sc.nextInt();

    if(n>9999&&n<1000000){
        System.out.println("the given numbers is five  digit numbers");
    }
    else {
        System.out.println("the given numbers is not a five digit numbers");
    }
}

}
