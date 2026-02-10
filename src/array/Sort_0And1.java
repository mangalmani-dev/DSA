package array;

public class Sort_0And1 {
    public static void main(String[] args) {
        int [] arr= {0,1,0,1,0,1,0,0,1,1};
        int noofzero=0;
        int noofOne=0;
        int n = arr.length;

        for (int i = 0; i <n ; i++) {
             if(arr[i]==0){
                 noofzero++;
             }
             else {
                 noofOne++;
             }
        }
        System.out.println("no of zero is :"+ noofzero);
        System.out.println("no of one's is :"+ noofOne);

//        for (int i = 0; i < noofzero; i++) {
//            arr[i]=0;
//        }
//        for (int i = noofzero; i <n ; i++) {
//            arr[i]=1;
//        }

        //   Two pass solutions  more optimized
        for (int i = 0; i < n; i++) {
            if(i<noofzero){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }



        for (int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
