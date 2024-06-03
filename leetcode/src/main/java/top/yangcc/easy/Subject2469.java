package top.yangcc.easy;

import com.google.gson.Gson;

/**
 * https://leetcode.cn/problems/convert-the-temperature/?envType=study-plan-v2&envId=primers-list
 *
 * 开氏度 = 摄氏度 + 273.15
 * 华氏度 = 摄氏度 * 1.80 + 32.00
 */
public class Subject2469 {


    public static double[] convertTemperature1(double celsius) {
        double a = celsius + 273.15;
        double b = celsius*1.80 + 32.00;
        return new double[]{a,b};
    }

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(convertTemperature1(36.50)));
        System.out.println(new Gson().toJson(convertTemperature1(122.11)));
    }
}
