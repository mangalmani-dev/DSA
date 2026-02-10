package array.Practice;

public class elementGreaterThanX {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        int n =arr.length;
        int target= 30;
        int greater= 0;
        for (int i = 0; i <n ; i++) {
            if (arr[i] > target)greater++;
        }
        System.out.println(greater);
    }
}
