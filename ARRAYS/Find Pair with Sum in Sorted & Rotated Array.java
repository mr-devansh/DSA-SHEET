import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean findPairSum(int[] arr, int target) 
	{
		// Write your code here
		int n = arr.length;
		int i;
		for(i = 0; i< n-1; i++){
			if(arr[i]>arr[i+1]){
				break;
			}
		}
		int l = (i+1)%n;
		int r = i;
		while(l!=r){
			int sum = arr[l]+arr[r];
			if(sum==target)
				return true;
			if(sum<target){
				l = (l+1)%n;
			}
			else{
				r = (n+r-1)%n;
			}
		}
		return false;
	}
}
