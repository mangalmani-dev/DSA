package array;

public class twosum {
    public static void main(String[] args) {
        int [] arr= {3,2,3,8,5};
        int target = 5;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i] +" "+ arr[j]);

                }

            }
        }
    }
}
