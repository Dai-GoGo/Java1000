package com.javabasic.method;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <写一个判断奇数偶数的方法>
 * @date 2022/8/215:36
 * @desc
 */
public class OddEven {
    public static void main(String[] args) {
        int b = 1;
        while (b==1){
            System.out.println("请随便输入一个数判断奇偶性");
            Scanner sc = new Scanner(System.in);
            oddeven(sc.nextInt());
        }
    }
    public static void oddeven(int i){
        if (i%2==0){
            System.out.println("您输入的数为:"+i+",该数为偶数");
        }else{
            System.out.println("您输入的数为:"+i+"该数为奇数");
        }
    }
}
