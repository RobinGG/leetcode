package com.robingong.lc14;


/**
 * 14. 最长公共前缀
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String result = "";
        String tmp = "";
        boolean found = false;
        for (int i = 0; i <= strs[0].length(); i++) {
            tmp = strs[0].substring(0, i);
            for (String str : strs) {
                if (str.length() < i || !tmp.equals(str.substring(0, i))) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
            result = tmp;
        }
        return result;
    }
}
