package com.robingong.lc100;

import com.robingong.common.TreeNode;
import com.robingong.common.TreeNodeUtil;
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
        TreeNode p = TreeNodeUtil.build(1, 2, 3);
        TreeNode q = TreeNodeUtil.build(1, 2, 3);
        Assert.assertTrue(solution.isSameTree(p, q));

        p = TreeNodeUtil.build(1, 2);
        q = TreeNodeUtil.build(1, null, 2);
        Assert.assertFalse(solution.isSameTree(p, q));

        p = TreeNodeUtil.build(1, 2, 1);
        q = TreeNodeUtil.build(1, 1, 1);
        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void emptyCase() {
        TreeNode p = new TreeNode(1);
        TreeNode q = null;
        Assert.assertFalse(solution.isSameTree(p, q));
    }
}