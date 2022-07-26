package com.aligorithm.basic;

import java.util.Scanner;

public class Shuixian {

    public static void main(String[] args){
        //中南oj标准答案
        System.out.println("---TheProgramIsOn---");
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt(),n=sc.nextInt();
            int number=0,s=0,d=0;
            int[] shu=new int[1000];
            if(m>n){
                int temp=m;
                m=n;
                n=temp;
            }
            for(int i=m;i<=n;i++){
                int   num1=i/100;
                int   num2=i%100/10;
                int   num3=i%10;
                if(i==num1*num1*num1+num2*num2*num2+num3*num3*num3){
                    number++;
                    shu[s]=i;
                    s++;
                }
            }
            if(number==0){
                System.out.println("no");
            }else{
                for(int i=0;i<shu.length;i++){
                    if(shu[i]!=0){
                        d++;
                        if(d==number){
                            System.out.print(shu[i]);
                        }else{
                            System.out.print(shu[i]+" ");
                        }
                    }//使用数组保证了数据的先后
                }
                System.out.println();
            }
        }
    }
}
