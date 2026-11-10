class Solution {
    public void combiSum(int[] nums,int target,int ind,List<List<Integer>>ans,List<Integer>list) {
        int n = nums.length;
        if (target==0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i=ind;i<nums.length;i++) {
            if (i>ind && nums[i]==nums[i-1])  continue;
            if (nums[i]>target)  break;
            list.add(nums[i]);
            combiSum(nums,target-nums[i],i+1,ans,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        Arrays.sort(candidates);
        combiSum(candidates,target,0,ans,list);
        return ans;
    }
}
