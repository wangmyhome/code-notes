package cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 两数之和(1)
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-07
 */
public class LeetCode1 {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3,4,6,1}, 9);
        System.out.println(ints);
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length; i++){
            if(map.containsKey(nums[i])){
                //补数下标
                res[0] = i;
                //数组元素下标
                res[1] = map.get(nums[i]);
                return res;
            }
            //key:补数(寻找的数) = 目标数-遍历数组元素  value:数组元素下标
            map.put(target - nums[i],i);
        }
        //时间复杂度：O(N的平方)
//        for (int i = 0;i < nums.length; i++){
//            for(int j = i+1; j < nums.length;j++){
//                if(nums[i]+nums[j] == target){
//                    res[0] = i;
//                    res[1] = j;
//                }
//            }
//        }
        return res;
    }

}
