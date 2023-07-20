
import java.util.Arrays;

class Permutations_in_array
 {
    
    public static void reverse(long[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            long temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    // Check whether any permutation
    // exists which satisfies the condition.
    static boolean isPossible(long a[], long b[], int n, long k) {
        // Sort the array a[] in decreasing order.
        Arrays.sort(b);

        // Sort the array b[] in increasing order.
        Arrays.sort(a);
        reverse(a);


        // Reverse the sorted array a[] to get it in decreasing order.
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }

        return true;
    }
}
