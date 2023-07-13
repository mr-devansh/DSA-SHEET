class Solution 
{ 
    String printSequence(String S) 
    { 
        String str[]
            = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
                
        String output = "";

        // length of input string
        int n = S.length();
        
        for(int i = 0; i<n; i++){
            Character z = S.charAt(i);
            if(z==' '){
                output+=0;
            }
            else{
                output+=str[z-'A'];
            }
        }
        return output;
    }
}
