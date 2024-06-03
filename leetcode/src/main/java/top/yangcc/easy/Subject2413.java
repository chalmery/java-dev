package top.yangcc.easy;

import com.google.gson.Gson;

/**
 * 给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
 *
 *
 * 示例 1：
 *
 * 输入：n = 5
 * 输出：10
 * 解释：5 和 2 的最小公倍数是 10 。
 * 示例 2：
 *
 * 输入：n = 6
 * 输出：6
 * 解释：6 和 2 的最小公倍数是 6 。注意数字会是它自身的倍数。
 */
public class Subject2413 {


    public static int smallestEvenMultiple1(int n) {
        return n * (n % 2 == 0 ? 1 : 2);
    }

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(smallestEvenMultiple1(5)));
        System.out.println(new Gson().toJson(smallestEvenMultiple1(6)));
    }
}
