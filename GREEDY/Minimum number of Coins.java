class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        int notes[]= { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        // Arrays.sort(notes);
        int i = notes.length-1;
        List<Integer> ans = new ArrayList<>();
        
        while(N!=0){
            if(N>=notes[i]){
                while(N>=notes[i]){
                    ans.add(notes[i]);
                    N-=notes[i];
                }
            }
            else{
                i--;
            }
        }
        return ans;
    }
}
