package com.javabasic.flowcontrol;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

/**
 * @author Dimension
 * @title <Switch语句基础版>
 * @date 2022/7/2816:08
 * @desc    模拟一个简单版的根据传入的Code值返回相应的报错内容
 */
public class SwitchDemo01 {
    // code输入模块
    public static void main(String[] args){
        //接收传入的responseCode
        System.out.println("请输入RequestCode---");
        Scanner sc = new Scanner(System.in);
        int rps = sc.nextInt();
        try{
            if (checkCode(rps) !=null){
                System.out.println(checkCode(rps));
            }else{
                System.out.println("未知异常1！请联系网站管理员");
            }
        }catch(Exception ex){
            System.out.println("未知异常！请联系网站管理员");
        }
    }
    public static String checkCode(int code){
        //由response 异常code 解析返回对应状态
        String res = null;
        switch(code){
            case 200:
                res = "成功！已接受";
            break;
            case 304:
                res = "异常-未修改";
            break;
            case 403:
                res = "异常-拒绝访问！！";
            break;
            case 404:
                res = "资源不存在！";
            break;
        }return res;
    }

}
