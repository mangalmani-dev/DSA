package prefixsum;

public class pivotElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3,2,1};
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        for (int i = 0; i < n; i++) {
            int leftsum =0;
            if(i>0)leftsum =arr[i-1];
            int rightsum = arr[n-1]- arr[i];

            if(leftsum==rightsum)         System.out.println(i);

        }

    }
}
