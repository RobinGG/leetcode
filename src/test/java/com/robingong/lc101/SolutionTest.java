package com.robingong.lc101;

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
    public void isSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        Assert.assertTrue(solution.isSymmetric(root));

        root.left.left = null;
        root.left.right = new TreeNode(3);
        root.right.left = null;
        root.left.right = new TreeNode(3);
        Assert.assertFalse(solution.isSymmetric(root));
    }

    @Test
    public void emptyCase() {
        Assert.assertTrue(solution.isSymmetric(null));
    }
}