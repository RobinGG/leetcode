package com.robingong.lc404;

import com.robingong.common.TreeNode;

/**
 * 计算给定二叉树的所有左叶子之和。
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int leftSum = 0;
        if (root.left == null) leftSum = 0;
        else if (root.left.left == null && root.left.right == null) leftSum = root.left.val;
        else leftSum = sumOfLeftLeaves(root.left);
        return leftSum + sumOfLeftLeaves(root.right);
    }
}
