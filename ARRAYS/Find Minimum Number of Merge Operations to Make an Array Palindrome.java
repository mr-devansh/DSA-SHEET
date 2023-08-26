static int findMinOps(int[] arr, int n){
        int i = 0;
        int j =n-1;
        int ans = 0;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
            else{
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }
        }
        return ans;
    }
