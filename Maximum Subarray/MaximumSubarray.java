public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum); // Output: 6
    }

    public static int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Update maxCurrent to include current element or start new from current element
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            
            // Update maxGlobal if maxCurrent is greater
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }
}
