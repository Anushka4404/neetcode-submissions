class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>>set = new HashSet<>();
        Arrays.sort(nums);
        backtrack(set,new ArrayList<>(),nums,0);
        return new ArrayList<>(set);
    }
    private void backtrack(Set<List<Integer>>set, List<Integer>temp,int[] nums,int start) {
        set.add(new ArrayList<>(temp));
        for (int i=start;i<nums.length;i++) {
            temp.add(nums[i]);
            backtrack(set,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
