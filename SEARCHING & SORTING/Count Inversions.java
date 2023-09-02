class Solution
{
    public static long merge(long arr[], long temp[], int left, int mid, int right){
        long count=0;
        int i=left, j=mid, k=left;
        while((i<=mid-1)&&(j<=right)){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                count=count+(mid-i);
            }
        }
        while(i<=mid-1){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }
        for(i = left; i<=right; i++){
            arr[i] = temp[i];
        }
        return count;
    }
    public static long mergesort(long arr[], long temp[], int left, int right){
        int mid=0;
        long count = 0;
        if(right>left){
            mid = (right+left)/2;
            count+=mergesort(arr, temp, left, mid);
            count+=mergesort(arr, temp, mid+1, right);
            count+=merge(arr, temp, left, mid+1, right);
        }
        return count;
    }
    static long inversionCount(long arr[], long N)
    {
        long temp[] = new long[arr.length];
        return mergesort(arr, temp, 0, arr.length-1);
    }
}
