package recurrsion;

import java.util.Scanner;

public class hello {
    public static int power(int a , int b){
        if(b==0)return 1;
          int ans = power(a,b/2);
          if(b%2==0)return ans*ans;
          else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
