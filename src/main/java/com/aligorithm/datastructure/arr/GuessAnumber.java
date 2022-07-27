package com.aligorithm.datastructure.arr;
import java.util.*;
public class GuessAnumber {
    public static void main(String[] args){
        int arr[]=new int[5];
        Random r = new Random();
        //随机生成5次元素插入到数组中
        for (int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(20)+1;
        }
        //3.死循环给用户猜测
        Scanner sc = new Scanner(System.in);
        OUT:
        while(true){
            System.out.println("请猜测一个1-20之间的数字");
            int guessdata = sc.nextInt();
            //4.遍历数组，查看是否存在符合的元素
            for (int i = 0;i<arr.length;i++){
                if (arr[i] == guessdata){
                    System.out.println("您猜对啦！！该数据是第"+i+"个元素");
                    break OUT;
                }
            }
            System.out.println("抱歉，您猜错了，请重新猜测!");
        }
        // 5.输出数组中所有元素 ，给玩家对答案
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
