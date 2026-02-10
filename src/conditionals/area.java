package conditionals;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length :");
        int l = sc.nextInt();
        System.out.print("Enter the bredth :");
        int b = sc.nextInt();
        int perimeter=l*b;
        int area=l*l;
        if(perimeter>area){
            System.out.print("Perimeter is greater");
        } else if (area==perimeter) {
            System.out.println("All are equal");
        } else {
            System.out.print("area is greater");
        }

    }
}
