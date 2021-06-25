package com.liziba.hot100.lengthOfLongestSubstring;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * <p>
 *  最长子串
 *
 * 问题描述:
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 *
 * 提示：
 * 0 <= s.length <= 5 * 104 
 * s由英文字母、数字、符号和空格组成
 *
 *
 * 示例1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 *     请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 *
 * 示例 4:
 * 输入: s = ""
 * 输出: 0
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </p>
 *
 * @Author: Liziba
 * @Date: 2021/6/25 17:12
 */
public class LengthOfLongestSubstring {

//    public int lengthOfLongestSubstring(String s) {
//
//        char[] chars = s.toCharArray();
//        List<String> max = new ArrayList<>();
//        List<String> tmp = new ArrayList<>();
//
//        for (int i = 0; i < chars.length; i++) {
//            String c = String.valueOf(chars[i]);
//            if (tmp.size() > max.size()) {
//                max = new ArrayList<>(tmp);
//            }
//
//            if (tmp.contains(c)) {
//                int index = tmp.indexOf(c);
//                for (int j = 0; j <= index; j++) {
//                    tmp.remove(j);
//                }
//            }
//
//            tmp.add(c);
//        }
//
//        return Math.max(tmp.size(), max.size());
//    }


    public static void main(String[] args) {
        String str = "pwwkew";
        int i = lengthOfLongestSubstring(str);
        System.out.println(i);
    }

    private static int lengthOfLongestSubstring(String s) {

        char[] array = s.toCharArray();

        int i=0,j=0,len=0;
        while (j < array.length) {
            for (int k = i; k < j; k++) {
                if (array[k] == array[j])
                    i = k + 1;
            }
            j++;
            len = Math.max(len, j-i);
        }

        return len;
    }

//    public static int lengthOfLongestSubstring(String s) {
//
//        // 定义128的int数组，能够存放下ASCII码表的全部字符 0-127
//        int[] m = new int[128];
//        int len = 0;
//        for (int i = 0,j = 0; j < s.length(); j++) {
//            i = Math.max(m[s.charAt(j)], i);
//            len = Math.max(len, j-i+1);
//            m[s.charAt(j)] = j + 1;
//        }
//        return len;
//    }


}
