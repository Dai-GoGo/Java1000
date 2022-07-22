package com.javabasic.tool;

public class ToUpperCaseEmp {
    //字符串大小写转换的方法
    public static void main(String[] args){
        String str = "string hello world";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串："+str);
        System.out.println("转化为大写："+strUpper);
    }
}
