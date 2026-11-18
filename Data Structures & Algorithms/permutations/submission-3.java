class Solution {
    public void per(int[] nums,List<Integer>list,List<List<Integer>>ans)  {
        int n = nums.length;
        if (list.size()==n) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i=0;i<nums.length;i++) {
            if (list.contains(nums[i]))  continue;
            else {
                list.add(nums[i]);
                per(nums,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        per(nums,list,ans);
        return ans;
    }
}
