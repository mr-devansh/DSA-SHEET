// Approach using Set
// We use a set (charSet) to keep track of unique characters in the current substring.
// We maintain two pointers, left and right, to represent the boundaries of the current substring.
// The maxLength variable keeps track of the length of the longest substring encountered so far.
// We iterate through the string using the right pointer.
// If the current character is not in the set (charSet), it means we have a new unique character.
// We insert the character into the set and update the maxLength if necessary.
// If the character is already present in the set, it indicates a repeating character within the current substring.
// In this case, we move the left pointer forward, removing characters from the set until the repeating character is no longer present.
// We insert the current character into the set and continue the iteration.
// Finally, we return the maxLength as the length of the longest substring without repeating characters.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        Set<Character> hash = new HashSet<>();
        int left = 0;

        for(int right = 0; right < n; right++){
            if(!hash.contains(s.charAt(right))){
                hash.add(s.charAt(right));
                maxlen = Math.max(maxlen, right-left+1);
            }
            else{
                while(hash.contains(s.charAt(right))){
                    hash.remove(s.charAt(left));
                    left++;
                }
                hash.add(s.charAt(right));
            }
        } 
        return maxlen;
    }
}
