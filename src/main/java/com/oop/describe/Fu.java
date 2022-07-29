package com.oop.describe;

/**
 * @author Dimension
 * @title <权限修饰符-权限范围初探>
 * @date 2022/7/2915:54
 * @desc 创建一个Fu类测试不同权限修饰符的作用范围
 */
public class Fu {
    //本类
    /**
     * 定义一个Fu类里面存放各种权限修饰符的发方法
     */
    /**
     * private方法:“公交车"本类中
     * */
    private void privateMethod(){
        System.out.println("---privateMethod Has Been Used----");
    }
    /**
     缺省方法：“公交车”，本类，同一个包的其他类中
     */
    void method(){
        System.out.println("---Method Has Been Used----");
    }
    /**
     * public方法:“公交车"本类中
     * */
    public void publicMethod(){
        System.out.println("---publicMethod Has Been Used----");
    }
    /**
     protected方法：本类，同一个包的其他类中，不同包子类
     */
    protected void protectedMethod(){
        System.out.println("---protectedMethod Has Been Used----");
    }
    public static void main(String[] args){
        Fu f = new Fu();
        f.privateMethod();
        f.publicMethod();
        f.protectedMethod();
        f.method();
    }
}
