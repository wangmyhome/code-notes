package cn.leetcode;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

/**
 *
 * 回文数
 *
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-11
 */
public class LeetCode9 {


    public static void main(String[] args) {
        System.out.println(isPalindrome2(123454321));
    }

    public static boolean isPalindrome(int x) {
        boolean r = false;
        if(x >= 0){
            if(x/10 == 0){
                return true;
            }
            String s = String.valueOf(x);
            int length = s.length()/2;
            for(int i = 0; i < length;i++){
                String s1 = s.substring(i,i+1);
                String s2 = s.substring(s.length() - i-1,s.length() - i);
                if(s1.equals(s2)){
                    r = true;
                }else {
                    r = false;
                    break;
                }
            }
        }
        return r;
    }
    public static boolean isPalindrome2(int x) {
        if(x < 0 ) {
            return false;
        }
        int r = 0;
        int t = x;
        //整数反转
        while(x > 0){
            r = r*10 + x % 10;
            x = x/10;
        }
        return r == t;
    }
}
