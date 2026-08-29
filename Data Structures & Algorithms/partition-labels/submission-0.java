class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        HashMap<Character,Integer>lastIndex = new HashMap<>();
        for (int i=0;i<n;i++) {
            lastIndex.put(s.charAt(i),i);
        }
        int size=0,end=0;
        List<Integer>res = new ArrayList<>();
        for (int i=0;i<n;i++) {
            size++;
            end = Math.max(end,lastIndex.get(s.charAt(i)));

            if (i==end) {
                res.add(size);
                size=0;
            }
        }
        return res;
    }
}
