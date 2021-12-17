package cn.leetcode;

/**
 * 1518换酒问题
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-17
 */
public class LeetCode1518 {


    public static void main(String[] args) {
        System.out.println(numWaterBottles(10, 6));
    }

    /**
     *
     * @param numBottles  当前瓶数
     * @param numExchange 可兑换一瓶新的数量
     * @return
     */
    public static int numWaterBottles(int numBottles, int numExchange) {
        //总数
        int sum = numBottles;
        //空瓶
        int kong = numBottles;
        while (kong/numExchange != 0){
            int xin = kong/numExchange;
            sum += xin;
            kong = kong - xin*numExchange + xin;
        }
        System.out.println(sum);
        return numBottles+(numBottles-1)/(numExchange-1);
    }
}
