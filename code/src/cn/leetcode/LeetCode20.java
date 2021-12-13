package cn.leetcode;

import java.util.Stack;

/**
 * 20.有效括号
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-13
 */
public class LeetCode20 {

    public static void main(String[] args) {
        System.out.println(isValid("("));
    }
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        //使用栈 压栈出栈
        Stack<Character> stack = new Stack<>();
        for(char a : s.toCharArray()){
            if(a == '('){
                stack.push(')');
            }else if(a == '{'){
                stack.push('}');
            }else if(a == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=a){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
