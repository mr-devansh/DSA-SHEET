class Solution
{
    public boolean findPair(int arr[], int L, int N)
    {
        Arrays.sort(arr);
        int l =0;
        int r =1;
        while(l<L && r<L){
            if(l!=r && (arr[l]-arr[r]==N || arr[r]-arr[l]==N)){
                return true;
            }
            else if(arr[r] - arr[l] < N){
                r++;
            }
            else{
               l++;
            }
        }
        return false;
    }
}
