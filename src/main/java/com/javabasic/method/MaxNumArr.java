package com.javabasic.method;

/**
 * @author Dimension
 * @title <求数组中最大元素的方法>
 * @date 2022/8/216:22
 * @desc
 */
public class MaxNumArr {
    public static void main(String[] args) {
        int[] ars = {11,22,33,64,99,75,76,87};
        int max = findMax(ars);
        System.out.println("数组中最大的元素为"+max);
    }
    public static int findMax(int[] arr){
//        采取的算法:从第一个开始遍历,用第一个元素 与之后的元素进行比较换位;
        int max =arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
