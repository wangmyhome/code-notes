package cn.leetcode;

import com.sun.tools.javac.util.StringUtils;

import java.util.Arrays;

/**
 *
 * 66. 加一
 *
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-06
 */
public class LeetCode66 {

    public static void main(String[] args) {
        int [] a = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        a = plusOne(a);
        System.out.println(a);
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int [digits.length+1];
        digits[0] = 1;
        return digits;
    }

}
