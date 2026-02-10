package strings.stringBuilder;

import java.util.Scanner;

public class toggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int n = sb.length();
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90) { // Uppercase
                ascii += 32;
                sb.setCharAt(i, (char) ascii);
            }
            else if (ascii >= 97 && ascii <= 122) { // Lowercase
                ascii -= 32;
                sb.setCharAt(i, (char) ascii);
            }
        }

        System.out.println(sb);
    }
}
