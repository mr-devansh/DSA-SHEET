class Solution {
    public static void print(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int temp[] = new int[n];
        for(int i =0; i< n; i++){
            temp[arr[i]]++;
        }
        for(int i =0; i<n; i++){
            if(temp[i]>1){
                ans.add(i);
            }
        }
        // print(arr);
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }
}
