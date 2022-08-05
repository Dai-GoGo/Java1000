package com.oop.abstractdemo1;

/**
 * @author Dimension
 * @title <name>
 * @date 2022/8/517:30
 * @desc
 */
public class Dog extends Animal{
    String name;
    @Override
    void run() {
        System.out.println("狗狗跑得很快噢");
    }
    public void introduce(){
        System.out.println("MyName is "+name);
    }
}
