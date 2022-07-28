package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <求1-10奇数之和>
 * @date 2022/7/2817:53
 * @desc   2种算法  答案应该是25
 */
public class ForGame01 {
    public static void main(String[] args) {
//        弄出1-10的数字
        int sum = 0;
        int sum2 = 0;
        for (int i = 1;i<=10;i++){
            if (i%2 == 1){
                //           2.找出奇数
                sum = sum+i;
                //           3.求和
            }
        }
        System.out.println("1-10奇数之和等于"+sum);
    }
}
