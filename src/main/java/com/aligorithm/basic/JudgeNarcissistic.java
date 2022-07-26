package com.aligorithm.basic;
import java.util.Scanner;

public class JudgeNarcissistic {
    //输入一个x-y的范围，即可查找到x-y之间所有的水仙花数
    //中南大学pipioj水仙花数
    public static void main(String[] args){
        System.out.println("请输入m");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            System.out.print("请输入n");
            int n = sc.nextInt();
            if (m<100||n>999){
                System.out.println("m必须大于等于100,而且n必须小于999!!");
            }else if(m>n){
                System.out.println("m必须小于等于n!!");
            }else{
                int count = 0;
                for(int i = m;i<=n;i++){
                    // System.out.println(i);//遍历出m到n的所有数
                    int g = i%10;
                    int s = i/10%10;
                    int b = i/100;
                    if(g*g*g+s*s*s+b*b*b==i){
                        System.out.println(i+"\t");
                        count++;
                    }
                }
                if (count==0){
                    System.out.println("no");
                }
            }
        }
    }
}
