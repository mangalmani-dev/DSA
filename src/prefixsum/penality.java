package prefixsum;

public class penality {
    public static void main(String[] args) {
        String str = "YYNY";
        int n = str.length();
        // calculate total no of N till now
        int [] pre = new int[n+1];
        for (int i = 1; i <=n ; i++) {
          pre[i]= pre[i-1];
          if(str.charAt(i-1)=='N')pre[i]++;
        }
        // count no of y aftre closing
        int [] suff = new int[n+1];
        for (int i = n-1; i >=0 ; i--) {
            suff[i]= suff[i+1];
            if(str.charAt(i)=='Y')suff[i]++;
        }
        int minpenality  = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i <= n; i++) {
            int penality = pre[i]+suff[i];
            if(penality < minpenality){
                minpenality = penality;
                ans = i;
            }
        }
        System.out.println(ans);

    }
}
