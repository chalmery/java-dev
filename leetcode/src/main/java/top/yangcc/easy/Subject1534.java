package top.yangcc.easy;

import com.google.gson.Gson;

/**
 给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。

 如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。

 0 <= i < j < k < arr.length
 |arr[i] - arr[j]| <= a
 |arr[j] - arr[k]| <= b
 |arr[i] - arr[k]| <= c
 其中 |x| 表示 x 的绝对值。

 返回 好三元组的数量 。
 */
public class Subject1534 {


    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i<j && j<k && Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(countGoodTriplets(new int[]{3,0,1,1,9,7},7,2,3)));
        System.out.println(new Gson().toJson(countGoodTriplets(new int[]{1,1,2,2,3},0,0,1)));
    }
}
