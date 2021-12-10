package cn.leetcode;

/**
 * 7.整数反转
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-10
 */
public class LeetCode7 {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        long n = 0;
        while(x != 0){
            n = n*10 + x%10;
            x = x / 10;
        }
        return (int) n==n ? (int)n:0;
    }
}
