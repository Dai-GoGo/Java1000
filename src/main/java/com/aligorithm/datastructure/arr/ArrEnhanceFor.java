package com.aligorithm.datastructure.arr;

/**
 * @author Dimension
 * @title <数组的增强型For循环>
 * @date 2022/7/2816:57
 * @desc
 */
public class ArrEnhanceFor {
    public static void main(String[] args){
        //格式：元素数据类型 元素:数组名
        int[] arr = {1,2,3,4,5,6,9};
        for (int element:arr){
            System.out.print(element+"\t");
        }
        String[] arr2 = {"Spring","夏","Autumn","冬"};
        for (String season:arr2){
            System.out.print(season+"\t");
        }
    }

}
