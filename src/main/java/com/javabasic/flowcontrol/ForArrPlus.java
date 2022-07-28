package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <增强型for循环+数组-下标版>
 * @date 2022/7/2817:21
 * @desc
 */
public class ForArrPlus {
//    增强型for循环+数组
    public static void main(String[] args) {
        int count = -1;
        String arrays[] = {"Peter","Zack","Lisa","Lily"};
        for (String element:arrays){
            count++;
            System.out.println("下标"+count+"对应的是"+element);
        }
    }
}
