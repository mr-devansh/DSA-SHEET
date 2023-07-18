class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int l = 0;
        long ans = Integer.MAX_VALUE;
        while(l+m-1<n){
            ans = Math.min(ans, (a.get(l+m-1)-a.get(l)));
            l++;
        }
        return ans;
    }
}
