package com.utilDemo;

import java.util.Arrays;

/**
 * @author Dimension
 * @title <java.util.Arrays工具包的使用简单版>
 * @date 2022/8/117:16
 * @desc
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //    创建一个测试数组
        int[] ars = {18,34,56,3,5,12,20};

        //        输出数组的内存地址
        System.out.println("数组的内存地址是"+ars);

        //        输出数组内容的Api,估计是转换为字符串形式输出
        System.out.println("数组全元素结果如下:");
        System.out.println(Arrays.toString(ars));

        //        二分查找排序Api
        Arrays.sort(ars);
        System.out.println("排序后结果如下");
        System.out.println(Arrays.toString(ars));//再次输出
        int index = Arrays.binarySearch(ars,18);
        System.out.println(index);

//        若是没有经过排序的数组重中之重组则可能找不到
        int[] ars2 = {19,23,45,24,3,6};
        System.out.println(Arrays.binarySearch(ars2,24));
        System.out.println("可以看到索引完全是乱的不合法的");
    }

}
