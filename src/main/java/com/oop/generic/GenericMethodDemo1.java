package com.oop.generic;

/**
 * @author Dimension
 * @title <泛型方法简单demo>
 * @date 2022/8/115:52
 * @desc 创建一个接受各类数据的泛型方法，用于接受不同v数据类型的数组，并对传入的 各类数据进行打印
 */
public class GenericMethodDemo1 {
    public static <E> void printArray(E[] intputArray){
        //创建一个打印泛型数组的方法
        for (E element:intputArray){
            System.out.printf("%s",element);
            System.out.printf(" ");
        }
    }

    public static void main(String[] args) {
//        创建不同数据类型的数组:Integer Double 、Character
        Integer[] integers = {1,2,3,4,5,6,};
        Double[] doubles = {0.1,0.2,0.3,0.4,0.5,0.6};
        Character[] characters = {'A','B','C','D','E','F'};

//        调用上面定义的printArray方法打印不通数组
        System.out.println("Integer类型的数组为：");
        printArray(integers);
        System.out.println(" ");

        System.out.println("Double类型的数组为：");
        printArray(doubles);
        System.out.println(" ");

        System.out.println("Charactre类型的数组为:");
        printArray(characters);
        System.out.println(" ");

        System.out.println("打印完毕！");
    }
}
