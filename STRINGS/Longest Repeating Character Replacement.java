class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int n = s.length();
        int maxLen = 0;
        int maxCount = 0;
        int[] charCount = new int[26];
        
        for(int right = 0; right<n; right++){
            charCount[s.charAt(right)-'A']++;
            
            int currCharCount = charCount[s.charAt(right)-'A'];
            maxCount = Math.max(maxCount, currCharCount);
            while(right-left-maxCount+1>k){
                charCount[s.charAt(left )-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
