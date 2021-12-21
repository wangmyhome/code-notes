package cn.leetcode;

import java.util.Arrays;

/**
 * 26.删除数组重复元素
 * 双指针法
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-21
 */
public class LeetCode26 {


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 3,3, 7, 26}));
    }
    public static int removeDuplicates(int[] nums) {

        if(null == nums && nums.length == 0){
            return 0;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length){
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        nums = Arrays.copyOf(nums,i+1);
        System.out.println(nums);
        return i+1;
    }
}
