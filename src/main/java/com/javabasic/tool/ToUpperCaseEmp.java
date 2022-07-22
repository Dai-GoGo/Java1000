package com.javabasic.tool;

public class ToUpperCaseEmp {
    public static void main(String[] args){
        String str = "hello world";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串："+str);
        System.out.println("转化为大写："+strUpper);
    }
}
