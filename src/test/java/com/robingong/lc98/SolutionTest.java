package com.robingong.lc98;

import com.robingong.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void isValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Assert.assertTrue(solution.isValidBST(root));

        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        Assert.assertFalse(solution.isValidBST(root));
    }

    @Test
    public void emptyCase() {
        Assert.assertTrue(solution.isValidBST(null));
    }

    @Test
    public void equalCase() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        Assert.assertFalse(solution.isValidBST(root));
    }
}