class Solve {
    int getCeil(int[] arr, int n, int x){
        int l =0; 
        int r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(x==arr[mid]){
                return arr[mid];
            }
            else if(arr[mid]<x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        if(l<n){
            return (arr[l]);
        }
        else{
            return -1;
        }
    }
    int getFloor(int[] arr, int n, int x){
        int l =0; 
        int r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(x==arr[mid]){
                return arr[mid];
            }
            else if(arr[mid]<x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        if(r>=0){
            return (arr[r]);
        }
        else{
            return -1;
        }
    }
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        
        Arrays.sort(arr);
        return new Pair(getFloor(arr,n,x), getCeil(arr,n,x));
        
    }
}
