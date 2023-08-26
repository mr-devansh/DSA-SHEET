class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int N = arr.length;
        Set<Integer> s = new TreeSet<Integer>();
        for (int i = 0; i < N; i++)
            s.add(arr[i]);
        Iterator<Integer> itr = s.iterator();
        while (k > 1) {
            itr.next();
            k--;
        }
        return itr.next();
    } 
}
