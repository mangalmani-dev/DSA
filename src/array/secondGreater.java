package array;

public class secondGreater {
    public static void main(String[] args) {
        int [] arr= {10,24,47,97,75,100,500};
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
             max =Math.max(arr[i],max);
        }
        System.out.println(max);
        int smx =Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i]!=max){
                smx= Math.max(smx,arr[i]);
            }
        }
        System.out.println(smx);

    }
}
