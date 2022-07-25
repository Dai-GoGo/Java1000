package com.javabasic.tool;

public class ToUpperCaseEmp {
    //字符串大小写转换的方法一.toUpperCase()
    public static void main(String[] args){
        String str = "string hello world";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串："+str);
        System.out.println("转化为大写："+strUpper);
        //同理补充小写转换为大写的方法
        String strLower = str.toLowerCase();
        System.out.println("为小写结果为"+strLower);
    }
}



