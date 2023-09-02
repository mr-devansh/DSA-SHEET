class Solution
{
    static void radixSort(int arr[], int n) 
    { 
        int max = Integer.MIN_VALUE;
        // code here 
        for(int i = 0; i< n; i++){
            max=Math.max(max, arr[i]);
        }
        int temp[] = new int[max+1];
        for(int i =0; i<n; i++){
            temp[arr[i]]++;
        }
        int count = 0;
        for(int i =0; i<temp.length; i++){
            if(temp[i]>0){
                while(temp[i]!=0){
                    arr[count++]=i;
                    temp[i]--;
                }
            }
        }
    } 
}
