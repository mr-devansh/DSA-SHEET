class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(arr.length==1){
            return arr[0];
        }
        
        int ex[] = new int[arr.length];
        ex[0] = arr[0];
        ex[1] = Math.max(ex[0], arr[1]);
        for(int i =2; i<arr.length ;i++){
            ex[i] = Math.max(arr[i]+ex[i-2], ex[i-1]);
        }
        return ex[arr.length-1];
    }
}
