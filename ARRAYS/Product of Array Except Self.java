class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;

        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];
        
        int Lpro = 1;
        for(int i=0;i<n;i++){
            Lpro = Lpro*nums[i];
            left[i] = Lpro;
        }

        int Rpro = 1;
        for(int i=n-1;i>=0;i--){
            Rpro = Rpro*nums[i];
            right[i] = Rpro;
        }

        ans[0] = right[1];
        for(int j =1; j<n-1; j++){
            ans[j] = left[j-1]*right[j+1];
        }
        ans[n-1] = left[n-2];
        return ans;
    }
}
