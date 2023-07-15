class Solution {

    public String getStringFreq(String str){
        int freq[] = new int[26];
        for(Character c : str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder ans= new StringBuilder("");
        for(int i = 0; i<26; i++){
            if(freq[i]>0){
                ans.append(i+'a');
                ans.append(freq[i]);
            }
        }
        return ans.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String stringFreq = getStringFreq(str);

            if(map.containsKey(stringFreq)){
                map.get(stringFreq).add(str);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(stringFreq, newList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
