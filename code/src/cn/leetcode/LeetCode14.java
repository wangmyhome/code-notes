package cn.leetcode;

/**
 * 14. 最长公共前缀
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-02
 */
public class LeetCode14 {

    public static void main(String[] args) {
        String [] a = {"ab", "a"};
        System.out.println(longestCommonPrefix(a));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String minStr = strs[0];
        for (String str : strs){
            while (!str.startsWith(minStr)){
                if(minStr.length() == 0){ return "";}
                //公共前缀不匹配就让它变短！
                minStr = minStr.substring(0,minStr.length()-1);
            }
        }
        return minStr;
    }
}
