public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int [] repeatedNumber(final int[] A) {
        int ans[] = new int[2];
        for(int i = 0; i< A.length; i++){
            if(A[Math.abs(A[i])-1]<0){
                ans[0] = Math.abs(A[i]);
            }
            else{
                A[Math.abs(A[i])-1] = -A[Math.abs(A[i])-1];
            }
        }
        for(int i = 0; i<A.length; i++){
            if(A[i]>0){
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
}
