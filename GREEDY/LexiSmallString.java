package Greedy;

import java.util.Arrays;

public class LexiSmallString {
    public static void main(String[] args) {
        int N = 5, K = 42;
        
        char arr[] = new char[N];
        Arrays.fill(arr, 'a');
        for (int i = N-1; i >= 0; i--) {
            K-=i;
            if (K>=0) {
                if (K>=26) {
                    arr[i]='z';
                    K-=26;
                }
                else{
                    arr[i] = (char)(K+97-1);
                    K-=arr[i]-'a'+1;
                }
            }
            else{
                break;
            }
            K+=1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
