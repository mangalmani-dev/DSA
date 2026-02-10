package sorting.mergeSort;

public class inversionCount {
    static  int count ;
    public static void print(int []arr){
        for (int ele :arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void merge(int [] a, int [] b , int [] c){
        int i =0 , j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else    c[k++]=b[j++];
        }
        while(j<b.length)   c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];
    }
public static void inversion(int [] a , int [] b){
        int i =0;
        int j=0;
        while (i<a.length  && j<b.length){
            if(a[i]>b[j]) {
                count += (a.length - i);
                j++;
            }
                i++;

        }
}
    public static void mergesort(int [] arr){
        int n = arr.length;

        if(n==1)return;
        // create two array
        int [] a = new int[n/2];
        int [] b = new int[n-n/2];
        // copy pasting the element in two array
        for (int i = 0; i < n/2; i++) {
            a[i]=arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i]=arr[i+n/2];
        }

        // magic
        mergesort(a);
        mergesort(b);
        inversion(a,b);

        // merge a and b
        merge(a,b,arr);

        a=null;
        b=null;

    }

    public static void main(String[] args) {
        int [] arr = {80,30,70,20,10,50,40,60};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
