package array;

import java.util.Scanner;

public class conditionQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of student :");
        int n = sc.nextInt();
        int [] student = new int[n];

        System.out.print("enter the marks of the student :");
        for (int i = 0; i < n-1; i++) {
            student[i]= sc.nextInt();;
        }

        for (int i = 0; i < n-1; i++) {
            if(student[i]<=35){
                System.out.print(i+" ");
            }
            else {
                System.out.println("No student has less than 35 marks");
                break;
            }
        }
    }
}
