package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <简单的While语句>
 * @date 2022/7/2817:25
 * @desc
 */
public class WhileDemo01 {
    public static void main(String[] arges){
        int i = 0;
        int omega = 0;
        while (i<3){
            System.out.println("HelloWorld!!");
            // omega++;
            // System.out.println(omega);//  omega 死循环自增版本
            i++; //如果没有迭代语句,while内的条件永远满足,则会陷入死循环
        }
    }
}
