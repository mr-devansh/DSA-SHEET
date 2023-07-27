class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        int i = 0;
        while (i < n) {
            // If the current element is equal to X, return its index
            if (arr[i] == X) {
                return i;
            }

            // Calculate the absolute difference between the current element and X
            int diff = Math.abs(arr[i] - x);

            // Calculate the number of steps required to reach X from the current element
            int steps = diff / K;

            // If steps is greater than 0, move i by steps to avoid unnecessary comparisons
            if (steps > 0) {
                i += steps;
            } else {
                i += 1;
            }
        }

        // If the element is not found, return -1
        return -1;
    }
}
