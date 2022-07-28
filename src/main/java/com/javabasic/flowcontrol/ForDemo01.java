package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <For循环理解-条件&执行次数的关系>
 * @date 2022/7/2817:49
 * @desc
 */
public class ForDemo01 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
//            相当于执行倒数0、1、2、3、4，总共5次
            System.out.println("Hello World!");
        }
        System.out.println("_________________应该只输出5个");
        for (int i=1;i<5;i++){
//            相当于执行倒数1、2、3、4，总共4次
            System.out.println("Hello World!!");
        }
        System.out.println("_________________应该只输出4个");
        for(int i = 1;i<=5;i++){
//            相当于执行倒数1、2、3、4、5，总共5次
            System.out.println("Hello World!!!");
        }
        System.out.println("_________________应该依旧输出5个");
        for(int i = 1;i<=5;i+=2){
//            相当于执行倒数1、3、5，总共3次
            System.out.println("Hello World!!!!!");
        }
        System.out.println("_________________应该只能输出3个了");
    }
}
