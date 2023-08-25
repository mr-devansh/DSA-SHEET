class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> ll = new HashSet<>();
        for(int i =0; i< nums.length -2; i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int temp = nums[i]+nums[l]+nums[r];
                if(temp==0){
                    ll.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                }
                else if(temp<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return new ArrayList<>(ll);
    }
}
