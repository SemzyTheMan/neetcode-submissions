class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoNumbers = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    twoNumbers[0] = i;
                    twoNumbers[1] = j;
                    break;
                }
            }
        }
        return twoNumbers;
    }
}
