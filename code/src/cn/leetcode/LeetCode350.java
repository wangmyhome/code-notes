package cn.leetcode;

import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 *
 * 350. 两个数组的交集 II
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 *
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-01
 */
public class LeetCode350 {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(intersect);

    }

    //map集合和list  2 ms	38.5 MB	Java
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int i: nums1) {
            Integer count = map1.get(i);
            if(count == null){
               map1.put(i,1);
            }else {
                map1.put(i,++count);
            }
        }
        List<Integer> res = new ArrayList();
        for (Integer i: nums2) {
            Integer count = map1.get(i);
            if(count!=null && count != 0){
                res.add(i);
                map1.put(i,--count);
            }
        }
        int [] a = new int[res.size()];
        for(int z=0; z < res.size(); z++){
            a[z] = res.get(z);
        }
        return a;
    }

      //list集合 14 ms	38.8 MB
//    public static int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> l1 = new ArrayList();
//        for (Integer i: nums1) {
//            l1.add(i);
//        }
//        List<Integer> res = new ArrayList();
//        for (int i : nums2) {
//            if(l1.contains(i)){
//                l1.remove(Integer.valueOf(i));
//                res.add(i);
//            }
//        }
//        int [] a = new int[res.size()];
//        for(int z=0; z < res.size(); z++){
//            a[z] = res.get(z);
//        }
//        return a;
//    }


    //lambada表达式方式
//    public static int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> l1 = new ArrayList();
//        for (Integer i: nums1) {
//            l1.add(i);
//        }
//        List<Integer> l2 = new ArrayList();
//        for (Integer i: nums2) {
//            l2.add(i);
//        }
//        List<Integer> res = l1.stream().filter(item -> l2.contains(item)).collect(toList());
//        int [] a = new int[res.size()];
//        for(int z=0; z < res.size(); z++){
//            a[z] = res.get(z);
//        }
//        return a;
//    }
}
