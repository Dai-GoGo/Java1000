package com.aligorithm.datastructure.arr;
import java.util.Random;
import java.util.Scanner;

public class RandSorttool {
    //随机排序小工具,打乱编号
    public static void main (String[] args){
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<codes.length;i++){
            //正式录入工号
            System.out.print("请您输入第"+(i+1)+"个员工编号");
            int code = sc.nextInt();
            //插入到数组中
            codes[i] = code;
        }
        //遍历数组中的每个元素，然后随机一个索引数，将该元素与随机的索引元素进行替换；
        Random r = new Random();
        for (int i=0;i<codes.length;i++){
            int index  = r.nextInt(codes.length);
            //定义一个临时变量存储index位置处的值
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        //4. 遍历数组元素输出随机排序后的结果
        for (int i = 0;i<codes.length;i++){
            System.out.print(codes[i]+"\t");
        }
    }
}
