class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();

        List<String> reArranged = new ArrayList<>();

        for (String s : strs) {
            char[] strChar = s.toCharArray();
            Arrays.sort(strChar);
            reArranged.add(new String(strChar));
        }

        for (int i = 0; i < reArranged.size(); i++) {
            grouped.computeIfAbsent(reArranged.get(i), k -> new ArrayList<>()).add(strs[i]);
        }

        List<List<String>> finalOutput = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : grouped.entrySet()) {
            finalOutput.add(entry.getValue());
        }

        return finalOutput;
    }
}
