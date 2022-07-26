package com.aligorithm.basic;

public class Narcissistic {
    /**
     * 水仙花数：属于自幂数的一种，它要求3位数，且各个位数的三次幂之和仍然等于自己。
     * 除此之外还有四叶玫瑰数、五角星数等；
     * */
    //水仙花数:1---999内有   153   370  371  407
    public static void main(String[] args){
        int count = 0;
        System.out.print("1-999中的水仙花数有");
        for(int i = 1;i<=999;i++){
            int g = i%10;
            int s = i/10%10;
            //目前这个算法没有办法排除1，容易把1也误判为水仙花数
            int b = i/100;
            if(g*g*g+s*s*s+b*b*b ==i){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println("水仙花数总共有"+count+"个");
    }
}
