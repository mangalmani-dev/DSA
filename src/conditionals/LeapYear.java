package conditionals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the years :");
        int year = sc.nextInt();

        if(year%400==0){
            System.out.println("The given year is leap year :" + year);
        } else if (year %100==0) {
            System.out.println("The given year is not a leap year:"+year);
        } else if (year%4==0) {
            System.out.println("The given year is leap year");
        }
        else {
            System.out.println("The given year is not a leap years:"+ year);
        }

    }
}
