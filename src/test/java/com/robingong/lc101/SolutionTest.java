package com.robingong.lc101;

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
    public void isSymmetric() {
        TreeNode root = TreeNodeUtil.build(1, 2, 2, 3, 4, 4, 3);
        Assert.assertTrue(solution.isSymmetric(root));

        root = TreeNodeUtil.build(1, 2, 2, null, 3, null, 3);
        Assert.assertFalse(solution.isSymmetric(root));
    }

    @Test
    public void emptyCase() {
        Assert.assertTrue(solution.isSymmetric(null));
    }
}