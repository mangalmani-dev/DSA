package array;

public class basics {
    public static void main(String[] args) {
        int [] arr= new int[5];
         arr[0]=1;
         arr[1]=2;
         arr[2]=5;
         arr[3]=5;
         arr[4]=10;
        System.out.println(arr[2]);
        arr[2]=99;
        System.out.println(arr[2]);
    }
}
