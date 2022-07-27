package com.aligorithm.datastructure.arr;

public class TraversStaticArr {
//    《遍历一个静态数组,求元素之和》
//    1.设置一个静态数组
//    2.for循环一个一个遍历并且输出
    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6,7};
        int sum = 0;
        for (int i = 0;i<+num.length;i++){
            System.out.print(num[i]+"\t");
            sum += num[i];
        }
        System.out.println("该数组的元素之和为"+sum);
    }
}

