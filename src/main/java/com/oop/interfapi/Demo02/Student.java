package com.oop.interfapi.Demo02;

/**
 * @author Dimension
 * @title <理解继承-初步-学生继承类>
 * @date 2022/8/118:04
 * @desc
 */
public class Student extends People{
    public void writeInfo(){
//        注意这个不是静态方法,因为需要动态获取name(猜测)
        System.out.println(getAge()+"岁的"+getName()+"写下了学习v方法");

    }}
