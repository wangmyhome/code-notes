package cn.leetcode;

import java.util.Arrays;

/**
 * 移除元素
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-05
 */
public class LeetCode27 {


    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int l = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[l++] = nums[i];
            }
        }
        nums = Arrays.copyOf(nums,l);
        return l;
    }
}
