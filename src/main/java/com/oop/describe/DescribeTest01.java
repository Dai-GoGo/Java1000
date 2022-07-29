package com.oop.describe;

/**
 * @author Dimension
 * @title <name>
 * @date 2022/7/2916:13
 * @desc
 */
public class DescribeTest01 {
    public static void main(String[] args) {
        Fu f = new Fu();
        // f.privateMethod();//Test01.java:6: 错误: privateMethod() 在 Fu 中是 private 访问控制
        f.method();
        f.publicMethod();
        f.protectedMethod();
    }
}
