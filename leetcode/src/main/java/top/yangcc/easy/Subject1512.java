package top.yangcc.easy;

import com.google.gson.Gson;

/**
 给你一个整数数组 nums 。

 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。

 返回好数对的数目。
 */
public class Subject1512 {


    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(numIdenticalPairs(new int[]{1,2,3,1,1,3})));
        System.out.println(new Gson().toJson(numIdenticalPairs(new int[]{1,1,1,1})));
        System.out.println(new Gson().toJson(numIdenticalPairs(new int[]{1,2,3})));
    }
}
