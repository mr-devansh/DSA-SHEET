
class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int prevA = Integer.MIN_VALUE, prevB = Integer.MIN_VALUE, prevC = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (A[i] != prevA) {
                    list.add(A[i]);
                    prevA = A[i];
                    prevB = B[j];
                    prevC = C[k];
                }
                i++;
                j++;
                k++;
            } else if (A[i] <= B[j] && A[i] <= C[k]) {
                i++;
            } else if (B[j] <= A[i] && B[j] <= C[k]) {
                j++;
            } else {
                k++;
            }
        }
        return list;
    }
}
