class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freqCounter = new HashMap<>();
        boolean containsDuplicate = false;
        for (Integer num : nums) {
            freqCounter.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqCounter.entrySet()) {
            if (entry.getValue() > 1) {
                containsDuplicate = true;
            }
        }

        return containsDuplicate;
    }
}