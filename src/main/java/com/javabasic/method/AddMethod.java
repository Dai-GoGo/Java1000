package com.javabasic.method;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <自己设计一个两数之和的方法-简单-理解方法的返回值类型含义>
 * @date 2022/8/215:44
 * @desc
 */
public class AddMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("您输入的两个数字的和为"+sum(a,b));
    }
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
