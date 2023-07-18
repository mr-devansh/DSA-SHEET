public class findIndex {
    public static int search(int[] arr, int l, int r, int key) {
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid] > key){ 
                r = mid-1; 
            } else{ 
                l = mid+1; 
            } 
        }
        return -1;
    }
    public static int search(int arr[], int key) {
        int pivot = minSearch(arr);
        int n = arr.length-1;
        if(key>=arr[0] && key<pivot){
            return search(arr, 0, pivot, key);
        }else{
            return search(arr, pivot, n, key);
        }
    }
    public static int minSearch(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int mid = l +(r-l)/2;
            if(mid>0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[mid]>=arr[l] && arr[mid]>arr[r]){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int arr1[] = {4,5,6,7,0,1,2};    
        int key = 0;
        System.out.println(search(arr1,key));
    }
}