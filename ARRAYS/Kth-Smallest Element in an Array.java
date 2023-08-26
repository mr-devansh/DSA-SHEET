class Solution{
    public static int kthSmallest(int[] nums, int l, int r, int k) 
    { 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] < minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        
        return minHeap.peek();
    } 
}
