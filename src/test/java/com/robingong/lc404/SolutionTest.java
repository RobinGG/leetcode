package com.robingong.lc404;

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
    public void sumOfLeftLeaves() {
        TreeNode root = new TreeNode(3);
        Assert.assertEquals(0, solution.sumOfLeftLeaves(root));

        root.left = new TreeNode(9);
        Assert.assertEquals(9, solution.sumOfLeftLeaves(root));

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Assert.assertEquals(24, solution.sumOfLeftLeaves(root));
    }

    @Test
    public void emptyCase() {
        Assert.assertEquals(0, solution.sumOfLeftLeaves(null));
    }
}