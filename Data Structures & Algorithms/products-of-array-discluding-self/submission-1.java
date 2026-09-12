class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        results[0] = 1;
        for (int i = 1; i < n; i++) {
            results[i] = results[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            results[i] = results[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return results;
    }
}
