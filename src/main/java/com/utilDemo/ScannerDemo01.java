package com.utilDemo;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <Scanner工具类的使用>
 * @date 2022/8/115:41
 * @desc 输入相应的信息，拼接输出录入的信息
 */
public class ScannerDemo01 {
    public static void main(String[] args) {
        System.out.println("请输入您的姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//扫描输入的字符串类型数据使用的是next()方法
        System.out.println("请输入您的您的年龄");
        Scanner sc2 = new Scanner(System.in);
        int age = sc2.nextInt();
        System.out.println("欢迎"+age+"岁的"+name+"注册本系统!");

    }
}
