class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<str.length();i++){
            sb.append(s.pop());
        }
        return sb.toString();
    }
}
