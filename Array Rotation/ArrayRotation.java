import java.util.Arrays;

public class ArrayRotation {
    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
       
        reverse(arr, d, n - 1);
    }

    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int d = 3; // Number of positions to rotate

        System.out.println("Original Array: " + Arrays.toString(array));
        rotateRight(array, d);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }
}
