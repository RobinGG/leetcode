package com.robingong.lc100;

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
    public void normalCase() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        Assert.assertTrue(solution.isSameTree(p, q));

        p.right = null;
        q.left = null;
        q.right = new TreeNode(2);
        Assert.assertFalse(solution.isSameTree(p, q));

        p.right = new TreeNode(1);
        q.left = new TreeNode(1);
        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void emptyCase() {
        TreeNode p = new TreeNode(1);
        TreeNode q = null;
        Assert.assertFalse(solution.isSameTree(p, q));
    }
}