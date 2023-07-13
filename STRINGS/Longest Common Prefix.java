class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String i = strs[0];
        String j = strs[strs.length-1];

        int z = 0;
        while(z<i.length() && z<j.length()){
            if(i.charAt(z)==j.charAt(z)){
                z++;
            }
            else{
                break;
            }
        }
        return i.substring(0, z);
    }
}
