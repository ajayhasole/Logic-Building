class MissingElementArray {
    public static void missingElement(int arr[], int n) {
        // Create an auxiliary array to keep track of the counts
        int arr2[] = new int[n + 1];
        
        // Count the occurrences of each number in the original array
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                arr2[arr[i]]++;
            }
        }
        
        // Find the missing element
        for (int i = 1; i <= n; i++) {
            if (arr2[i] == 0) {
                System.out.println("Missing Element Is = " + i);
                return; // Assuming only one missing element
            }
        }
        
        System.out.println("No missing elements");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6}; // Example array
        int n = arr.length; // Size of the array
        missingElement(arr, n); // Call the method to find the missing element
    }
}
