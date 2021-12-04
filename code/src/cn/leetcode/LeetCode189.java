package cn.leetcode;

/**
 * 189. 轮转数组
 *
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-04
 */
public class LeetCode189 {

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5,6,7};
        //时间复杂度O(n) 空间复杂度O(1)
        rotate(a,3);
        System.out.println(a);
    }


    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

//    public static int [] rotate(int[] nums, int k) {
//        int length = nums.length;
//        k = k % length;
//        int [] res = new int[nums.length];
//        if(k!=0){
//            int p = 0;
//            int s = length - k;
//            for(int i = 0; i < length; i++){
//                if(i < s){
//                    res[k++] = nums[i];
//                }else {
//                    res[p++] = nums[i];
//                }
//            }
//            return res;
//        }
//        return nums;
//    }
}
