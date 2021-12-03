package cn.leetcode;

/**
 *
 * 122. 买卖股票的最佳时机 II
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-03
 */
public class LeetCode122 {

    public static void main(String[] args) {
        int [] a = {7,6,4,3,1};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int num = prices[i] - prices[i-1];
            if(num > 0){
                maxProfit = maxProfit + num;
            }
        }
        return maxProfit;
    }

}
