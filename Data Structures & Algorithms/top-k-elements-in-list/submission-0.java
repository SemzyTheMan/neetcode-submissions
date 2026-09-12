class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqCounter = new HashMap<>();
        int[] results = new int[k];
        for (int num : nums) {
            freqCounter.compute(num, (key, v) -> v == null ? 1 : v + 1);
        }

        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqCounter.entrySet());

        freqList.sort((a, b) -> b.getValue() - a.getValue());

        List<Integer> values = new ArrayList<>();
        List<Integer> keys = new ArrayList();

        for (Map.Entry<Integer, Integer> entry : freqList) {
            values.add(entry.getValue());
            keys.add(entry.getKey());
        }
        for (int i = 0; i < k; i++) {
            results[i] = keys.get(i);
        }
        Arrays.sort(results);
        return results;
    }
}
