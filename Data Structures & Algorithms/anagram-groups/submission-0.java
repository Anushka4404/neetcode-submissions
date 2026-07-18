class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> res = new HashMap<>();
        for (String s:strs) {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedS = new String(ch);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
