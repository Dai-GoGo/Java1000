package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <利用For循环求和>
 * @date 2022/7/2817:12
 * @desc
 */
public class ForSum {
    //for循环求和
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i<=100;i++){
            sum = sum+i;// 这里使用sum+=sum+i时会出现负数结果，🚀🎈
        }
        System.out.println(sum);
    }
}
