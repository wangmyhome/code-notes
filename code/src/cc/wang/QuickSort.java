package cc.wang;

/**
 *
 * 选择排序
 *
 * 思路：
 *  1.选出一个最小的数放在首位；
 *  2.在剩余的元素选出最小的放在已排序的的后面；
 *  3.重复第二个步骤直到结束。
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-06
 */
public class QuickSort {

    public static void main(String[] args) {
        int [] a = {10,21,21,2,3,23,23};
        selectSort(a);
    }


    public static int[] selectSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(a[min] > a[j]) {
                    min = j;
                }
            }
            //交换
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
}
