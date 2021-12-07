package cc.wang;

/**
 * 插入排序
 *
 * 思路：
 *  遍历数组，判断第一个和第二个谁小，小的放在前面，
 *  然后判断第三个和前面一个对比，如果比前面一位值小，再遍历对比前面一位，一直与前面一位比较，直到比前面一位数值大，放在已排序的序列后面。
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-07
 */
public class InsertSort {

    public static void main(String[] args) {
        int [] num1 = {9,6,3,5,8};
        int[] ints = insertSort(num1);
        System.out.println(ints);
    }

    public static int[] insertSort(int [] nums){
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0){
                if(nums[j] < nums[j-1]){
                    nums[j] = nums[j] ^ nums[j-1];
                    nums[j-1] = nums[j] ^ nums[j-1];
                    nums[j] = nums[j] ^ nums[j-1];
                    j--;
                }else {
                    break;
                }
            }
        }
        return nums;
    }

}
