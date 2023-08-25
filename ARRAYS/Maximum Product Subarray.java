class Solution {
public int maxProduct(int[] nums) {
    int ans = nums[0];
    int left = 1;
    int right = 1;
    for(int i = 0; i<nums.length; i++){
        left = left == 0? 1:left;
        right = right == 0? 1:right;
        left*=nums[i];
        right*=nums[nums.length-i-1];
        ans = Math.max(left, Math.max(right, ans));
    }
    return ans;
} 
}
