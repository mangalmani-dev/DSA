package array;

public class passingArrayInMethod {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50};
        System.out.println(arr[2]);
        change(arr);     // here is pass by referance
        System.out.println(arr[2]);
    }

    private static void change(int [] arr) {
        arr[2]=99;
    }
}
