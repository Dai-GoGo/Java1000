package com.javabasic.method;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <简单累加方法+for循环>
 * @date 2022/8/216:13
 * @desc 设计一个累加方法,对于用户输入的数能够从1开始累加计算到用户输入的数为止;
 */
public class accumulation {
    public static void main(String[] args) {
        System.out.println("请输入一个数用于计算从1到该数的累加之和");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        accum(i);//调用累加方法
        System.out.println("从1到"+i+"的累加之和为"+accum(i));
    }
    public static int accum(int max){
//        计算累加的方法,返回整型结果
        int sum =0;
        for (int i=1;i<=max;i++){
            sum += i;
        }
        return sum;
    }
}
