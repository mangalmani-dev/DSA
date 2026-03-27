package prefixsum;

public class RangeQuery {

    public static void print(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void prefixSum(int [] arr , int [] brr){
          brr[0]= arr[0];
        for (int i = 1; i < arr.length ; i++) {
           brr[i]= arr[i]+brr[i-1];
        }
    }
    // for sum between to numbers
    public static int sum(int [] arr ,int left , int right){
        if(left<0)return arr[right];
        else return arr[right]- arr[left-1];
    }
    public static void main(String[] args) {
        int  [] arr = {1,2,3,4,5};
        int [] pr = new int[arr.length];
        int n = arr.length;
        int left =1;
        int right =3;
        print(arr);
        prefixSum(arr,pr);
        System.out.println();
        print(pr);
        System.out.println();
        System.out.println(sum(pr,left,right));
        arr[2]= 10;
        print(arr);
        prefixSum(arr,pr);
        System.out.println();
        print(pr);
        System.out.println();
        System.out.println(sum(pr,left,right));









    }
}
