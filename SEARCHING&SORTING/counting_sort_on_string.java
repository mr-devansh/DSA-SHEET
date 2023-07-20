class Solution {
    public static String countSort(String arr) {
        int[] ar = new int[26];
        
        for (int i = 0; i < arr.length(); i++) {
            ar[arr.charAt(i) - 'a']++;
        }
        
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < ar.length; i++) {
            while (ar[i] > 0) {
                ans.append((char) (i + 'a'));
                ar[i]--;
            }
        }
        return ans.toString();
    }
}
