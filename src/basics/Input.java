package basics;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the input : ");
//        int n =sc.nextInt();
//        System.out.println(n*n);
        System.out.print("Enter the valid radius : ");
        double r=sc.nextDouble();
        System.out.println("Area of circle "+ 3.14*r*r);

    }
}
