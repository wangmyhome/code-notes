package cn.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15.三数之和
 *
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-08
 */
public class LeetCode15 {



    public static void main(String[] args) {
        int [] a ={-1,0,1,2,-1,-1,-4};
        List<List<Integer>> lists = threeSum(a);
        System.out.println(lists);
    }



    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int target = 0 - nums[i];//目标数
            int l = i + 1;//左
            int r = nums.length - 1;//右
            if (nums[i] > 0) {
                break;
            }
            //判断是否遇到相邻元素相同的元素，遇到了就跳过遍历下一个元素，作为固定数
            if (i == 0 || nums[i] != nums[i - 1]) {
                while (l < r) {
                    if (nums[l] + nums[r] == target) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        //当排序的元素有相等的时候，左边的id向后移动一位。
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < target) {
                        //如果左边的元素和最右边的元素加起来还小于目标值，移动左边元素
                        l++;
                    } else {
                        //如果左边的元素和最右边的元素加起来还大于目标值，移动右边元素
                        r--;
                    }
                }
            }
        }
        return res;
    }
}
