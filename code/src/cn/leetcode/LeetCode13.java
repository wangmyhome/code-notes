package cn.leetcode;

/**
 *
 * LeetCode13
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-13
 */
public class LeetCode13 {


    public static void main(String[] args) {
        System.out.println(romanToInt("VX"));
    }



    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int num1 = 0,num2 = 0;
        int value = 0;
        for (int i = chars.length-1;i >= 0;i--){
            switch (chars[i]){
                case 'I' : num1 = 1;break;
                case 'V' : num1 = 5;break;
                case 'X' : num1 = 10;break;
                case 'L' : num1 = 50;break;
                case 'C' : num1 = 100;break;
                case 'D' : num1 = 500;break;
                case 'M' : num1 = 1000;break;
            }
            if (num2 <= num1){
                value += num1;
            }else{
                value -=num1;
            }
            num2 = num1;
        }
        return value;
    }


}
