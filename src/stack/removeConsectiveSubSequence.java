package stack;

import java.util.Stack;

public class removeConsectiveSubSequence {

    public static int[] remove(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            }

            else if (arr[i] == st.peek()) {

                // skip all consecutive duplicates
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }

                st.pop();   // remove previous element
            }
        }

        int[] brr = new int[st.size()];
        int m = brr.length;

        for (int i = m - 1; i >= 0; i--) {
            brr[i] = st.pop();
        }

        return brr;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};

        int[] ans = remove(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
