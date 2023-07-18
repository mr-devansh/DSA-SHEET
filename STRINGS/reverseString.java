public class reverseString {
        public static String reverseString(String input) {
            char[] charArray = input.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
    
            while (left < right) {
                // Swap characters
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
    
                // Move pointers
                left++;
                right--;
            }
    
            return new String(charArray);
        }
    
        public static void main(String[] args) {
            String input = "Hello, World!";
            String reversed = reverseString(input);
            System.out.println(reversed);  // Output: "!dlroW ,olleH"
        }
    }
