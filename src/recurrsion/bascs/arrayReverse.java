package recurrsion.bascs;

public class arrayReverse {
    public static void print(int i, int [] arr){
        int n = arr.length;
       if(i>=n)return;
        print(i+1,arr);
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        print(0,arr);
    }
}
