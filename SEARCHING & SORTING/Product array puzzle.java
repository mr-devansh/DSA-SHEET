class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
	    if(n==1){
	        long ans[] = {1};
	        return ans;
	    }
	    long ans[] = new long[n];
        // code here
        long l[] = new long[n];
        l[0]=arr[0];
        for(int i = 1; i < n ;i++){
            l[i]=l[i-1]*arr[i];
        }
        
        long r[] = new long[n];
        r[n-1]=arr[n-1];
        for(int i = n-2; i >=0 ;i--){
            r[i]=r[i+1]*arr[i];
        }
        
        ans[0] = r[1];
        ans[n-1] = l[n-2];
        for(int i = 1; i<n-1; i++){
            ans[i] = l[i-1]*r[i+1];
        }
        return ans;
	} 
} 
