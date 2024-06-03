package top.yangcc.easy;

import com.google.gson.Gson;

/**
 给你两个整数，n 和 start 。
 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 请返回 nums 中所有元素按位异或（XOR）后得到的结果。

 ^ 如果这一位上两个数的值不同（即一个为0，另一个为1），那么结果的这一位就是1。
 */
public class Subject1486 {


    public static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ (start + 2 * i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(xorOperation(5,0)));
        System.out.println(new Gson().toJson(xorOperation(4,3)));
        System.out.println(new Gson().toJson(xorOperation(1,7)));
    }
}
