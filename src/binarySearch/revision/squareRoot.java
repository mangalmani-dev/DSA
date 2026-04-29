package binarySearch.revision;
public class squareRoot {
    public static void main(String[] args) {
        int n = 28;  // find sqrt of this number
        int low = 1;
        int high = n;
        int sqr = 0;

        while(low <= high){
            int mid = (low + high) / 2;
            if(mid * mid <= n){
                sqr = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println("Square root of " + n + " = " + sqr);
    }
}
