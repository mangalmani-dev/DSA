package recurrsion;

public class traversal {
    public static void print(int i ,int [] arr){
        if(i== arr.length)return;
        System.out.println(arr[i]);
        print(i+1,arr);

    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,7,4,5};
        int n = arr.length;
        print(0,arr);

    }
}
