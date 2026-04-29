package strings.revision;

public class reverseEachWord {
    public static void reverse(StringBuilder sb ,int i, int j){
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I hello my Name Mangalmani");
        System.out.println("Original: " + sb);
        int n = sb.length();
        int i =0;
        int j=0;
        while(j<n){
            if(sb.charAt(j)!=' ')j++;
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        System.out.println("After reverse: " + sb);
    }
}
