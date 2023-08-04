class Solution {
    
    public static long minSum(int arr[], int n)
    {
        long n1 = 0;
        long n2 = 0;
        // Your code goes here
        Arrays.sort(arr);
        for(int i =0; i<n; i++){
            if(i%2==0){
                n1 = n1*10+arr[i];
            }else{
                n2 = n2*10+arr[i];
            }
        }
        return n1+n2;
    }
}
