package com.robingong.lc98;

import com.robingong.common.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValidBST(root.left) && isValidBST(root.right) && smallerThanMin(root.right, root.val) && largerThanMax(root.left, root.val);
    }

    private boolean smallerThanMin(TreeNode root, int val) {
        if (root == null) return true;
        return val < root.val && smallerThanMin(root.left, val);
    }

    private boolean largerThanMax(TreeNode root, int val) {
        if (root == null) return true;
        return val > root.val && largerThanMax(root.right, val);
    }

}
