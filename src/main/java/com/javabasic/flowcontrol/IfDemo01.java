package com.javabasic.flowcontrol;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <If语句基本Demo>
 * @date 2022/7/2815:18
 * @desc 根据输入的心率值返回相应的结果; 心率位于60-100之间为正常心率
 * @KeyWords If、Exception、oop
 */
public class IfDemo01 {
    //If面向对象版
    public static void main(String[] args){
        System.out.println("请输入您的心率————");
        try{
            Scanner sc = new Scanner(System.in);
            int heartbeat = sc.nextInt();
            System.out.println(heartcheck(heartbeat));
        }catch (Exception inputE){
            System.out.println("您的输入有误！！请重新输入😡");
        }
    }
    public static String heartcheck(int beat){
        //检测心率的方法
        String r = "结果待检测";
        if (beat>=60&&beat<=100) {
            r = "安全❀❀";
        }else {
            r = "危险！！！";
        }
        return r;
    }
}
