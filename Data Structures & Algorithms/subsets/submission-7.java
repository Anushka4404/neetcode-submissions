class Solution {
    public void seq(int ind,List<Integer>list,int[] nums, List<List<Integer>>ans) {
       
        int n = nums.length;
        if (ind>=n) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[ind]);
        seq(ind+1,list,nums,ans);

        list.remove(list.size()-1);
        seq(ind+1,list,nums,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        seq(0,list,nums,ans);
        return ans;
    }
}
