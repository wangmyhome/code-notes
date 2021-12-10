package cn.leetcode;

import java.util.Arrays;

/**
 * 6.Z字形转换
 * 思路： 放入三个数组中然后拼接成结果字符串
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-09
 */
public class LeetCode6 {

    public static void main(String[] args) {
        System.out.println(convert("LDREOEIIECIHNTSG", 3));
    }

    /**
     *
     * @param s 请求字符串
     * @param numRows Z的层级
     *
     * @return
     */
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");
        char[] chars = s.toCharArray();
        int len = chars.length;
        int period = numRows * 2 - 2;
        for (int i = 0; i < len; i++) {
            int mod = i % period;
            if (mod < numRows) {
                arr[mod] += chars[i];
            } else {
                arr[period - mod] += String.valueOf(chars[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        for (String ch : arr) {
            res.append(ch);
        }
        return res.toString();
    }
}
