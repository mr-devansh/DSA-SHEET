class Solution {

public int maxProduct(int[] nums) {
    int ans = Integer.MIN_VALUE;
    int curr = 1;
    int n = nums.length;
    for(int i  = 0 ; i < n;i++){
        curr*=nums[i];
        ans = Math.max(ans, curr);
        if(curr==0)
            curr = 1;
    }
    curr = 1;
    for(int j = n-1 ; j >=0;j--){
        curr*=nums[j];
        ans = Math.max(ans, curr);
        if(curr==0)
            curr = 1;
    }
    return ans;
} 
}



        
