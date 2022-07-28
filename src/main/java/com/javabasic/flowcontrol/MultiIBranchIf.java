package com.javabasic.flowcontrol;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <If多分支语句>
 * @date 2022/7/2815:45
 * @desc
 */
public class MultiIBranchIf {
    //if多分枝语句
    public static void main(String[] args){
        //成绩录入模块
        System.out.println("请输入一个成绩进行评判");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        //评判模块
        try {
            if (score>=0&&score<60){
                System.out.println("不及格");
            }else if(score>=60&&score<80){
                System.out.println("及格");
            }else  if(score>=80&&score<100){
                System.out.println("优秀！");
            }else{
                System.out.println("满分！无敌！");
            }
        }catch(Exception ex){
            System.out.println("输入异常！请重新输入");
        }

    }
}
