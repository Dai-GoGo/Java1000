package com.aligorithm.datastructure.arr;

public class StaticArrBasic {
//    静态数组的基本属性 2022年7月27日
    public static void main(String[] args){
        int i = 0;
        double[] scores = new double[]{59.5,67,78,97.5,86};
        //访问数组的内存地址
        System.out.println("数组的内存地址："+scores);
        //访问数组的特定元素
        System.out.println("数组的第一个元素是："+scores[0]);
        //对数组指定的元素进行赋值
        scores[0] = 62;
        System.out.println("数组的第一个元素赋值后是："+scores[0]);
        //访问数组的长度
        System.out.println("数组的长度是："+scores.length);
        i = scores.length-1;
        System.out.println("数组的最大索引是："+i);
    }
}
