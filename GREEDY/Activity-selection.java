class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        List<int[]> meetings  = new ArrayList<>();
        for(int i=0;i<n;i++){
            meetings.add(new int[]{start[i] , end[i]});
        }
        Collections.sort(meetings, (a,b) -> a[1] - b[1]);
        
        int nextavail = 0;
        int ans = 0;
        
        for(int[] meeting : meetings){
            if(meeting[0] > nextavail)
            {
            nextavail = meeting[1];
            ans++;}
        }
        
        return ans;
    }
}
