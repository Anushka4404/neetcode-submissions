class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums,0);
        return list;
    }
    private void backtrack(List<List<Integer>>list,List<Integer>tempSet,int[] nums,int start) {
        list.add(new ArrayList<>(tempSet));
        for (int i=start;i<nums.length;i++) {
            tempSet.add(nums[i]);

            backtrack(list,tempSet,nums,i+1);

            tempSet.remove(tempSet.size()-1);
        }
    }
}
