package com.aligorithm.datastructure.arr;

public class SortBubble {
    /**   [冒泡排序-数组-静态-简单版]
     *
     */
    public static void main(String[] args){
        int[] arr = {5,2,3,1};

        for (int i=0;i<arr.length - 1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    //将大的那个往后放
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
