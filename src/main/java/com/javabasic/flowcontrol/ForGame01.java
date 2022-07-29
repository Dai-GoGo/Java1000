package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <求1-10奇数之和>
 * @date 2022/7/2817:53
 * @desc   2种算法  答案应该是25
 */
public class ForGame01 {
    public static void main(String[] args){
        int Sum = 0;//在循环外定义一个sum接收奇数之和
        for (int i = 1;i<=10;i++){//筛选出1----10的数字
            if(i%2==1){//通过取余,筛选出1---10中的奇数
                Sum +=i;//求奇数之和
            }
        }
        System.out.println("1---10奇数累加和的第一求法执行结果为"+Sum);
        int Sum2 = 0;
        for(int i = 1;i<=10;i+=2){//通过累加2,使扫描恰好每次都落在奇数上,人为的对奇数做判断
            Sum2 +=i;
        }
        System.out.println("1---10奇数累加和的第二求法结果为"+Sum2);
    }
}
