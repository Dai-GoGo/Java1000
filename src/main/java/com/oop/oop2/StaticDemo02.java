package com.oop.oop2;

/**
 * @author Dimension
 * @title <静态方法02-初始值+书讯探究>
 * @date 2022/8/416:28
 * @desc
 */
public class StaticDemo02 {
    private String name;
//    无参构造器
    public StaticDemo02(){
        System.out.println("--------无参构造器被执行了--------慢");
    }
//    静态代码块
    {
        System.out.println("--------实例代码块被执行了--------快");
        name = "MIchel";
    }
//  主方法测试
    public static void main(String[] args) {
        StaticDemo02 s1 = new StaticDemo02();
        StaticDemo02 s2 = new StaticDemo02();
        System.out.println("此时请告诉我你用实例代码块赋值的名字是————"+s1.name+"⭐!!!!!!"+"第二个对象的名字也叫——————"+s2.name+"⭐!!!!");
    }
}
