package conditionals;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the shopping price :");
        double price = sc.nextInt();

        if(price>=4000){
            System.out.println("Discount will be provided to the person");
            double discountedprice= price*0.4;
            double payableAmt=price-discountedprice;
            System.out.println("The payable amount is :" +payableAmt);
        } else if (price>=3000) {
            System.out.println("Discount will be provided to the person");
            double discountedprice= price*0.3;
            double payableAmt=price-discountedprice;
            System.out.println("The payable amount is :" +payableAmt);
        } else if (price>=2000) {
            System.out.println("Discount will be provided to the person");
            double discountedprice= price*0.3;
            double payableAmt=price-discountedprice;
            System.out.println("The payable amount is :" +payableAmt);
        }
        else  {
            System.out.println("No discount will be given to the person" + price);
        }


    }
}
