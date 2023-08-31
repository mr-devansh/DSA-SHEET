class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long count=0;
        for(int i =0; i<arr.length; i++){
            int l = i+1;
            int r = arr.length-1;
            while(l<r){
                long total = arr[i]+arr[l]+arr[r];
                if(total<sum){
                    count+=r-l;
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return count;
    }
}
