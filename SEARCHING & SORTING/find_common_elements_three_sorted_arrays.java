class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int prev = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {
            // If A[i] == B[j] == C[k], add to the list and move all three pointers.
            if (A[i] == B[j] && B[j] == C[k]) {
                // Check for duplicates
                if (A[i] != prev) {
                    list.add(A[i]);
                    prev = A[i];
                }
                i++;
                j++;
                k++;
            } else if (A[i] <= B[j] && A[i] <= C[k]) {
                // Move the pointer in the smallest array
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
