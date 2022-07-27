package com.aligorithm.datastructure.arr;

public class ArrayMax {
//    遍历静态数组找到最大值
    public static void main(String[] args){
        int arr[] = {13,34,64,78,69,34};
        //设置一个参考值，从数组的第一个元素开始往后顺序比较，若大则替换max
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                //将大于max的数组元素赋值给max，让max始终保持最大值
                max = arr[i];
            }
        }
        System.out.print("该数组的最大值为"+max);
    }
}
