package com.aligorithm.datastructure.arr;

public class DynamicArr {
//    动态数组基础
    public static void main(String[] args){
        int[] num = new int[3];//动态创建一个长度为3的数组
        num[0] = 10;
        num[1] = 12;//为数组指定索引位置元素插入值
        System.out.println(num[0]);//输出校验
        System.out.println(num[1]);
        System.out.println("数组的长度为"+num.length);
    }
}
