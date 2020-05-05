package com.robingong.lc14;

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
    public void normanCheck() {
        String[] fl = {"flower", "flow", "flight"};
        String[] empty = {"dog", "racecar", "car"};
        String[] a = {"a"};
        String[] bb = {"bb", "bb"};

        Assert.assertEquals("fl", solution.longestCommonPrefix(fl));
        Assert.assertEquals("", solution.longestCommonPrefix(empty));
        Assert.assertEquals("a", solution.longestCommonPrefix(a));
        Assert.assertEquals("bb", solution.longestCommonPrefix(bb));

    }

    @Test
    public void emptyCheck() {
        String[] empty = {};
        Assert.assertEquals("", solution.longestCommonPrefix(null));
        Assert.assertEquals("", solution.longestCommonPrefix(empty));
    }

}