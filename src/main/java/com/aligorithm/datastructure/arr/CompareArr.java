package com.aligorithm.datastructure.arr;

public class CompareArr {
/**    比较两个静态数组是否相同:
    tips数组的元素完全相同才是数组的相同
 */
public static void main(String[] args){
    int[] arr1 = {10,12,13};
    int[] arr2 = {10,120,13};
    System.out.println(vs(arr1, arr2));
}
    public static boolean vs(int[]arr1,int[]arr2){
        if (arr1.length==arr2.length){
            for (int i = 1;i<arr1.length;i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
