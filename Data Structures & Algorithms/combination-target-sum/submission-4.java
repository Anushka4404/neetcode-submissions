class Solution {
    public void subsets(int[] nums,int target,int ind,List<Integer>ds,List<List<Integer>>ans)  {
        int n = nums.length;
        if (ind==n) {
            if (target==0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (nums[ind]<=target) {
            ds.add(nums[ind]);
            subsets(nums,target-nums[ind],ind,ds,ans);
            ds.remove(ds.size()-1);
        }
        subsets(nums,target,ind+1,ds,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        subsets(nums,target,0,new ArrayList<>(),ans);
        return ans;
    }
}
