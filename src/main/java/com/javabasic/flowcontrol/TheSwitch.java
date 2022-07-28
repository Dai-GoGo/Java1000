package com.javabasic.flowcontrol;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <name>
 * @date 2022/7/2816:54
 * @desc("2022年6月16日更新内容：基础的if语句小program（根据输入数字做判断）\n"+
 * "2022年6月17日更新内容：加入了一个简单的 try catch 异常处理语句-处理有问题的输入格式");
 */
public class TheSwitch {
    public static void main(String[] args){
        // 根据输入的数字输出相应的星期
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch(i){
            case 1:
                System.out.println("今天周1");
                break;
            case 2:
                System.out.println("今天周2");
                break;
            case 3:
                System.out.println("今天周3");
                break;
            case 4:
                System.out.println("今天周四");
                break;
            case 5:
                System.out.println("今天周五");
                break;
            case 6:
                System.out.println("今天周六");
                break;
            case 7:
                System.out.println("今天周七");
                break;
        }
}}
