package com.robingong.lc98;

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
    public void isValidBST() {
        TreeNode root = TreeNodeUtil.build(2, 1, 3);
        Assert.assertTrue(solution.isValidBST(root));

        root = TreeNodeUtil.build(5, 1, 4, null, null, 3, 6);
        Assert.assertFalse(solution.isValidBST(root));
    }

    @Test
    public void emptyCase() {
        Assert.assertTrue(solution.isValidBST(null));
    }

    @Test
    public void equalCase() {
        TreeNode root = TreeNodeUtil.build(1, 1);
        Assert.assertFalse(solution.isValidBST(root));
    }
}