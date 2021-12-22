package cn.leetcode;

/**
 * 88.合并两个有序数组
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-21
 */
public class LeetCode88 {


    public static void main(String[] args) {
        merge(new int[]{1,4,6,9,21,3,5} , 4, new int[]{2,3,5},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }


    }
}
