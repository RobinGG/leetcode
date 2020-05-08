package com.robingong.lc951;

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
    public void flipEquiv() {
        TreeNode root1 = TreeNodeUtil.build(1, 2, 3, 4, 5, 6, null, null, null, 7, 8);
        TreeNode root2 = TreeNodeUtil.build(1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7);
        Assert.assertTrue(solution.flipEquiv(root1, root2));
        root1 = TreeNodeUtil.build(0, 3, 1, null, null, null, 2);
        root2 = TreeNodeUtil.build(0, 3, 1, 2);
        Assert.assertTrue(solution.flipEquiv(root1, root2));
    }
}