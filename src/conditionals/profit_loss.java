package conditionals;

import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Cost Price : ");
        int cp= sc.nextInt();
        System.out.println("Enter the Selling Price : ");
        int sp= sc.nextInt();

        if(cp>sp) System.out.println("Loss occurs :"+  (cp-sp));
        if(sp>cp) System.out.println("Profit occurs :"+ (sp-cp));
        if(sp==cp) System.out.println("No profit and no loss :"+(sp-cp));

    }
}
