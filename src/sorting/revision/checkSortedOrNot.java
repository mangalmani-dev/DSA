package sorting.revision;

public class checkSortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
             if(arr[i]>arr[i+1]) flag =false;
        }
        if(flag==true){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}
