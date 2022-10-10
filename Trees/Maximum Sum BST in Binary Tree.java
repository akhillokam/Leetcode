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
class Solution {

    int res = Integer.MIN_VALUE; //defining result
    public int maxSumBST(TreeNode root) {
        
         //Call a recursive helper function to compute sum giving root as arguments
        helper(root);

        return res < 0 ? 0 : res;
    }

    //res[0]: min value of subtree
    //res[1]: max value of subtree

    public int[] helper(TreeNode root){
        if(root == null){
            return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0}; //sum is 0 for empty node, MAX_VALUE is minimum value and vice versa
        }

        //compute int arrays for left and right sub tree by calling recursively
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        //check if it is a valid bst by checking max of left sub tree and min of right sub tree like below
        if(left[1] >= root.val || right[0] <= root.val){
            return new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
        }

        //reached here, valid sub tree so adding sum of both sub trees and value of root
        int sum = left[2] + root.val + right[2];

        res = Math.max(res,sum);

        //returning min and max values of sub trees and sum
        return new int[] {Math.min(root.val,left[0]), Math.max(root.val,right[1]), sum};
    }
}