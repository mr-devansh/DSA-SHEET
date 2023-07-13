class Solution{
    public String removeConsecutiveCharacter(String S){
        int n = S.length();
        String ans = "";
        for(int i  = 0 ; i < n; i++){
            if(i<n-1 && S.charAt(i)==S.charAt(i+1)){
                continue;
            }
            else{
                ans+=S.charAt(i);
            }
        }
        return ans;
    }
}
