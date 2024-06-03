package top.yangcc.easy;

import com.google.gson.Gson;

/**
 * https://leetcode.cn/problems/add-two-integers/solutions/2394899/python3javacgorust-yi-ti-shuang-jie-shi-k0rbl/?envType=study-plan-v2&envId=primers-list
 *
 */
public class Subject2235 {


    /**
     * 1010 = 10
     * 0010 = 2
     *
     * 1100 = 12
     *
     * 1000 = 8
     * 0100 = 4
     * & 如果两位都是1，则结果为1；否则结果为0。
     * ^ 如果这一位上两个数的值不同（即一个为0，另一个为1），那么结果的这一位就是1。
     */
    public static int sum1(int num1, int num2) {
        while (num2 != 0) {
            int carry = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = carry;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(sum1(10,2)));
//        System.out.println(new Gson().toJson(sum1(-6,10)));
    }
}
