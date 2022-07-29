package com.oop.describe.eachson;
import  com.oop.describe.Fu;
/**
 * @author Dimension
 * @title <不同包下的方法调用>
 * @date 2022/7/2916:16
 * @desc
 */
public class DescribeTest02 {
    public static void main(String[] args) {
        //其他包的无关类中
        Fu f = new Fu();
        // f.privateMethod();//Test02.java:6: 错误: privateMethod() 在 Fu 中是 private 访问控制
        // f.method();//Test02.java:8: 错误: method()在Fu中不是公共的; 无法从外部程序包中对其进行访问
        // f.protectedMethod();///Test02.java:8: 错误: protectedMethod() 在 Fu 中是 protected 访问控制
        f.publicMethod();
    }
}
