class Solution {
    public static int evaluatePostFix(String S) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while (i < S.length()) {
            char ch = S.charAt(i);
            if (Character.isDigit(ch)) {
                s.push(Character.getNumericValue(ch));
            } else {
                int a1 = s.pop();
                int a2 = s.pop();
                int ans;
                switch (ch) {
                    case '+':
                        ans = a2 + a1;
                        break;
                    case '-':
                        ans = a2 - a1;
                        break;
                    case '*':
                        ans = a2 * a1;
                        break;
                    case '/':
                        ans = a2 / a1;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }
                s.push(ans);
            }
            i++;
        }
        return s.pop();
    }
}
       
