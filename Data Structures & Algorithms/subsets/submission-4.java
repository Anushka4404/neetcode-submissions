class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>>resultList = new ArrayList<>();
        backtrack(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }
    private void backtrack(List<List<Integer>>resultList, List<Integer>temp, int[] nums,int start) {
        resultList.add(new ArrayList<>(temp));
        for (int i=start;i<nums.length;i++) {
            temp.add(nums[i]);
            backtrack(resultList,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
