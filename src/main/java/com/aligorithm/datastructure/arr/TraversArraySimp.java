package com.aligorithm.datastructure.arr;

public class TraversArraySimp {
    public static void main(String[] args){
//        《遍历并打印数组，数组元素为空》
        int arr[] = {22,13,44,53};
        ptintArr(arr);
        System.out.println("------------");
        int arr2[] = {};
        ptintArr(arr2);
    }
    public static void ptintArr(int[] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            // if (i == arr.length-1){
            //     System.out.print(arr[i]);
            // }else{
            //     System.out.print(arr[i]+",");
            // }
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");//三木运算符版本
        }
        System.out.println("]");
    }
}
