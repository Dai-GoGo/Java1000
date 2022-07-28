package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <普通型for循环和增强型for循环比较>
 * @date 2022/7/2817:44
 * @desc
 */
public class ForBasicvsEnhan {
    public static void main(String[] args){
        //for循环增强型与普通型的比较
        int num[] = {1,2,3,4,5,6};
        for (int count = 0; count<num.length;count++){
            System.out.print(num[count]+"\t");
        }
        System.out.print("\n");
        // int count = 0;(这里的count已经在上一个普通循环中被初始化过，所以不需要再初始化了);
        for (int elements:num){
            System.out.print(elements+"\t");
        }
    }
}
