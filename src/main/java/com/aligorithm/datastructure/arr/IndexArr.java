package com.aligorithm.datastructure.arr;

public class IndexArr {
//    1.准备一个数组
/**   2.写一个根据数字返回索引的方法:
 *      思路：
 *      通过比对arr[i]是否与输入的num相等
 *      若相等返回i即可;若遍历完都没有则返回-1
 **/
    public static void main(String[] args){
//        主方法
        int num[] = {1,2,3,4,5,6,9};
        int index = IndexSearch(num,2);
        System.out.println("您输入的数字索引为"+index);
    }
    public static int IndexSearch(int arr[],int num){
        for(int i = 0;i<arr.length;i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
