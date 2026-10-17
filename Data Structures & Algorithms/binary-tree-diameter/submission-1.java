/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// class Solution {
//     public int solve(TreeNode root,int[] res) {
//         if (root==null)  return 0; //BC
//         int left = solve(root.left,res);
//         int right = solve(root.right,res); //hypothesis

//         int temp = 1 + Math.max(left,right);
//         int ans = Math.max(temp,1+left+right);
//         res[0] = Math.max(ans,res[0]);
//         return temp;//induction
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         //int res = Integer.MIN_VALUE;
//         int [] res = {0};
//         solve(root,res);
//         return res[0];
//     }
// }



class Solution {
    public int solve(TreeNode root, int[] res) {
        if (root == null) return 0;

        int left = solve(root.left, res);
        int right = solve(root.right, res);

        int temp = 1 + Math.max(left, right);
        int ans = Math.max(temp, 1 + left + right);

        res[0] = Math.max(ans, res[0]);

        return temp;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = {0};

        solve(root, res);

        return res[0]-1;
    }
}
