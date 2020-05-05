package com.robingong.common;

import java.util.Arrays;
import java.util.List;

public class TreeNodeUtil {

    public static TreeNode build(Integer... ints) {
        return buildSub(Arrays.asList(ints), 0);
    }

    private static TreeNode buildSub(List<Integer> list, int i) {
        if (i >= list.size() || list.get(i) == null) return null;
        TreeNode root = new TreeNode(list.get(i));
        root.left = buildSub(list, i * 2 + 1);
        root.right = buildSub(list, i * 2 + 2);
        return root;
    }

}
